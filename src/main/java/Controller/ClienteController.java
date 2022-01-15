package Controller;

import java.util.ArrayList;
import model.bean.Cliente;
import model.dao.ExceptionDAO;

/**
 *
 * @author Cleo
 */
public class ClienteController {
    public boolean insertOrUpdate(String nome, String rua, String bairro, String telefone) throws ExceptionDAO{
        String data = Utils.getData();
        Cliente cliente = new Cliente(nome, rua, bairro, telefone, data);
        return cliente.insertOrUpdate(cliente);
    }
    
    public boolean insertOrUpdate(int id,String nome, String rua, String bairro, String telefone) throws ExceptionDAO{
        String data = Utils.getData();
        Cliente cliente = new Cliente(id, nome, rua, bairro, telefone, data);
        return cliente.insertOrUpdate(cliente);
    }
    
    public ArrayList<Cliente> findAll() throws ExceptionDAO{
       return new Cliente().findAll();   
    }
    
    public Cliente findById(int id) throws ExceptionDAO{
       return new Cliente().findById(id);
    }
    
    public ArrayList<Cliente> findLikeName(String nome) throws ExceptionDAO{
        return new Cliente().findLikeName(nome);
    }
    
    public boolean removeByID(int id) throws ExceptionDAO{
        return new Cliente().removeByID(id);
    }
    
}
