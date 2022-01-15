package Controller;

import java.util.ArrayList;
import model.bean.Entregador;
import model.dao.ExceptionDAO;

/**
 *
 * @author Cleo
 */
public class EntregadorController {
    public boolean insertOrUpdate(String nome, String rua, String bairro, String telefone) throws ExceptionDAO{
        String data = Utils.getData();
        Entregador entregador = new Entregador(nome, rua, bairro, telefone, data);
        return entregador.insertOrUpdate(entregador);
    }
    
    public boolean insertOrUpdate(int id,String nome, String rua, String bairro, String telefone) throws ExceptionDAO{
        String data = Utils.getData();
        Entregador entregador = new Entregador(id, nome, rua, bairro, telefone, data);
        return entregador.insertOrUpdate(entregador);
    }
    
    public ArrayList<Entregador> findAll() throws ExceptionDAO{
       return new Entregador().findAll();   
    }
    
    public Entregador findById(int id) throws ExceptionDAO{
       return new Entregador().findById(id);
    }
    
    public ArrayList<Entregador> findLikeName(String nome) throws ExceptionDAO{
        return new Entregador().findLikeName(nome);
    }
    
    public boolean removeByID(int id) throws ExceptionDAO{
        return new Entregador().removeByID(id);
    }
    
}
