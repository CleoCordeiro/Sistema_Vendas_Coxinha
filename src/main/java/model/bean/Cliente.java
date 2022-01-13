/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

import javax.persistence.Entity;

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
 

}
