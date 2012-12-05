package controllers;

import play.*;
import play.mvc.*;
import java.util.Map;
import views.html.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class Application extends Controller {
  
    private static String user;
    
    public static double getRandom(double minimo, double maximo){
        return minimo + Math.random()*((maximo-minimo)+1);
    }


    public static String EjecutarConsulta(String consulta){

        try {
            
            Class.forName("org.postgresql.Driver");
 
        } catch (ClassNotFoundException e) {
 
            return ("<h1>Error</h1><p>No se pudo establecer conexión con el repositorio de datos debido a una falla en el controlador, "+
                    "por favor intente más tarde, en caso de que el problema persista, "+
                    "comuniquese con nuestro administrador mediante el correo wm@consulta.dii.usb.ve</p>");
            
        }
        
        
        Connection connection = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres","postgesql");
 
        } catch (SQLException e) {
 
            
            e.printStackTrace();
            return ("<h1>Error</h1><p>No se pudo establecer conexión con el repositorio de datos, "+
                    "por favor intente más tarde, en caso de que el problema persista, "+
                    "comuniquese con nuestro administrador mediante el correo wm@consulta.dii.usb.ve</p>");
            
        }


        StringBuffer res;
        
        
        try{
            pst = connection.prepareStatement(consulta);
            rs = pst.executeQuery();
            res=ConjuntoRes(rs);
            connection.close();
            
        }
        catch (Exception e){
            
            e.printStackTrace();
            return ("<h1>Error</h1><p>No se pudo procesar su pregunta de manera exitosa, "+
                    "por favor intente más tarde, en caso de que el problema persista, "+
                    "comuniquese con nuestro administrador mediante el correo wm@consulta.dii.usb.ve</p>");
        }
        
        
        return (res.toString());
        
        
    }
    





    public static StringBuffer ConjuntoRes(ResultSet obj){
	
        StringBuffer resultado = new StringBuffer();
        ResultSetMetaData datosRs = null;
        int numCols = 0;
        
        try{
            datosRs = obj.getMetaData();
            numCols=datosRs.getColumnCount();
        }
        catch (Exception e){
            e.printStackTrace();
            return resultado;
        }
        
        resultado.append("<table>");
        resultado.append("<thead><tr>");
        for(int i=1; i<= numCols; i++){
            try{
                
                resultado.append("<th>");
                if(datosRs.getColumnName(i).equals("Gr.Memb.")){
                    resultado.append("puntuacion");
                }
                else{
                    resultado.append(datosRs.getColumnName(i).replace('_',' '));
                }
                resultado.append("</th>");
            }
            catch (Exception e){
                e.printStackTrace();
                return resultado;
            }
            
        }
        resultado.append("</tr></thead>");

        
        
        try{
            while (obj.next()) {
                resultado.append("<tr>");
                for(int i=1; i <= numCols; i++){
                    resultado.append("<td>");
                    resultado.append(obj.getString(i));
                    resultado.append("</td>");
                }
                resultado.append("</tr>");
                
            }
        }
        catch (Exception e){
            e.printStackTrace();
            return resultado;
        }
        
        resultado.append("</table>");
        return resultado;
    }
    

    public static boolean verificarPredicado(String predicado){
        
        try {
            
            Class.forName("org.postgresql.Driver");
            
        }
        catch (ClassNotFoundException e) {
            
            System.out.println("Error, No se pudo conseguir el driver de postgres");
            e.printStackTrace();
            return false;
            
        }
        
        
        Connection connection = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres","postgresql");
 
        }catch (SQLException e) {
 
            System.out.println("No se puedo establecer conexion con la base de datos");
            e.printStackTrace();
            return false;
            
        }
        
        
        int existe;
        
        try{
            CallableStatement verificarP = connection.prepareCall("{ ? = call existe_predicado( ? ) }");
            verificarP.registerOutParameter(1, Types.INTEGER);
            verificarP.setString(2,predicado);
            verificarP.execute();
            existe = verificarP.getInt(1);
            connection.close();
            
        }
        catch(SQLException e){
            
            System.out.println("Hola soy bata");
            e.printStackTrace();
            return false;
            
        }
        
        if (existe == 0){
            return false;
        }
        else{
            return true;
        }
        
    }
    

    public static Result index() {
  
        
        //String user = session("id");
        if (session("id") == null) {
            int id = (int)getRandom(1.0,10.0);
            session("id",Integer.toString(id));
            //user = session("id");
        }
        return ok(index.render(session("id")));
    }
  
    public static Result consultaC(){
        if (session("id") != null){
            return ok(questions.render(session("id")));
        } else {
            return unauthorized("Debe iniciar session previamente");
        }
    }


    public static Result consultaS(){
	  
        if (session("id") != null){
            return ok(questions2.render(session("id")));
        } else {
            return unauthorized("Debe iniciar session previamente");
        }
    }
  


    public static Result preguntaUnoS(){
	  
        final Map<String, String[]> values = request().body().asFormUrlEncoded();

        String sesion=session("id");

        String predicado= values.get("p1")[0]+"_"+sesion;
        String consulta;
        
        
        // SI EXISTE UN PREDICADO PERSONALIZADO EN LA BD USARLO
        
        if(verificarPredicado(predicado)){
            consulta="SELECT codigo, nombre_materia " +
                "FROM materias_dificultad  " +
                "WHERE promedio = " + predicado +" ;";
        }
        else{   
            consulta = "SELECT codigo, nombre_materia " +
                "FROM materias_dificultad  " +
                "WHERE promedio = " + values.get("p1")[0] +" ;";
        }
        
        String respuesta=EjecutarConsulta(consulta);
        
        return ok(respuestas.render(respuesta));
    }

    public static Result preguntaDosS(){
	  
        final Map<String, String[]> values = request().body().asFormUrlEncoded();
        
        String sesion=session("id");
        
        String predicado= values.get("p2")[0]+"_"+sesion;
        String consulta;
        
        
        // SI EXISTE UN PREDICADO PERSONALIZADO EN LA BD USARLO
        
        if(verificarPredicado(predicado)){
            consulta="SELECT codigo, nombre_materia " +
                "FROM materias_esfuerzo  " +
                "WHERE promedio = " + predicado +" ;";
        }
        else{	
            
            consulta = "SELECT codigo, nombre_materia " +
                "FROM materias_esfuerzo  " +
                "WHERE promedio = " + values.get("p2")[0] +" ;";
            
        }
        
        String respuesta=EjecutarConsulta(consulta);
        
        return ok(respuestas.render(respuesta));
    }
    
    public static Result preguntaTresS(){
	  
        final Map<String, String[]> values = request().body().asFormUrlEncoded();
        
        String sesion=session("id");
        
        String predicado= values.get("p3")[0]+"_"+sesion;
        String consulta;
        
        
        // SI EXISTE UN PREDICADO PERSONALIZADO EN LA BD USARLO
        
        if(verificarPredicado(predicado)){
            consulta="SELECT codigo, nombre_materia " +
                "FROM materias_utilidad  " +
                "WHERE promedio = " + predicado +" ;";
        }
        else{
            
            consulta = "SELECT codigo, nombre_materia " +
                "FROM materias_utilidad  " +
                "WHERE promedio = " + values.get("p3")[0] +" ;";
        }
        
        String respuesta=EjecutarConsulta(consulta);
        
        
        return ok(respuestas.render(respuesta));
    }

    public static Result preguntaCuatroS(){
        
        final Map<String, String[]> values = request().body().asFormUrlEncoded();
 
        String sesion=session("id");
        
        String predicado= values.get("p4")[0]+"_"+sesion;
        String consulta;
        
        
        // SI EXISTE UN PREDICADO PERSONALIZADO EN LA BD USARLO
        
        if(verificarPredicado(predicado)){
            consulta="SELECT nombre_profesor " +
                "FROM profesor_desempenio  " +
                "WHERE promedio = " + predicado +" ;";
        }
        else{
            consulta = "SELECT nombre_profesor " +
                "FROM profesor_desempenio  " +
                "WHERE promedio = " + values.get("p4")[0] +" ;";
        }        
        
        String respuesta=EjecutarConsulta(consulta);
        
        
        return ok(respuestas.render(respuesta));
    }
    
    public static Result preguntaCincoS(){
        
        final Map<String, String[]> values = request().body().asFormUrlEncoded();
        
        String sesion=session("id");
        
        String predicado= values.get("p5")[0]+"_"+sesion;
        String consulta;
        
        
        // SI EXISTE UN PREDICADO PERSONALIZADO EN LA BD USARLO
        
        if(verificarPredicado(predicado)){
            consulta="SELECT codigo, nombre_materia " +
                "FROM materias_expectativa  " +
                "WHERE promedio = " + predicado +" ;";
        }
        else{
            consulta = "SELECT codigo, nombre_materia " +
                "FROM materias_expectativa  " +
                "WHERE promedio = " + values.get("p5")[0] +" ;";
        }
        
        String respuesta=EjecutarConsulta(consulta);
        
        
        return ok(respuestas.render(respuesta));
    }
    
    public static Result preguntaSeisS(){
        
        
        final Map<String, String[]> values = request().body().asFormUrlEncoded();
        
                
        String sesion=session("id");
        
        String predicado= values.get("p6")[0]+"_"+sesion;
        String consulta;
        
        
        // SI EXISTE UN PREDICADO PERSONALIZADO EN LA BD USARLO
        
        if(verificarPredicado(predicado)){
            consulta="SELECT codigo, nombre_materia " +
                "FROM materias_preparacion  " +
                "WHERE promedio = " + predicado +" ;";
        }
        else{
            //PREPARACION PREVIA
            consulta = "SELECT codigo, nombre_materia " +
                "FROM materias_preparacion  " +
                "WHERE promedio = " + values.get("p6")[0] +" ;";
            
        }
        String respuesta=EjecutarConsulta(consulta);
        
        
        return ok(respuestas.render(respuesta));
        
    }

    
    

    
    public static Result preguntaUnoC(){
        
        final Map<String, String[]> values = request().body().asFormUrlEncoded();
        
        String sesion=session("id");
        
        
        String predicado1= values.get("p1parte1")[0]+"_"+sesion;
        String predicado2= values.get("p1parte2")[0]+"_"+sesion;
        String consulta;		
        
        
        if(verificarPredicado(predicado1) && verificarPredicado(predicado2)){
            consulta="SELECT nombre_profesor, codigo, nombre_materia " +
                "FROM AUX " +
                "WHERE prom_prof= " + predicado2 + " and prom_mat= " + predicado1 + " ;";
        }
        else{
            
            consulta = "SELECT nombre_profesor, codigo, nombre_materia " +
                "FROM AUX " +
                "WHERE prom_prof= " + values.get("p1parte2")[0] + " and prom_mat= " + values.get("p1parte1")[0] + " ;";
        }
        String respuesta=EjecutarConsulta(consulta);
        
        
        return ok(respuestas.render(respuesta));
        
    }
    
    public static Result preguntaDosC(){
        
        final Map<String, String[]> values = request().body().asFormUrlEncoded();
        
        String sesion=session("id");
        
        // LOS PREDICADOS PERSONALIZADOS SON DE LA FORMA id_predicado, EJ: 0741051_dificultad_alto
        String predicado1= values.get("p2parte1")[0]+"_"+sesion;
        String predicado2= values.get("p2parte2")[0]+"_"+sesion;
        String consulta;		

        
        if(verificarPredicado(predicado1) && verificarPredicado(predicado2)){
            consulta="SELECT mu.codigo ,mu.nombre_materia " +
                "FROM materias_esfuerzo me, materias_utilidad mu " +
                "WHERE (mu.codigo = me.codigo) " +
                "and mu.promedio= "+ predicado1 +" and me.promedio= "+ predicado2 +" ;";
        }
        else{
            
            
            consulta = "SELECT mu.codigo ,mu.nombre_materia " +
                "FROM materias_esfuerzo me, materias_utilidad mu " +
                "WHERE (mu.codigo = me.codigo) " +
                "and mu.promedio= "+ values.get("p2parte1")[0] +" and me.promedio= "+ values.get("p2parte2")[0] +" ;";
        }
        
        String respuesta=EjecutarConsulta(consulta);
        
        
        return ok(respuestas.render(respuesta));
    }

    public static Result preguntaTresC(){
        
        final Map<String, String[]> values = request().body().asFormUrlEncoded();
        
        String sesion=session("id");
        
        // LOS PREDICADOS PERSONALIZADOS SON DE LA FORMA id_predicado, EJ: 0741051_dificultad_alto
        String predicado1= values.get("p3parte1")[0]+"_"+sesion;
        String predicado2= values.get("p3parte2")[0]+"_"+sesion;
        String consulta;		
        
        
        if(verificarPredicado(predicado1) && verificarPredicado(predicado2)){
            consulta="SELECT nombre_profesor, codigo, nombre_materia " +
                "FROM AUX_2 " +
                "WHERE prom_prof = "+ predicado2 + " and prom_mat = " + predicado1 +" ;";
        }
        else{
            
            consulta = "SELECT nombre_profesor, codigo, nombre_materia " +
                "FROM AUX_2 " +
                "WHERE prom_prof = "+values.get("p3parte2")[0]+ " and prom_mat = " +values.get("p3parte1")[0]+" ;";
        }
        String respuesta=EjecutarConsulta(consulta);
        
        
        return ok(respuestas.render(respuesta));
        
    }

    public static Result confighandle(){

        final Map<String, String[]> values = request().body().asFormUrlEncoded();
	        
        String pred = values.get("pred")[0];
        StringBuffer res;
        String sesion=session("id");
        String respuesta="";
        String predicados []= { "dificultad_"+pred+"_"+sesion,
                                "calidad_prof_"+pred+"_"+sesion,
                                "utilidad_"+pred+"_"+sesion,
                                "esfuerzo_"+pred+"_"+sesion,
                                "preparacion_"+pred+"_"+sesion,
                                "expectativa_"+pred+"_"+sesion};
        
        
	     Connection connection = null;
        PreparedStatement pst = null;
        ResultSet rs = null;   


        int p1=Math.round(Float.valueOf(values.get("p1")[0]));
        int p2=Math.round(Float.valueOf(values.get("p2")[0]));
        int p3=Math.round(Float.valueOf(values.get("p3")[0]));
        int p4=Math.round(Float.valueOf(values.get("p4")[0]));

        try {
            
            Class.forName("org.postgresql.Driver");
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return ok(respuestas.render("<h1>Error</h1><p>No se pudo establecer conexión con el repositorio de datos debido a una falla en el controlador, "+
                                      "por favor intente más tarde, en caso de que el problema persista, "+
                                      "comuniquese con nuestro administrador mediante el correo wm@consulta.dii.usb.ve</p>"));
            
        }
        
        try {
            
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres","postgesql");
            
        } catch (SQLException e) {
            
            
            e.printStackTrace();
            return ok(respuestas.render("<h1>Error</h1><p>No se pudo establecer conexión con el repositorio de datos, "+
                                      "por favor intente más tarde, en caso de que el problema persista, "+
                                      "comuniquese con nuestro administrador mediante el correo wm@consulta.dii.usb.ve</p>"));
            
        }
        

        
        
        for(int i=0; i<predicados.length; i++){
            

            try{

                
                pst = connection.prepareStatement("DELETE "+
                                                  "FROM pg_fuzzypred "+
                                                  "WHERE predname = '"+predicados[i]+"' ;");
                pst.executeUpdate();
                	        	
                	        	
                pst = connection.prepareStatement("CREATE FUZZY PREDICATE "+
                                                   predicados[i] + " ON 1 .. 5 "+
                                                   "AS ("+
                                                   p1 +","+
                                                   p2 +","+
                                                   p3 +","+
                                                   p4 +") ; ");
                pst.executeUpdate();
            }
            catch(Exception e){
                
                e.printStackTrace();
                return ok(respuestas.render("<h1>Error</h1><p>No se pudo establecer conexión con el repositorio de datos, "+
                                          "por favor intente más tarde, en caso de que el problema persista, "+
                                          "comuniquese con nuestro administrador mediante el correo wm@consulta.dii.usb.ve</p>"));
            }
        }
        
        return ok(respuestas.render("<h1 style='margin-top: 50px;text-align: center;'>Su configuración ha sido procesada</h1>"));
        
    }
    
        
    public static Result config(){
        return ok(config.render());
    }
    
    public static Result updatePredicate(){
        return TODO;
    }
    
}



        
