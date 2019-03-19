/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.model.dao;


import com.helloworld.apispring.model.entity.Usuario;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author juanz
 */
@Repository
@Transactional
public class UsuarioRepositorio {
    
    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
     public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
     
    //Obtener ciudadanos
    public List<Usuario> getAllUsuarios(){
       Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Usuario.class);
        return criteria.list();
    } 
    
    //Obtener ciudadano por id
       
    public List<Usuario> obtenerUsuariosFiltro(Integer userID) {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Usuario.class);
            if(userID != null){
                criteria.add(Restrictions.eq("Id_Usuario", userID));
            }
            return criteria.list();
    }
    //Login
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    public boolean loginUser(Usuario usuario) {
        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Usuario.class);
            criteria.add(Restrictions.eq("pass", getMD5(usuario.getContraseña())));
            criteria.setProjection(Projections.rowCount());
            List<Long> results = criteria.list();
            if (results.get(0) == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }    
    }

    
}

