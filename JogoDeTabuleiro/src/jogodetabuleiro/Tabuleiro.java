/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodetabuleiro;

import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Felipe Marques
 */
public class Tabuleiro extends JPanel {
    public static final int NUMERO_DE_CASAS = 21;
    /*
    private final char[][] mapaDoTabuleiro = {{'I', 'V', 'S', 'S', 'S', 'V'},
                                              {'S', 'V', '?', 'V', '?', 'V'},
                                              {'S', 'V', 'S', 'V', 'S', 'V'},
                                              {'?', 'V', 'S', 'V', 'S', 'V'},
                                              {'S', 'V', 'S', 'V', 'S', 'V'},
                                              {'S', 'S', '?', 'V', 'S', 'F'}};
    //*/
    
    private final char[] mapaDoTabuleiro = {'I', 'S', 'S', '?', 'S', 'S',
                                            'S', '?', 'S', 'S', 'S', '?',
                                            'S', 'S', 'S', '?', 'S', 'S',
                                            'S', 'S', 'F'};    
    
    private final Celula[] tabuleiro;
    
    public Tabuleiro () {
        tabuleiro = new Celula[NUMERO_DE_CASAS];

        setLayout(new GridLayout(6, 6));
        
        criarTabuleiro();
    }
    
    public Celula moverJogador(Jogador j, int valor) {
        tabuleiro[j.posicao()].removerJogador(j);
        j.mover(valor);
        tabuleiro[j.posicao()].adicionaJogador(j);
        return tabuleiro[j.posicao()];
    }
    
    public void adicionarJogadores(List<Jogador> jogadores) {
        for(Jogador j : jogadores) {
            tabuleiro[j.posicao()].adicionaJogador(j);
        }
    }

    private void criarTabuleiro() {
        // Linha 1 ---
        int i,j;
        for(i = 0; i < 6; i++) {
            tabuleiro[i] = FabricaDeCelula.fabrica(mapaDoTabuleiro[i]);
            add(tabuleiro[i]);
        }
        // Linha 2 ---
        for(j = 0; j < 5; j++) {
            add(FabricaDeCelula.fabrica('V'));
        }
        tabuleiro[i] = FabricaDeCelula.fabrica(mapaDoTabuleiro[i]);
        add(tabuleiro[i]);
        i++;
        // Linha 3 ---
        for(j = 12; j > 6; i++, j--) {
            tabuleiro[j] = FabricaDeCelula.fabrica(mapaDoTabuleiro[j]);
            add(tabuleiro[j]);
        }
        // Linha 4 ---
        tabuleiro[i] = FabricaDeCelula.fabrica(mapaDoTabuleiro[i]);
        add(tabuleiro[i]);
        i++;
        for(j = 0; j < 5; j++) {
            add(FabricaDeCelula.fabrica('V'));
        }
        // LInha 5 ---
        for(; i < 20; i++) {
            tabuleiro[i] = FabricaDeCelula.fabrica(mapaDoTabuleiro[i]);
            add(tabuleiro[i]);
        }
        // Linha 6 ---
        for(j = 0; j < 5; j++) {
            add(FabricaDeCelula.fabrica('V'));
        }
        tabuleiro[i] = FabricaDeCelula.fabrica(mapaDoTabuleiro[i]);
        add(tabuleiro[i]);
        //--------------------------------------------------------        
    }
    
}
