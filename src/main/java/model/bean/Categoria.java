package model.bean;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import model.dao.CategoriaDAO;
import model.dao.ExceptionDAO;

/**
 *
 * @author Cleo
 */
@Entity
public class Categoria implements BaseEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean insertOrUpdate(Categoria categoria) throws ExceptionDAO{
      return new CategoriaDAO().insertOrUpdate(categoria);
    }
    
    public ArrayList<Categoria> findAll() throws ExceptionDAO{
        return new CategoriaDAO().findAll(Categoria.class);
    }
        
    public Categoria findById(int id) throws ExceptionDAO{
       return new CategoriaDAO().findById(Categoria.class, id);    
    }
    
    public boolean removeByID(int id) throws ExceptionDAO{
       return new CategoriaDAO().removeByID(Categoria.class, id);
    }
}
