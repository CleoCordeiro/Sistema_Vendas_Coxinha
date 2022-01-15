package Controller;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Cleo
 */
public class GerenteDeJanelas {
    private static JDesktopPane jDesktopPane;
    
    public GerenteDeJanelas(JDesktopPane jDesktopPane){
        GerenteDeJanelas.jDesktopPane = jDesktopPane;
    }
    
    public void abrirJanela(JInternalFrame jInternalFrame){
        if(jInternalFrame.isVisible()){
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();
        } else {
            jDesktopPane.add(jInternalFrame);
            jInternalFrame.setVisible(true);
            setPosicao(jDesktopPane ,jInternalFrame);
        }
    }
    
        public void fecharJanela(JInternalFrame jInternalFrame){
            jInternalFrame.dispose();
    }
      
      public void setPosicao(JDesktopPane jDesktopPane,JInternalFrame jInternalFrame) {
        Dimension d = jDesktopPane.getSize();
        jInternalFrame.setLocation((d.width - jInternalFrame.getSize().width) / 2, (d.height - jInternalFrame.getSize().height) / 2);
    }

}
