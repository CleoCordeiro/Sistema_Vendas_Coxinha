package Controller;

import java.util.ArrayList;
import model.bean.Cardapio;
import model.dao.ExceptionDAO;

/**
 *
 * @author Cleo
 */
public class CardapioController {
   
    public boolean insertOrUpdate(String nome, String categoria, double preco) throws ExceptionDAO{
        String data = Utils.getData();
        Cardapio cardapio = new Cardapio(nome, data, preco);
        return cardapio.insertOrUpdate(cardapio);
    }
    
    public boolean insertOrUpdate(int id, String nome, String categoria, double preco) throws ExceptionDAO{
        String data = Utils.getData();
        Cardapio cardapio = new Cardapio(id, nome, data, preco);
        return cardapio.insertOrUpdate(cardapio);
    }
        
    public ArrayList<Cardapio> findAll() throws ExceptionDAO{
       return new Cardapio().findAll();   
    }
    
    public Cardapio findById(int id) throws ExceptionDAO{
       return new Cardapio().findById(id);
    }
    
    public ArrayList<Cardapio> findLikeName(String nome) throws ExceptionDAO{
        return new Cardapio().findLikeName(nome);
    }
    
    public boolean removeByID(int id) throws ExceptionDAO{
        return new Cardapio().removeByID(id);
    }
    
}
