package model.bean;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import model.dao.CardapioDAO;
import model.dao.ExceptionDAO;

/**
 *
 * @author Cleo
 */
@Entity
public class Cardapio implements BaseEntity, Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String categoria;
    private double preco;

    public Cardapio() {
    }
    
    public Cardapio(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public Cardapio(Integer id, String nome, String categoria, double preco) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean insertOrUpdate(Cardapio cardapio) throws ExceptionDAO{
      return new CardapioDAO().insertOrUpdate(cardapio);
    }

    public ArrayList<Cardapio> findAll() throws ExceptionDAO{
        return new CardapioDAO().findAll(Cardapio.class);
    }
        
    public Cardapio findById(int id) throws ExceptionDAO{
       return new CardapioDAO().findById(Cardapio.class, id);    
    }
        
    public ArrayList<Cardapio> findLikeName(String nome) throws ExceptionDAO{
        return new CardapioDAO().findLikeName(Cardapio.class, nome);
    }

    public boolean removeByID(int id) throws ExceptionDAO{
       return new CardapioDAO().removeByID(Cardapio.class, id);
    }
}
