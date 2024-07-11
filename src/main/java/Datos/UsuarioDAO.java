package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/Proyecto_Final";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    
    private Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Proyecto_Final";
        String usuario = "root";
        String contraseña = "12345";
        return DriverManager.getConnection(url, usuario, contraseña);
    }
    
    public int obtenerRolId(String tipoDocumento, String numeroDocumento, String contraseña) {
        int rolId = -1;
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT rol_id FROM usuarios WHERE tipo_documento = ? AND numero_documento = ? AND contraseña = ?");
        ) {
            stmt.setString(1, tipoDocumento);
            stmt.setString(2, numeroDocumento);
            stmt.setString(3, contraseña);
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    rolId = rs.getInt("rol_id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rolId;
    }
    
    public int obtenerDatosUsuario(String tipoDocumento, String numeroDocumento, String contraseña) {
        int usuarioId = -1;
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT usuarioId FROM usuarios WHERE tipo_documento = ? AND numero_documento = ? AND contraseña = ?");
        ) {
            stmt.setString(1, tipoDocumento);
            stmt.setString(2, numeroDocumento);
            stmt.setString(3, contraseña);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    usuarioId = rs.getInt("usuarioId");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarioId;
    }

    public boolean verificarCredenciales(String tipoDocumento, String numeroDocumento, String contraseña) {
        String sql = "SELECT * FROM Usuarios WHERE tipo_documento = ? AND numero_documento = ? AND contraseña = ?";
        try (Connection conn = conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, tipoDocumento);
            pstmt.setString(2, numeroDocumento);
            pstmt.setString(3, contraseña);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar las credenciales: " + e.getMessage());
        }
        return false;
    }
    
    public boolean insertarUsuario(String tipoDocumento, String numeroDocumento, String nombre, String telefono, String direccion,
                                    String email, int ficha, String centroFormacion, String coordinacion, int rolId, String contraseña) {
        String sql = "INSERT INTO Usuarios (tipo_documento, numero_documento, nombre, telefono, direccion, email, ficha, centro_formacion, coordinacion, rol_id, contraseña) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, tipoDocumento);
            pstmt.setString(2, numeroDocumento);
            pstmt.setString(3, nombre);
            pstmt.setString(4, telefono);
            pstmt.setString(5, direccion);
            pstmt.setString(6, email);
            pstmt.setInt(7, ficha);
            pstmt.setString(8, centroFormacion);
            pstmt.setString(9, coordinacion);
            pstmt.setInt(10, rolId);
            pstmt.setString(11, contraseña);

            int rowsInserted = pstmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            System.out.println("Error al insertar usuario en la base de datos: " + e.getMessage());
            return false;
        }
    }
    
    public int insertUsuarioVisitante(String tipoDocumento, String numeroDocumento, String nombre, String telefono, String email, String empresaProcedencia) throws SQLException {
        String sql = "INSERT INTO usuarios (tipo_documento, numero_documento, nombre, telefono, email, empresa_procedencia, rol_id) VALUES (?, ?, ?, ?, ?, ?, 5)";
        try (Connection conn = conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, tipoDocumento);
            pstmt.setString(2, numeroDocumento);
            pstmt.setString(3, nombre);
            pstmt.setString(4, telefono);
            pstmt.setString(5, email);
            pstmt.setString(6, empresaProcedencia);
            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        }
        return -1;
    }
    
}