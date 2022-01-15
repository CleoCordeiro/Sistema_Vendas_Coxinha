package model.bean;

import java.util.ArrayList;
import javax.persistence.Entity;
import model.dao.ClienteDAO;
import model.dao.ExceptionDAO;

/**
 *
 * @author Cleo
 */

@Entity
public class Cliente extends Pessoa{

    public Cliente() {
    }

    public Cliente(String nome, String rua, String bairro, String telefone, String data) {
        super(nome, rua, bairro, telefone, data);
    }

    public Cliente(Integer id, String nome, String rua, String bairro, String telefone, String data) {
        super(id, nome, rua, bairro, telefone, data);
    }
 
    public boolean insertOrUpdate(Cliente cliente) throws ExceptionDAO{
      return new ClienteDAO().insertOrUpdate(cliente);
    }

    public ArrayList<Cliente> findAll() throws ExceptionDAO{
        return new ClienteDAO().findAll(Cliente.class);
    }
        
    public Cliente findById(int id) throws ExceptionDAO{
       return new ClienteDAO().findById(Cliente.class, id);    
    }
        
    public ArrayList<Cliente> findLikeName(String nome) throws ExceptionDAO{
        return new ClienteDAO().findLikeName(Cliente.class, nome);
    }

    public boolean removeByID(int id) throws ExceptionDAO{
       return new ClienteDAO().removeByID(Cliente.class, id);
    }

}
