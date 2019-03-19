/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.model.dao;
/*
import com.helloworld.apispring.model.entity.Evento;
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

/*
@Repository
@Transactional
public class EventoRepositorio {
    
    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
     public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
     
    //Obtener eventos
    public List<Evento> getAllEventos(){
       Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Evento.class);
        return criteria.list();
    } 
    
    //Obtener evento por id
       
    public List<Evento> obtenerEventosFiltro(Integer eventoID) {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Evento.class);
            if(eventoID != null){
                criteria.add(Restrictions.eq("Id_Evento", eventoID));
            }
            return criteria.list();
    }
}
*/