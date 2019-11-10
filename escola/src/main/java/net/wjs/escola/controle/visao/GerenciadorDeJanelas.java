package br.com.controle.visao;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.*;
import java.awt.event.MouseMotionListener;

/**
*
* @author WJS
*/
public class GerenciadorDeJanelas {

    private static JDesktopPane DESKTOP_PANE;
    private JInternalFrame jInternalFrame;

    public GerenciadorDeJanelas(JDesktopPane desktopPane) {
        GerenciadorDeJanelas.DESKTOP_PANE = desktopPane;
    }

    public void openInternalFrame(JInternalFrame janela) {
        this.jInternalFrame = janela;
        if (janela.isVisible()) {
            janela.toFront();
            janela.requestFocus();
        } else {
            DESKTOP_PANE.add(janela);
            janela.setVisible(true);
            bloquearIFrames(janela);
        }
    }

    public static JDesktopPane getDESKTOP_PANE() {
        if (DESKTOP_PANE == null) {
            JOptionPane.showMessageDialog(null, "Não extiste um painel de Area de Trabalho disponivel!");
        }
        return DESKTOP_PANE;
    }

    public void setDESKTOP_PANE(JDesktopPane DESKTOP_PANE) {
        GerenciadorDeJanelas.DESKTOP_PANE = DESKTOP_PANE;
    }

    private void setPosicao() {
        Dimension d = GerenciadorDeJanelas.getDESKTOP_PANE().getSize();
        jInternalFrame.setLocation((d.width - jInternalFrame.getSize().width) / 2, (d.height - jInternalFrame.getSize().height) / 2);
    }

    private void bloquearIFrames(JInternalFrame jInternalFrame) {
        BasicInternalFrameUI ui = (BasicInternalFrameUI) jInternalFrame.getUI();
        Component north = ui.getNorthPane();
        if (north != null) {
            MouseMotionListener[] actions = (MouseMotionListener[]) north.getListeners(MouseMotionListener.class);
            for (MouseMotionListener action : actions) {
                north.removeMouseMotionListener(action);
            }
        }
    }
}
