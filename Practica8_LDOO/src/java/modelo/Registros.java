/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akats
 */
public class Registros {
    Connection conexion;
    
    private void abrirConexion() throws SQLException{
        String dbURI = "jdbc:derby://localhost:1527/Usuarios";
        String user = "Brenda";
        String password = "1732426";
        
        conexion = DriverManager.getConnection(dbURI, user, password);
    }
    
    private void cerrarConexion() throws SQLException{
        conexion.close();
    }
    
    public void insertar(Usuario usuario) throws SQLException{
        abrirConexion();
        String queryUsuario = "insert into USUARIOS values('" + usuario.getId() + "', '"+ usuario.getNombre() + "', '" + usuario.getApellido() + "', '" + usuario.getEdad() + usuario.getPassword() + "')";
        Statement stmt = conexion.createStatement();
        stmt.executeUpdate(queryUsuario);
        cerrarConexion();
    }
    
    public List entrar(Usuario entrar)throws SQLException{
        ResultSet registros;
        List resultados = new ArrayList();
        abrirConexion();
        String queryEntrar = "Select * from USUARIO where NOMBRE = '" + entrar.getId() +", " + entrar.getNombre() +", " + entrar.getApellido() + entrar.getEdad() +", "+ entrar.getPassword() + "%'";
        
        Statement stmt = conexion.createStatement();
        registros = stmt.executeQuery(queryEntrar);
        
        while(registros.next()){
            String id = registros.getString("ID");
            String nombre = registros.getString("NOMBRE");
            String apellido = registros.getString("APELLIDO");
            String edad = registros.getString("EDAD");
            String password = registros.getString("PASSWORD");
            
            Usuario consulta = new Usuario();
            consulta.setId(id);
            consulta.setNombre(nombre);
            consulta.setApellido(apellido);
            consulta.setEdad(edad);
            consulta.setPassword(password);
            
            resultados.add(consulta);
        }
        
        cerrarConexion();
        
        return resultados;
    }
}
