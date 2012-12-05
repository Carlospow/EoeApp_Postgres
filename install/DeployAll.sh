#!/bin/bash

echo "INICIANDO INSTALACION DE LA BASE DE DATOS" | tee -a log_instalacion

echo "CARGANDO CATALOGO DE LA APLICACION (ESTO TARDARA VARIAS DECENAS DE MINUTOS)" | tee -a log_instalacion

psql --command "\i catalogo_aplicacion/eoeCreate.sql" >> log_instalacion

for i in `ls catalogo_aplicacion/eoeLoad*.sql`
do
echo "CARGANDO SCRIPT $i" | tee -a log_instalacion
psql --command "\i $i" >> log_instalacion
done

echo "CARGANDO OBJETOS AUXILIARES DE LA APLICACION Y PREDICADOS DIFUSOS"  | tee -a log_instalacion
psql --command "\i catalogo_aplicacion/objetosPostgresqlf.sql" >> log_instalacion


echo "INSTALACION DE BASES DE DATOS TERMINADA" | tee -a log_instalacion
