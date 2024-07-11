package Model;

public class Pertenencias {
    
    private int pertenenciasId;
    private String descripcion;
    private String serial;
    private int usuario_id;
    private int rol_id;

    public Pertenencias(int pertenenciasId) {
        this.pertenenciasId = pertenenciasId;
    }

    public Pertenencias(String descripcion, String serial, int usuario_id, int rol_id) {
        this.descripcion = descripcion;
        this.serial = serial;
        this.usuario_id = usuario_id;
        this.rol_id = rol_id;
    }

    public Pertenencias(int pertenenciasId, String descripcion, String serial, int usuario_id, int rol_id) {
        this.pertenenciasId = pertenenciasId;
        this.descripcion = descripcion;
        this.serial = serial;
        this.usuario_id = usuario_id;
        this.rol_id = rol_id;
    }

    public int getPertenenciasId() {
        return pertenenciasId;
    }

    public void setPertenenciasId(int pertenenciasId) {
        this.pertenenciasId = pertenenciasId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
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
        return "Pertenencias{" + "pertenenciasId=" + pertenenciasId + ", descripcion=" + descripcion + ", serial=" + serial + ", usuario_id=" + usuario_id + ", rol_id=" + rol_id + '}';
    }
    
}
