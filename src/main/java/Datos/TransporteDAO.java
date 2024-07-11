package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.Transporte;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;

public class TransporteDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/Proyecto_Final";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    
    public DefaultTableModel obtenerDatosTransporte(int usuarioId) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Placa");
        modelo.addColumn("Marca");
        modelo.addColumn("Color");
        modelo.addColumn("Tipo");
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM transporte WHERE usuario_id = ?");
            ) {
            stmt.setInt(1, usuarioId);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String placa = rs.getString("placa");
                    String marca = rs.getString("marca");
                    String color = rs.getString("color");
                    String tipo = rs.getString("tipo");
                    modelo.addRow(new Object[]{placa, marca, color, tipo});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return modelo;
    }
    
    public boolean agregarTransporte(String placa, String marca, String color, String tipo, int usuarioId, int rolId) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO transporte (placa, marca, color, tipo, usuario_id, rol_id) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, placa);
                stmt.setString(2, marca);
                stmt.setString(3, color);
                stmt.setString(4, tipo);
                stmt.setInt(5, usuarioId);
                stmt.setInt(6, rolId);
                int rowsAffected = stmt.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public void insertTransporteVisitante(String placa, String marca, String color, String tipo, int usuarioId) throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
        String sql = "INSERT INTO transporte (placa, marca, color, tipo, rol_id, usuario_id) VALUES (?, ?, ?, ?, 5, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, placa);
            stmt.setString(2, marca);
            stmt.setString(3, color);
            stmt.setString(4, tipo);
            stmt.setInt(5, usuarioId);
            stmt.executeUpdate();
        }
    }
  }   
}

