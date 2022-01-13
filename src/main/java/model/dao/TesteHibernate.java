/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Utils.FormUtils;
import model.bean.Entregador;


/**
 *
 * @author tiago
 */
public class TesteHibernate {
    public static void main(String[] args) {
        EntregadorDAO entregadorDAO = new EntregadorDAO();
        System.out.println(FormUtils.getData());
        Entregador entregador = new Entregador("Cleo", "trav. da vigia", "Santa Helena", "999999", FormUtils.getData());
        entregadorDAO.insertOrUpdate(entregador);
      //dao.removeByID(Cliente.class, 6);


    }
}
