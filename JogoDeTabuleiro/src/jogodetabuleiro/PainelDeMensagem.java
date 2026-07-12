/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodetabuleiro;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Felipe Marques
 */
public class PainelDeMensagem extends JPanel {
    private final JLabel mensagem;
    
    public PainelDeMensagem(String texto) {
        mensagem = new JLabel(texto);
        add(mensagem);
    }
    
    public void alterarTexto(String texto) {
        mensagem.setText(texto);
    }
}
