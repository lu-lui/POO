package personagens;

import sobrevivenciajurassica.Posicao;
import sobrevivenciajurassica.Tabuleiro;

public class Velociraptor extends Dinossauro{
    public Velociraptor(Posicao posicao){
        super(2, posicao); //saude == 2
    }    
    
    @Override
    public void mover(Tabuleiro tabuleiro){
        moveAleatorio(tabuleiro);
        // só faz o segundo movimento se não estiver na posição do jogador
        // (isso será verificado no Jogo.java depois)
        
        moveAleatorio(tabuleiro);
    }
}
