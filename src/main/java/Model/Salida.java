package Model;

public class Salida {
    
    private int salidaId;
    private String numero_documento;
    private String fecha;
    private String hora_salida;
    private String serial;
    private String placa;
    private int usuario_id;
    private int rol_id;
    private int ingreso_id;

    public Salida(int salidaId) {
        this.salidaId = salidaId;
    }

    public Salida(String fecha, String hora_salida, String serial, String placa) {
        this.fecha = fecha;
        this.hora_salida = hora_salida;
        this.serial = serial;
        this.placa = placa;
    }

    

    public Salida(int salidaId, String numero_documento, String fecha, String hora_salida, String serial, String placa, int usuario_id, int rol_id, int ingreso_id) {
        this.salidaId = salidaId;
        this.numero_documento = numero_documento;
        this.fecha = fecha;
        this.hora_salida = hora_salida;
        this.serial = serial;
        this.placa = placa;
        this.usuario_id = usuario_id;
        this.rol_id = rol_id;
        this.ingreso_id = ingreso_id;
    }

    public int getSalidaId() {
        return salidaId;
    }

    public void setSalidaId(int salidaId) {
        this.salidaId = salidaId;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public int getIngreso_id() {
        return ingreso_id;
    }

    public void setIngreso_id(int ingreso_id) {
        this.ingreso_id = ingreso_id;
    }

    @Override
    public String toString() {
        return "Salida{" + "salidaId=" + salidaId + ", numero_documento=" + numero_documento + ", fecha=" + fecha + ", hora_salida=" + hora_salida + ", serial=" + serial + ", placa=" + placa + ", usuario_id=" + usuario_id + ", rol_id=" + rol_id + ", ingreso_id=" + ingreso_id + '}';
    }

    
    
}
