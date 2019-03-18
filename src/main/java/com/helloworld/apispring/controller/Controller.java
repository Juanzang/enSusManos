/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.MediaType;


@RestController
@RequestMapping("/v1")
public class Controller {
    
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        List<Usuario> usuarios = usuarioServicio.getAllUsers();
        return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
    }
       
}