/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author juanz
 */

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Id_Usuario;
            
    @Column 
    private String Nombre;
    
    @Column(name = "Contraseña") 
    private String pass;
    
    @Column
    private String Direccion;
    
    @Column
    private Integer Telefono;

    //Constructor
    public Usuario() {
    }
    
    //Getters
    public Integer getId_Usuario() {
        return Id_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getContraseña() {
        return pass;
    }

    public String getDireccion() {
        return Direccion;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    //Setters
    public void setId_Usuario(Integer Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setContraseña(String Contraseña) {
        this.pass = Contraseña;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(Integer Telefono) {
        this.Telefono = Telefono;
    }
    
}
