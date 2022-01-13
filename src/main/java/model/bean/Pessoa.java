/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Cleo
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements BaseEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    
    private String nome;
    private String rua;
    private String bairro;
    private String telefone;
    private String data;

    public Pessoa() {
    }

    
    public Pessoa(String nome, String rua, String bairro, String telefone, String data) {
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.telefone = telefone;
        this.data = data;
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

 
    public String getRua() {
        return rua;
    }


    public void setRua(String rua) {
        this.rua = rua;
    }


    public String getBairro() {
        return bairro;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }

}
