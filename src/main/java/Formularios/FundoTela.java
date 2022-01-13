/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formularios;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author Cleo
 */
public class FundoTela extends JDesktopPane {
    private final Image imagem;
    
    public FundoTela(URL imagem){
        this.imagem = new ImageIcon(imagem).getImage();
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
    }
}
