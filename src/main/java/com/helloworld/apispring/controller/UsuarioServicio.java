/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.UsuarioRepositorio;
import com.helloworld.apispring.model.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author juanz
 */
@Service
public class UsuarioServicio {
    
    public UsuarioServicio() {
    }
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
        public List<Usuario> getAllUsers(){
        return usuarioRepositorio.getAllUsuarios();
    }
    //Filtro usuario por ID
        
    List<Usuario> getUsersID(Integer userID) {
        return usuarioRepositorio.obtenerUsuariosFiltro(userID);   
    }
    
    //Login
    public String loginUser(Usuario usuario) {
        if(usuarioRepositorio.loginUser(usuario)){
            return "Usuario logueado";
        }else{
            return "Usuario no logueado";
        }    
    }

}