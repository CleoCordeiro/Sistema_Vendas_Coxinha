package model.dao;

import Controller.Utils;
import java.lang.reflect.Field;
import model.bean.Entregador;


/**
 *
 * @author tiago
 */
public class TesteHibernate {
    public static void main(String[] args) throws ExceptionDAO {
        String data = Utils.getData();
        Entregador entregador = new Entregador("Testando novo entregador", "Teste", "Teste", "99999999", data);
        Field[] declaredFields = entregador.getClass().getDeclaredFields();
        System.out.println(entregador.getClass().getDeclaredFields().length);


    }
}
