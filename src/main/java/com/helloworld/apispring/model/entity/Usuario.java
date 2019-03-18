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
    @Column(name = "Id_Usuario")
    private Integer usr_id;
            
    @Column 
    private String Nombre;
    
    @Column 
    private String Contraseña;
    
    @Column
    private String Direccion;
    
    @Column
    private Integer Telefono;

    //Constructor
    public Usuario() {
    }
    
    //Getters
    public Integer getUsr_id() {
        return usr_id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public String getDireccion() {
        return Direccion;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    //Setters
    public void setUsr_id(Integer usr_id) {
        this.usr_id = usr_id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(Integer Telefono) {
        this.Telefono = Telefono;
    }
    
}
