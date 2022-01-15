package model.bean;

import java.util.ArrayList;
import javax.persistence.Entity;
import model.dao.EntregadorDAO;
import model.dao.ExceptionDAO;

/**
 *
 * @author Cleo
 */

@Entity
public class Entregador extends Pessoa {
    
    public Entregador() {
    }

    public Entregador(String nome, String rua, String bairro, String telefone, String data) {
        super(nome, rua, bairro, telefone, data);
    }

    public Entregador(Integer id, String nome, String rua, String bairro, String telefone, String data) {
        super(id, nome, rua, bairro, telefone, data);
    }
    
    public boolean insertOrUpdate(Entregador entregador) throws ExceptionDAO{
      return new EntregadorDAO().insertOrUpdate(entregador);
    }

    public ArrayList<Entregador> findAll() throws ExceptionDAO{
        return new EntregadorDAO().findAll(Entregador.class);
    }
        
    public Entregador findById(int id) throws ExceptionDAO{
       return new EntregadorDAO().findById(Entregador.class, id);    
    }
        
    public ArrayList<Entregador> findLikeName(String nome) throws ExceptionDAO{
        return new EntregadorDAO().findLikeName(Entregador.class, nome);
    }

    public boolean removeByID(int id) throws ExceptionDAO{
       return new EntregadorDAO().removeByID(Entregador.class, id);
    }
}
