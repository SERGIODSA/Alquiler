import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
    static Connection cnx;   // objeto que realiza la conexion
    static Statement buscar;  // objeto para consulta
    static ResultSet resultado = null;  // objeto que almacena resultado
    static String url="jdbc:mysql://localhost:3306/mysql";
    static String user="root";
    static String pass="";
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url,user,pass);
        }
        catch(Exception ee){
            System.out.println("Error: " + ee.getMessage());
        }
    }
    public String Ejecutar(String sql){
        String error="";
        try{
            buscar=cnx.createStatement();
            buscar.execute(sql);
        }
        catch(Exception ex){
            error = ex.getMessage();
        }
        return(error);
    }
    public ResultSet Consulta(String sql){
        String error="";
        try{
            buscar=cnx.createStatement();
            resultado=buscar.executeQuery(sql);
        }
        catch(Exception ee){
            error = ee.getMessage();
        }
        return(resultado);
    }
}
