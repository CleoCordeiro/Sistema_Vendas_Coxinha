/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Utils.GerenteDeJanelas;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import static java.util.function.Predicate.not;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.not;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Cleo
 */
public class Menu extends javax.swing.JFrame {
    private GerenteDeJanelas gerenteDeJanelas;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.gerenteDeJanelas = new GerenteDeJanelas(Deskpainel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ImageIcon fundo = new ImageIcon(getClass().getResource("/Imagens/fundo.jpg"));
        Image image = fundo.getImage();
        Deskpainel = new javax.swing.JDesktopPane(){
            @Override
            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCardápio = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COXINHA DA SU");
        setResizable(false);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout DeskpainelLayout = new javax.swing.GroupLayout(Deskpainel);
        Deskpainel.setLayout(DeskpainelLayout);
        DeskpainelLayout.setHorizontalGroup(
            DeskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        DeskpainelLayout.setVerticalGroup(
            DeskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        MenuCardápio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastro.png"))); // NOI18N
        MenuCardápio.setText("Cadastro");
        MenuCardápio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCardápioActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cliente.png"))); // NOI18N
        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuCardápio.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cardapio.png"))); // NOI18N
        jMenuItem2.setText("Cardápio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuCardápio.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/entregador.png"))); // NOI18N
        jMenuItem3.setText("Entregador");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MenuCardápio.add(jMenuItem3);

        jMenuBar1.add(MenuCardápio);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/caixa.png"))); // NOI18N
        jMenu2.setText("Caixa");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cart.png"))); // NOI18N
        jMenuItem4.setText("Pedido");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        MenuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/report.png"))); // NOI18N
        MenuRelatorio.setText("Relatórios");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/reportview.png"))); // NOI18N
        jMenuItem5.setText("Relatório de Vendas");
        MenuRelatorio.add(jMenuItem5);

        jMenuBar1.add(MenuRelatorio);

        MenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        MenuSair.setText("Sair");
        MenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuSairMousePressed(evt);
            }
        });
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deskpainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deskpainel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenuSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSairMousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_MenuSairMousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (!CadastroCardapio.getInstancia().isVisible() && !CadastroEntregador.getInstancia().isVisible()){
            gerenteDeJanelas.abrirJanela(CadastroCliente.getInstancia());
            try {
                CadastroCliente.getInstancia().setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
        
//         System.out.println(CadastroCliente.getInstancia());
//         gerenteDeJanelas.fecharJanela(CadastroEntregador.getInstancia());
//         gerenteDeJanelas.fecharJanela(CadastroCardapio.getInstancia());
         //CadastroCardapio.getClose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if (!CadastroCliente.getInstancia().isVisible() && !CadastroEntregador.getInstancia().isVisible()){
            gerenteDeJanelas.abrirJanela(CadastroCardapio.getInstancia());
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if (!CadastroCliente.getInstancia().isVisible() && !CadastroCardapio.getInstancia().isVisible()){
            gerenteDeJanelas.abrirJanela(CadastroEntregador.getInstancia());
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
         
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void MenuCardápioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCardápioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCardápioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Deskpainel;
    private javax.swing.JMenu MenuCardápio;
    private javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
