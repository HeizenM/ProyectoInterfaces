package Model;

public class Transporte {
    
    private int transporteId;
    private String placa;
    private String marca;
    private String color;
    private String tipo;
    private int usuario_id;
    private int rol_id;

    public Transporte(int transporteId) {
        this.transporteId = transporteId;
    }

    public Transporte(String placa, String marca, String color, String tipo, int usuario_id, int rol_id) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.usuario_id = usuario_id;
        this.rol_id = rol_id;
    }

    public Transporte(int transporteId, String placa, String marca, String color, String tipo, int usuario_id, int rol_id) {
        this.transporteId = transporteId;
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.usuario_id = usuario_id;
        this.rol_id = rol_id;
    }

    public int getTransporteId() {
        return transporteId;
    }

    public void setTransporteId(int transporteId) {
        this.transporteId = transporteId;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    @Override
    public String toString() {
        return "Transporte{" + "transporteId=" + transporteId + ", placa=" + placa + ", marca=" + marca + ", color=" + color + ", tipo=" + tipo + ", usuario_id=" + usuario_id + ", rol_id=" + rol_id + '}';
    }
    
}
