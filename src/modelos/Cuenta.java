package modelos;

import controladores.CCuenta;
import java.sql.Date;
import java.util.List;


public class Cuenta extends Persona{
    
    private int idcuenta;
    private String clave;
    private String no_contador;
    private Date fecha_solicitud;
    private Date fecha_apertura;
    private String direccion;
    private int idmunicipio;
    private String idbarrio;
    private int orden_lectura;
    private String marchamo;
    private String tipo_servicio;
    private int idpersona;
    private int voltios_solicitados;
    private int lectura_acumulada;
    private String estado;
    private String zona;
    private int dia_visita;
    private String referencia;
    private String observaciones;
    private String usuario_lectura;
    private String marca_contador;
    private Date fecha_siguiente_visita;
    private int potencia_contratada;
    private String poste;
    private String latitud;
    private String longitud;
    private int exonerar_iva;
    private double porcentaje_exoneracion;

    public Cuenta() {
    }

    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNo_contador() {
        return no_contador;
    }

    public void setNo_contador(String no_contador) {
        this.no_contador = no_contador;
    }

    public Date getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(Date fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public Date getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(Date fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(int idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    public String getIdbarrio() {
        return idbarrio;
    }

    public void setIdbarrio(String idbarrio) {
        this.idbarrio = idbarrio;
    }

    public int getOrden_lectura() {
        return orden_lectura;
    }

    public void setOrden_lectura(int orden_lectura) {
        this.orden_lectura = orden_lectura;
    }

    public String getMarchamo() {
        return marchamo;
    }

    public void setMarchamo(String marchamo) {
        this.marchamo = marchamo;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getVoltios_solicitados() {
        return voltios_solicitados;
    }

    public void setVoltios_solicitados(int voltios_solicitados) {
        this.voltios_solicitados = voltios_solicitados;
    }

    public int getLectura_acumulada() {
        return lectura_acumulada;
    }

    public void setLectura_acumulada(int lectura_acumulada) {
        this.lectura_acumulada = lectura_acumulada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getDia_visita() {
        return dia_visita;
    }

    public void setDia_visita(int dia_visita) {
        this.dia_visita = dia_visita;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getUsuario_lectura() {
        return usuario_lectura;
    }

    public void setUsuario_lectura(String usuario_lectura) {
        this.usuario_lectura = usuario_lectura;
    }

    public String getMarca_contador() {
        return marca_contador;
    }

    public void setMarca_contador(String marca_contador) {
        this.marca_contador = marca_contador;
    }

    public Date getFecha_siguiente_visita() {
        return fecha_siguiente_visita;
    }

    public void setFecha_siguiente_visita(Date fecha_siguiente_visita) {
        this.fecha_siguiente_visita = fecha_siguiente_visita;
    }

    public int getPotencia_contratada() {
        return potencia_contratada;
    }

    public void setPotencia_contratada(int potencia_contratada) {
        this.potencia_contratada = potencia_contratada;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public int getExonerar_iva() {
        return exonerar_iva;
    }

    public void setExonerar_iva(int exonerar_iva) {
        this.exonerar_iva = exonerar_iva;
    }

    public double getPorcentaje_exoneracion() {
        return porcentaje_exoneracion;
    }

    public void setPorcentaje_exoneracion(double porcentaje_exoneracion) {
        this.porcentaje_exoneracion = porcentaje_exoneracion;
    }   
    
    public List<Cuenta> consultarCuentas(String nombre, String apellido){
        CCuenta cuenta = new CCuenta();
        return cuenta.consultarCuentas(nombre, apellido);
    }
}
