package Datos;

import javax.swing.table.DefaultTableModel;
import Model.Ingreso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IngresoDAO {
    
    private static final String URL = "jdbc:mysql://localhost:3306/Proyecto_Final";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    
    public DefaultTableModel obtenerDatosIngreso(int usuarioId) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Serial");
        modelo.addColumn("Placa");

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM ingreso WHERE usuario_id = ?");
        ) {
            stmt.setInt(1, usuarioId);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                String fecha = rs.getString("fecha");
                String hora_ingreso = rs.getString("hora_ingreso");
                String serial = rs.getString("serial");
                String placa = rs.getString("placa");
                modelo.addRow(new Object[]{fecha, hora_ingreso, serial, placa});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return modelo;
    }
    
    public void agregarIngreso(String fecha, String hora, String serial, String placa, int usuarioId, int rolId) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO ingreso (fecha, hora_ingreso, serial, placa, usuario_id, rol_id) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, fecha);
                stmt.setString(2, hora);
                stmt.setString(3, serial);
                stmt.setString(4, placa);
                stmt.setInt(5, usuarioId);
                stmt.setInt(6, rolId);
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void insertarIngresoVisitante(String fecha, String hora, String serial, String placa, int usuarioId) {
    try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
        String sql = "INSERT INTO ingreso (fecha, hora_ingreso, serial, placa, rol_id, usuario_id) VALUES (?, ?, ?, ?, 5, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, fecha);
            stmt.setString(2, hora);
            stmt.setString(3, serial);
            stmt.setString(4, placa);
            stmt.setInt(5, usuarioId);
            stmt.executeUpdate();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    public DefaultTableModel obtenerDatosRelacionados(int usuarioId) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Fecha Ingreso");
        modelo.addColumn("Hora Ingreso");
        modelo.addColumn("Serial");
        modelo.addColumn("Placa");
        modelo.addColumn("Fecha Salida");
        modelo.addColumn("Hora Salida");

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT i.fecha AS fechaIngreso, " +
                                                              "i.hora_ingreso AS horaIngreso, " +
                                                              "i.serial, " +
                                                              "i.placa, " +
                                                              "s.fecha AS fechaSalida, " +
                                                              "IFNULL(s.hora_salida, '') AS horaSalida " +
                                                              "FROM ingreso i " +
                                                              "LEFT JOIN salida s ON i.ingresoId = s.ingreso_id " +
                                                              "WHERE i.usuario_id = ?");
        ) {
            stmt.setInt(1, usuarioId);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String fecha_ingreso = rs.getString("fechaIngreso");
                    String hora_ingreso = rs.getString("horaIngreso");
                    String serial = rs.getString("serial");
                    String placa = rs.getString("placa");
                    String fecha_salida = rs.getString("fechaSalida");
                    String hora_salida = rs.getString("horaSalida");
                    modelo.addRow(new Object[]{fecha_ingreso, hora_ingreso, serial, placa, fecha_salida, hora_salida});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return modelo;
    }
}


