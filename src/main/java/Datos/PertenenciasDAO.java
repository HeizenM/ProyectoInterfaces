package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.Pertenencias;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;

public class PertenenciasDAO {
    
    private static final String URL = "jdbc:mysql://localhost:3306/Proyecto_Final";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    public DefaultTableModel obtenerDatosPertenencias(int usuarioId) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Descripcion");
        modelo.addColumn("Serial");

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pertenencias WHERE usuario_id = ?");
        ) {
            stmt.setInt(1, usuarioId);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String descripcion = rs.getString("descripcion");
                    String serial = rs.getString("serial");
                    modelo.addRow(new Object[]{descripcion, serial});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return modelo;
    }

    
    public boolean agregarPertenencia(String descripcion, String serial, int usuarioId, int rolId) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO pertenencias (descripcion, serial, usuario_id, rol_id) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, descripcion);
                stmt.setString(2, serial);
                stmt.setInt(3, usuarioId);
                stmt.setInt(4, rolId);
                int rowsAffected = stmt.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void insertPertenenciasVisitante(String descripcion, String serial, int usuarioId) throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
        String sql = "INSERT INTO pertenencias (descripcion, serial, rol_id, usuario_id) VALUES (?, ?, 5, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, descripcion);
            stmt.setString(2, serial);
            stmt.setInt(3, usuarioId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}


