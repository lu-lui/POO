/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodetabuleiro;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JPanel;

/**
 *
 * @author Felipe Marques
 */
public class Celula extends JPanel {
    private final Set<Jogador> jogadores;
    private final char tipo;
    
    public Celula(char t) {
        jogadores = new HashSet<>();
        tipo = t;
    }
    
    public void adicionaJogador(Jogador j) {
        jogadores.add(j);
        add(j);
        repaint();
    }
    
    public void removerJogador(Jogador j) {
        jogadores.remove(j);
        remove(j);
        repaint();
    }
    
    public char tipo() {
        return tipo;
    }
}
