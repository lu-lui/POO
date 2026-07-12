/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodetabuleiro;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author felipe
 */
public class Jogador extends JPanel {
    private final String nome;
    private int posicao;
    private boolean podeMover;
    
    public Jogador(String nome, Color cor) {
        this.nome = nome;
        this.posicao = 0;
        this.podeMover = true;

        setPreferredSize(new Dimension(20,20));
        setBackground(cor);
	setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
    }
    
    public String getNome() {
        return nome;
    }
    
    public int posicao() {
        return posicao;
    }
    
    public void bloquear() {
        podeMover = false;
    }
    
    public void desbloquear() {
        podeMover = true;
    }
    
    public boolean podeJogar() {
        return podeMover;
    }
    
    public void mover(int valor) {
        if (podeMover) {
            posicao += valor;
            if (posicao < 0)
                posicao = 0;
            else if (posicao >= Tabuleiro.NUMERO_DE_CASAS)
                posicao = Tabuleiro.NUMERO_DE_CASAS - 1;
        } else { // Se ficou sem jogar uma rodada, desbloqueia.
            podeMover = true;
        }
    }
    
    @Override
    public String toString() {
        return "Jogador: " + nome + " - Posicao: " + posicao;
    }
}
