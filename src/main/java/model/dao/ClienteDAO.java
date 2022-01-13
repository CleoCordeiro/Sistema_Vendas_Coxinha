/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import model.bean.Cliente;
import model.bean.BaseEntity;

/**
 *
 * @author Cleo
 */
public class ClienteDAO extends GenericDAO<Cliente>{
    
//    public Cliente insertOrUpdate(Cliente cliente){
//        try {
//            em.getTransaction().begin();
//            if(cliente.getId() == null){
//                em.persist(cliente);
//            } else {
//                em.merge(cliente);
//            }
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro ao inserir ou atualizar dado " + e);
//            em.getTransaction().rollback();
//        } finally {
//            em.close();
//        }
//        return cliente;
//    }
//    
    
//    public Cliente removeByID(Integer id){
//        Cliente cliente = null;
//        try {
//            cliente = em.find(Cliente.class, id);
//            em.getTransaction().begin();
//            em.remove(cliente);
//            em.getTransaction().commit();
//        } catch(Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro ao deletar dado " + e);
//            em.getTransaction().rollback();
//        } finally {
//            em.close();
//        }
//        return cliente;
//    }
//    
//    public ArrayList<Cliente> findAll(){
//        ArrayList<Cliente> clientes = new ArrayList<>();     
//        try {
//            clientes = (ArrayList<Cliente>)em.createQuery("from Cliente c")
//                    .getResultList();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Nenhum resultado emcontrado " + e);
//        } finally {
//            em.close();
//        }
//        return clientes;
//    }
//    
//    public Cliente findById(Integer id){
//        Cliente cliente = null;
//        try {
//            cliente = em.find(Cliente.class, id);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Nenhum resultado emcontrado " + e);
//        } finally {
//            em.close();
//        }
//        return cliente;
//    }
//    
//    public Cliente findByNome(String nome){
//        Cliente cliente = null;
//        try {
//            cliente = em.find(Cliente.class, nome);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Nenhum resultado emcontrado " + e);
//        } finally {
//            em.close();
//        }
//        return cliente;
//    }
//        
//    private ArrayList<Cliente> consult(Query query) {
//        ArrayList<Cliente> clientes;
//        try{
//            clientes = new ArrayList<>(query.getResultList());
//        } catch(NoResultException e) {
//            clientes = new ArrayList<>();
//        }
//        return clientes;
//    }
//        
//    public ArrayList<Cliente> selectAll(){
//        String jpql = "select c from Cliente as c";
//        Query query = em.createQuery(jpql);
//        return consult(query);
//    }

    
//    public ArrayList<Cliente> selectFormName(String nome){
//        String jpql = "select c from Cliente as c "
//                + "where c.nome like :pNome";
//        Query query = em.createQuery(jpql);
//        query.setParameter("pNome", nome);
//        return consult(query);
//    }
//    
//    public Cliente selectFromID(int id){
//        return em.find(Cliente.class, id);      
//    }
    
}
