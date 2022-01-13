/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.bean.Cardapio;
import model.bean.Cliente;

/**
 *
 * @author Cleo
 */
public class FormUtils {

    //Validação da data
    public static boolean validaData(String data){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(data); 
        } catch (ParseException ex) {
            return false;
        }
        return true;
    }
    
    public static String getData(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");  
        Date date = new Date();
        return String.valueOf(formatter.format(date));
    }
    
    public static String convertData(String Data){
        SimpleDateFormat pt_br = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat usd = new SimpleDateFormat("yy/MM/dd");
        String dataFormated = null;
        try {
            dataFormated = usd.format(pt_br.parse(Data));
        } catch (ParseException ex) {
            Logger.getLogger(FormUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataFormated;
    }
    
    //Validação da  hora
    public static boolean validaHora(String hora){
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            sdf.setLenient(false);
            try{
                sdf.parse(hora);
            }catch(ParseException e){
                return false;
            }
            return true;
    }
    
    //Checa se os campos estão vázios
    public static String validarCampos(JFormattedTextField dados, String campo){
        String limpo = dados.getText().replaceAll("[\\Q(|)|-| |.\\E]", "");
        if(limpo.isEmpty()){
            return "O Campo "+ campo +" está vazio!!!\n";
        }
        return "";
    }
    
    //Checa se os campos estão vázios
    public static String validarCampos(JTextField dados, String campo){
        if(dados.getText().isEmpty()){
        return "O Campo "+ campo +" está vazio!!!\n";
        }
        return "";
    }

    //Preeche a tabela
    public static void preencherTabela(JTable table, ArrayList<?> arrayList){
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setNumRows(0);
        table.setColumnSelectionAllowed(false);
        table.setRowSelectionAllowed(true);
        table.setEnabled(true);
        if(!arrayList.isEmpty()){
        
            if (arrayList.get(0) instanceof Cardapio){
                for (Iterator<?> it = arrayList.iterator(); it.hasNext();) {
                    Cardapio cardapio = (Cardapio) it.next();
                    tableModel.addRow(new Object[]{
                        cardapio.getId(),
                        cardapio.getNome(),
                        cardapio.getPreco(),
                    });
                }
            } else if (arrayList.get(0) instanceof Cliente){
                for (Iterator<?> it = arrayList.iterator(); it.hasNext();) {
                    Cliente cliemte = (Cliente) it.next();
                    tableModel.addRow(new Object[]{
                        cliemte.getId(),
                        cliemte.getNome(),
                        cliemte.getRua(),
                        cliemte.getBairro(),
                        cliemte.getTelefone(),
                        cliemte.getData()
                    });
                }
            }
        }
    }
    
}