/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Cesar
 */
public class Personal {
    
    private String nombre;
    private String apellidomaterno;
    private String apellidopaterno;
    private String dni;
    private String idcargo;
    private String fechanacimiento;
    private String fechacreacion;
    private Boolean estadopersonal;

    public Personal(String nombre, String apellidomaterno, String apellidopaterno, String dni, String idcargo, String fechanacimiento, String fechacreacion, Boolean estadopersonal) {
        this.nombre = nombre;
        this.apellidomaterno = apellidomaterno;
        this.apellidopaterno = apellidopaterno;
        this.dni = dni;
        this.idcargo = idcargo;
        this.fechanacimiento = fechanacimiento;
        this.fechacreacion = fechacreacion;
        this.estadopersonal = estadopersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(String idcargo) {
        this.idcargo = idcargo;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(String fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Boolean getEstadopersonal() {
        return estadopersonal;
    }

    public void setEstadopersonal(Boolean estadopersonal) {
        this.estadopersonal = estadopersonal;
    }

    
    
    
}
