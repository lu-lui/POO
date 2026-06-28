package personagens;

import sobrevivenciajurassica.Dado;
import sobrevivenciajurassica.Posicao;
import sobrevivenciajurassica.Tabuleiro;

public class TRex extends Dinossauro{
   public TRex(Posicao posicao){
        super("R", 3, posicao); //saude começa em 3
    }
   
   @Override
   public void mover(Tabuleiro tabuleiro){
        //nn se move
   }
   
   @Override
   public void atacarJogador(Jogador jogador){
        int dado = Dado.dado3();
        if (dado > jogador.getPercepcao()) {
            jogador.recebeDano(2); 
        }
    }
}