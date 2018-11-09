/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;

/**
 *
 * @author romeo.sanchez
 */
public class ClientesModelo {
    private static HashMap<String, Cliente> mood = new HashMap<>();
    
    public ClientesModelo() {
        mood.put("brenda11", new Cliente("brenda11", "Brenda"));
        mood.put("luis11", new Cliente("luis11", "Luis"));
    }
    
    public Cliente getCliente(String usuario) {
        return mood.get(usuario);
    }
}
