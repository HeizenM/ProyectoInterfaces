package Model;

public class Ingreso {
    
    private int ingresoId;
    private String numero_documento;
    private String fecha;
    private String hora_ingreso;
    private String serial;
    private String placa;
    private String descripcion_motivo;
    private int usuario_id;
    private int rol_id;

    public Ingreso(int ingresoId) {
        this.ingresoId = ingresoId;
    }

    public Ingreso(String fecha, String hora_ingreso, String serial, String placa) {
        this.fecha = fecha;
        this.hora_ingreso = hora_ingreso;
        this.serial = serial;
        this.placa = placa;
    }
    

    public Ingreso(int ingresoId, String numero_documento, String fecha, String hora_ingreso, String serial, String placa, String descripcion_motivo, int usuario_id, int rol_id) {
        this.ingresoId = ingresoId;
        this.numero_documento = numero_documento;
        this.fecha = fecha;
        this.hora_ingreso = hora_ingreso;
        this.serial = serial;
        this.placa = placa;
        this.descripcion_motivo = descripcion_motivo;
        this.usuario_id = usuario_id;
        this.rol_id = rol_id;
    }

    public int getIngresoId() {
        return ingresoId;
    }

    public void setIngresoId(int ingresoId) {
        this.ingresoId = ingresoId;
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

    public String getHora_ingreso() {
        return hora_ingreso;
    }

    public void setHora_ingreso(String hora_ingreso) {
        this.hora_ingreso = hora_ingreso;
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

    public String getDescripcion_motivo() {
        return descripcion_motivo;
    }

    public void setDescripcion_motivo(String descripcion_motivo) {
        this.descripcion_motivo = descripcion_motivo;
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
        return "Ingreso{" + "ingresoId=" + ingresoId + ", numero_documento=" + numero_documento + ", fecha=" + fecha + ", hora_ingreso=" + hora_ingreso + ", serial=" + serial + ", placa=" + placa + ", descripcion_motivo=" + descripcion_motivo + ", usuario_id=" + usuario_id + ", rol_id=" + rol_id + '}';
    }
    
}
