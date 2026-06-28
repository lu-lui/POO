package personagens;

import sobrevivenciajurassica.Posicao;
import sobrevivenciajurassica.Tabuleiro;

public class Compsognato extends Dinossauro{
    public Compsognato(Posicao posicao){
        super("C", 1, posicao); //saude começa em 1
    }   
    
    @Override
    public void mover(Tabuleiro tabuleiro){
        moveAleatorio(tabuleiro);
    }
}
