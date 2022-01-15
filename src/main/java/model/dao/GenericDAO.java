package model.dao;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.bean.BaseEntity;

/**
 *
 * @author Cleo
 * @param <T>
 */
public abstract class GenericDAO<T extends BaseEntity> {
    
    public boolean insertOrUpdate(T entity) throws ExceptionDAO{
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
            em.getTransaction().rollback();
            throw new ExceptionDAO("Erro ao inserir ou atualizar dado " + e);
        } finally {
            em.close();
        }
        return true;
    }
           
    public ArrayList<T> findAll(Class<T> clazz) throws ExceptionDAO{
        EntityManager em = ConnectionFactory.getEntityManager();
        ArrayList<T> entitys = new ArrayList<>();     
        try {
            entitys= new ArrayList<>(em.createQuery("from "+clazz.getName())
                    .getResultList());
        } catch (Exception e) {
            throw new ExceptionDAO("Nenhum resultado emcontrado " + e);
        } finally {
            em.close();
        }
        return entitys;
    }
    
    public T findById(Class<T> clazz, Integer id) throws ExceptionDAO{
        EntityManager em = ConnectionFactory.getEntityManager();
        T entity = null;
        try {
            entity = em.find(clazz, id);
        } catch (Exception e) {
            throw new ExceptionDAO("Nenhum resultado emcontrado " + e);
        } finally {
            em.close();
        }
        return entity;
    }
    
    public ArrayList<T> findLikeName(Class<T> clazz, String nome) throws ExceptionDAO{
        EntityManager em = ConnectionFactory.getEntityManager();
        ArrayList<T> entitys = new ArrayList<>();     
        try { 
            Query query = em.createQuery("select t from "
                        +clazz.getName() +" as t where t.nome Like :pnome" );
            query.setParameter("pnome", "%"+nome+"%");
            
            entitys = (new ArrayList<>(query.getResultList()));
            
        } catch (Exception e) {
            throw new ExceptionDAO("Nenhum resultado emcontrado " + e);
        } finally {
            em.close();
        }
        return entitys;
    }
    
    public boolean removeByID(Class<T> clazz, Integer id) throws ExceptionDAO{
        EntityManager em = ConnectionFactory.getEntityManager();
        T entity = null;
        try {
            entity = em.find(clazz, id);
            em.getTransaction().begin();
            em.remove(entity);
            em.getTransaction().commit();
        } catch(Exception e) {
            em.getTransaction().rollback();
            throw new ExceptionDAO("Erro ao deletar dado " + e);
        } finally {
            em.close();
        }
        return true;
    }
        
}
