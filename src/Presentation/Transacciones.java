/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

import java.sql.Date;

/**
 *
 * @author Cesar
 */
public class Transacciones {
    
    
    private String idcaja;
    private Date fechaRegistro;
    private String usuarioup;

    public Transacciones() {
    }

    public Transacciones(String idcaja, Date fechaRegistro, String usuarioup) {
        this.idcaja = idcaja;
        this.fechaRegistro = fechaRegistro;
        this.usuarioup = usuarioup;
    }

    public String getIdcaja() {
        return idcaja;
    }

    public void setIdcaja(String idcaja) {
        this.idcaja = idcaja;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getUsuarioup() {
        return usuarioup;
    }

    public void setUsuarioup(String usuarioup) {
        this.usuarioup = usuarioup;
    }
    
    
    
}
