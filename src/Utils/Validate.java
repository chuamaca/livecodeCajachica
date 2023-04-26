/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Cesar
 */
public class Validate {

    public static boolean validarUsuario(String user, String pass) {

        PreparedStatement ps;
        ResultSet rs;
        Integer contador = 0;
        Boolean validacion = false;
        String valor = "";

        try {
           
            Connection cnx = Utils.ConnectionSQL.getConexion();
            ps = cnx.prepareStatement("SELECT idUsuario FROM usuario WHERE acceso=? AND Password=?  ");
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            while (rs.next()) {

                valor = rs.getString("idUsuario");
                contador++;
            }

            if (contador.equals(1) && valor.length() > 1) {

                validacion = true;

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return validacion;
    }

}
