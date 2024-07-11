package Model;

public class Usuario {
    
    private int usuarioId;
    private String tipo_documento;
    private String numero_documento;
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private int ficha;
    private String centro_formacion;
    private String coordinacion;
    private int rol_id;
    private String contraseña;

    public Usuario(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Usuario(String tipo_documento, String numero_documento, String nombre, String telefono, String direccion, String email, int ficha, String centro_formacion, String coordinacion, int rol_id, String contraseña) {
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.ficha = ficha;
        this.centro_formacion = centro_formacion;
        this.coordinacion = coordinacion;
        this.rol_id = rol_id;
        this.contraseña = contraseña;
    }

    public Usuario(int usuarioId, String tipo_documento, String numero_documento, String nombre, String telefono, String direccion, String email, int ficha, String centro_formacion, String coordinacion, int rol_id, String contraseña) {
        this.usuarioId = usuarioId;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.ficha = ficha;
        this.centro_formacion = centro_formacion;
        this.coordinacion = coordinacion;
        this.rol_id = rol_id;
        this.contraseña = contraseña;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public String getCentro_formacion() {
        return centro_formacion;
    }

    public void setCentro_formacion(String centro_formacion) {
        this.centro_formacion = centro_formacion;
    }

    public String getCoordinacion() {
        return coordinacion;
    }

    public void setCoordinacion(String coordinacion) {
        this.coordinacion = coordinacion;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuarioId=" + usuarioId + ", tipo_documento=" + tipo_documento + ", numero_documento=" + numero_documento + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", email=" + email + ", ficha=" + ficha + ", centro_formacion=" + centro_formacion + ", coordinacion=" + coordinacion + ", rol_id=" + rol_id + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
