package Controller;

import java.util.ArrayList;
import model.bean.Categoria;
import model.dao.ExceptionDAO;

/**
 *
 * @author Cleo
 */
public class CategoriaController {
   
    public boolean insertOrUpdate(String nome) throws ExceptionDAO{
        Categoria categoria = new Categoria(nome);
        return categoria.insertOrUpdate(categoria);
    }
    
    public boolean insertOrUpdate(int id, String nome) throws ExceptionDAO{
        Categoria categoria = new Categoria(id, nome);
        return categoria.insertOrUpdate(categoria);
    }
        
    public ArrayList<Categoria> findAll() throws ExceptionDAO{
       return new Categoria().findAll();   
    }
    
    public Categoria findById(int id) throws ExceptionDAO{
       return new Categoria().findById(id);
    }  
    
    public boolean removeByID(int id) throws ExceptionDAO{
        return new Categoria().removeByID(id);
    }
    
}