/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import model.bean.BaseEntity;

/**
 *
 * @author Cleo
 * @param <T>
 */
public abstract class GenericDAO<T extends BaseEntity> {
    
    public T insertOrUpdate(T entity){
        EntityManager em = ConnectionFactory.getEntityManager();
        try {
            em.getTransaction().begin();
            if(entity.getId() == null){
                em.persist(entity);
            } else {
                em.merge(entity);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir ou atualizar dado " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return entity;
    }
    
    
    public T removeByID(Class<T> clazz, Integer id){
        EntityManager em = ConnectionFactory.getEntityManager();
        T entity = null;
        try {
            entity = em.find(clazz, id);
            em.getTransaction().begin();
            em.remove(entity);
            em.getTransaction().commit();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar dado " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return entity;
    }
           
    public ArrayList<T> findAll(Class<T> clazz){
        EntityManager em = ConnectionFactory.getEntityManager();
        ArrayList<T> entitys = new ArrayList<>();     
        try {
            entitys= new ArrayList<>(em.createQuery("from "+clazz.getName())
                    .getResultList());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum resultado emcontrado " + e);
        } finally {
            em.close();
        }
        return entitys;
    }
    
    public T findById(Class<T> clazz, Integer id){
        EntityManager em = ConnectionFactory.getEntityManager();
        T entity = null;
        try {
            entity = em.find(clazz, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum resultado emcontrado " + e);
        } finally {
            em.close();
        }
        return entity;
    }
    
    public ArrayList<T> findByNome(Class<T> clazz, String nome){
        EntityManager em = ConnectionFactory.getEntityManager();
        ArrayList<T> entitys = new ArrayList<>();     
        try { 
            Query query = em.createQuery("select t from "
                        +clazz.getName() +" as t where t.nome Like :pnome" );
            query.setParameter("pnome", nome);
            
            entitys = (new ArrayList<>(query.getResultList()));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum resultado emcontrado " + e);
        } finally {
            em.close();
        }
        return entitys;
    }
    
    
}
