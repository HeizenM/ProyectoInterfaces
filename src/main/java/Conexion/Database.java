package Conexion;

import java.sql.*;

public class Database {
   
    public static final String URL = "jdbc:mysql://localhost:3306/Proyecto_Final?useSSL=false&allowPublicKeyRetrieval=true";
    public static final String USER = "root";
    public static final String PASSWD = "12345";

    public Database() {
    }
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWD);
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement st) throws SQLException{
        st.close();
    }
    
    public static void close(PreparedStatement ps) throws SQLException{
        ps.close();
    }
    
    public static void close(Connection con) throws SQLException{
        con.close();
    }
}

