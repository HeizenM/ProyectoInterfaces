package Datos;

import javax.swing.table.DefaultTableModel;
import Model.Salida;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SalidaDAO {
    
    private static final String URL = "jdbc:mysql://localhost:3306/Proyecto_Final";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    
    public DefaultTableModel obtenerDatosSalida(int usuarioId) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Serial");
        modelo.addColumn("Placa");

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM salida WHERE usuario_id = ?");
        ) {
            stmt.setInt(1, usuarioId);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                String fecha = rs.getString("fecha");
                String hora_salida = rs.getString("hora_salida");
                String serial = rs.getString("serial");
                String placa = rs.getString("placa");
                modelo.addRow(new Object[]{fecha, hora_salida, serial, placa});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return modelo;
    }
    
    public void agregarSalida(String fecha, String hora, String serial, String placa, int usuarioId, int rolId, int ingreso_id) {
    try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
        
        int ingresoId = obtenerUltimoIngresoId(usuarioId);
        
        String sql = "INSERT INTO salida (fecha, hora_salida, serial, placa, usuario_id, rol_id, ingreso_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, fecha);
            stmt.setString(2, hora);
            stmt.setString(3, serial);
            stmt.setString(4, placa);
            stmt.setInt(5, usuarioId);
            stmt.setInt(6, rolId);
            stmt.setInt(7, ingresoId);
            stmt.executeUpdate();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    // Método para obtener el ID del último ingreso del usuario
    public int obtenerUltimoIngresoId(int usuarioId) {
        int ingresoId = -1;
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement("SELECT MAX(ingresoId) AS ultimo_ingreso_id FROM ingreso WHERE usuario_id = ?")) {
            stmt.setInt(1, usuarioId);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ingresoId = rs.getInt("ultimo_ingreso_id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ingresoId;
    }
    
    public void insertarSalidaVisitante(String numeroDocumento, String fecha, String hora, String serial, String placa, int usuarioId) {
    try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
        String sql = "INSERT INTO salida (numero_documento, fecha, hora_salida, serial, placa, rol_id, usuario_id) VALUES (?, ?, ?, ?, ?, 5, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, numeroDocumento);            
            stmt.setString(2, fecha);
            stmt.setString(3, hora);
            stmt.setString(4, serial);
            stmt.setString(5, placa);
            stmt.setInt(6, usuarioId);
            stmt.executeUpdate();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
}
