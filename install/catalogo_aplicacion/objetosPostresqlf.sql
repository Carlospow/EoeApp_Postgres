
-- CREACION DE PREDICADOS DIFUSOS

CREATE FUZZY PREDICATE calidad_prof_alto ON 1 .. 5 AS ( 4 , 5 , infinite , infinite );
CREATE FUZZY PREDICATE calidad_prof_medio ON 1 .. 5 AS ( 2 , 3 , 3 , 4 );
CREATE FUZZY PREDICATE calidad_prof_bajo ON 1 .. 5 AS ( infinite , infinite , 1 , 2 );
CREATE FUZZY PREDICATE esfuerzo_alto ON 1 .. 5 AS (3,5,infinite,infinite);
CREATE FUZZY PREDICATE esfuerzo_medio ON 1 .. 5 AS (2,3,3,4);
CREATE FUZZY PREDICATE esfuerzo_bajo ON 1 .. 5 AS (infinite,infinite,1,2);
CREATE FUZZY PREDICATE utilidad_alto ON 1 .. 5 AS (4,5,infinite,infinite);
CREATE FUZZY PREDICATE utilidad_medio ON 1 .. 5 AS (2,2,4,4);
CREATE FUZZY PREDICATE utilidad_bajo ON 1 .. 5 AS (infinite,infinite,1,2);
CREATE FUZZY PREDICATE dificultad_alto ON 1 .. 5 AS (4,5,infinite,infinite);
CREATE FUZZY PREDICATE dificultad_medio ON 1 .. 5 AS (2,3,3,4);
CREATE FUZZY PREDICATE dificultad_bajo ON 1 .. 5 AS (infinite,infinite,1,3);
CREATE FUZZY PREDICATE expectativa_alto ON 1 .. 5 AS (4,5,infinite,infinite);
CREATE FUZZY PREDICATE expectativa_medio ON 1 .. 5 AS (2,3,3,4);
CREATE FUZZY PREDICATE expectativa_bajo ON 1 .. 5 AS (infinite,infinite,1,3);
CREATE FUZZY PREDICATE preparacion_alto ON 1 .. 5 AS (3,5,infinite,infinite);
CREATE FUZZY PREDICATE preparacion_medio ON 1 .. 5 AS (2,3,3,4);
CREATE FUZZY PREDICATE preparacion_bajo ON 1 .. 5 AS (infinite,infinite,1,2);


-- TIPO QUE REPRESENTA EL RESULTADO DE LAS FUNCIONES

CREATE TYPE resultados_m as (nombre_materia text,cod_materia text, promedio double precision);
CREATE TYPE resultados_p as (nombre_profesor text,ci_profesor integer, promedio double precision);

-- FUNCION QUE RETORNA LISTA DE MATERIAS CON SU PUNTUACION PROMEDIO PARA LA PREGUNTA $1, Y LA UNIDAD $2

CREATE OR REPLACE FUNCTION materia_pregunta(int,int) RETURNS SETOF resultados_m
AS 
$$ 
	SELECT  a.nombre ,p.codigo, -- argumento 1 cual tabla
	       ((sum((id_respuesta -2)* o_inscritos))/sum(o_inscritos)::real)
	       as puntuacion
	FROM profesor_encuesta p, historial h, unidad_asignatura u, asignatura a   
	WHERE (id_encuesta=1 or id_encuesta=4) 
	      and (p.id_prof_encuesta = h.id_prof_encuesta)
	      and (u.codigo = p.codigo) 
	      and (p.codigo = a.codigo)
	      and (a.codigo = u.codigo)
	      and id_pregunta=$1 -- argumento 2 cual pregunta
	      and u.id_unidad = $2 -- argumento 3 cual unidad
	GROUP BY p.codigo,a.nombre; --argumento 1
$$
LANGUAGE SQL;


-- FUNCION QUE RETORNA LISTA DE PROFESORES, CON SU PUNTACION PROMEDIO PARA LA PREGUNTA $1

CREATE OR REPLACE FUNCTION profesor_pregunta(int) RETURNS SETOF resultados_p
AS 
$$ 
	SELECT prof_cedula, 
	       ((sum((id_respuesta -2)* o_inscritos))/sum(o_inscritos)::real)
	       as puntuacion
	FROM profesor_encuesta p, historial h  
	WHERE (id_encuesta=1 or id_encuesta=4) 
	      and (p.id_prof_encuesta = h.id_prof_encuesta) 
	      and id_pregunta=$1
	GROUP BY prof_cedula; 
$$
LANGUAGE SQL;

-- TABLAS AUXILIARES PARA RESOLVER EL PROBLEMA DE LA RESOLUCION DE MEMBRESIA SOBRE FUNCIONES DE AGREGACION

CREATE TABLE materias_dificultad AS
(SELECT * FROM materia_pregunta(30,50));

CREATE TABLE materias_esfuerzo AS
(SELECT * FROM materia_pregunta(23,50));

CREATE TABLE materias_utilidad AS
(SELECT * FROM materia_pregunta(26,50));

CREATE TABLE profesor_desempenio AS
(SELECT * FROM profesor_pregunta(20));

CREATE TABLE materias_expectativa AS
(SELECT * FROM materia_pregunta(24,50));

CREATE TABLE materias_preparacion AS
(SELECT * FROM materia_pregunta(22,50));
-- TABLA AUXILIAR QUE PERMITE LA UNION DE LAS TABLAS ANTERIORES EN UNA SOLA PARA CONSULTAS MEZCLADAS DE PROFESOR Y MATERIA.

CREATE TABLE profesor_asignatura AS
(SELECT distinct prof_cedula, codigo
FROM profesor_encuesta);


CREATE TABLE AUX AS SELECT pa.prof_cedula, pa.codigo ,p.promedio as prom_prof, m.promedio as prom_mat        
FROM profesor_asignatura pa, profesor_desempenio p , materias_dificultad m
WHERE pa.prof_cedula = p.ci_profesor and pa.codigo=m.materia;

CREATE TABLE AUX_2 AS SELECT p.ci_profesor, mu.materia as utilidad, p.promedio as prom_prof , mu.promedio as prom_mat 
	FROM profesor_desempenio p, materias_utilidad mu, profesor_asignatura pa
	WHERE mu.materia = pa.codigo and p.ci_profesor = pa.prof_cedula;

	






