/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akats
 */
package model;

public class Model {
    private String nombre;  
    private String primerapellido;
    private String segundoapellido;
    private String fecha;
    private String email;
    private String password;

    public Model(String nombre, String primerapellido, String segundoapellido, String fecha, String email, String password) {
        this.nombre = nombre;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
        this.fecha = fecha;
        this.email = email;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }
    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }
    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }   
}
