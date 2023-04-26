/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Cesar
 */
public class Usuario extends Personal{
    
    
    private String acceso;
    private String password;
    private String U_estado;
    private String U_fechacreacion;
    private String fechaactivo;

    public Usuario(String acceso, String password, String U_estado, String U_fechacreacion, String fechaactivo, String nombre, String apellidomaterno, String apellidopaterno, String dni, String idcargo, String fechanacimiento, String fechacreacion, Boolean estadopersonal) {
        super(nombre, apellidomaterno, apellidopaterno, dni, idcargo, fechanacimiento, fechacreacion, estadopersonal);
        this.acceso = acceso;
        this.password = password;
        this.U_estado = U_estado;
        this.U_fechacreacion = U_fechacreacion;
        this.fechaactivo = fechaactivo;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getU_estado() {
        return U_estado;
    }

    public void setU_estado(String U_estado) {
        this.U_estado = U_estado;
    }

    public String getU_fechacreacion() {
        return U_fechacreacion;
    }

    public void setU_fechacreacion(String U_fechacreacion) {
        this.U_fechacreacion = U_fechacreacion;
    }

    public String getFechaactivo() {
        return fechaactivo;
    }

    public void setFechaactivo(String fechaactivo) {
        this.fechaactivo = fechaactivo;
    }

   
    
}
