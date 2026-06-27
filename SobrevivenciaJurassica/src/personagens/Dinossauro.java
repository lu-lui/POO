package personagens;

import sobrevivenciajurassica.Posicao;
import sobrevivenciajurassica.Tabuleiro;
import sobrevivenciajurassica.Dado;

public abstract class Dinossauro extends Personagem implements Movimentos{
    public Dinossauro(int saude, Posicao posicao){
        super(saude, posicao);
    }
    
    public abstract void mover(Tabuleiro tabuleiro);
    
    public void moveAleatorio(Tabuleiro tabuleiro){
        int linha = posicao.getLinha();
        int coluna = posicao.getColuna();
        int novaL  = linha;
        int novaC = coluna;
        
        int direcao = Dado.dado4();
        
        if (direcao == 1) 
            novaL = linha - 1; // cima
        if (direcao == 2) 
            novaL = linha + 1; // baixo
        if (direcao == 3) 
            novaC = coluna - 1; // esquerda
        if (direcao == 4) 
            novaC = coluna + 1; // direita
        
        if (tabuleiro.posicaoValida(novaL, novaC) && !tabuleiro.getCelula(novaL, novaC).temDinossauro()) {
            tabuleiro.getCelula(linha, coluna).setDinossauro(null); //tira o dinossauro da posicao atual
            posicao.setLinha(novaL); //nova posicao
            posicao.setColuna(novaC); //nova posicao
            tabuleiro.getCelula(novaL, novaC).setDinossauro(this); //move o dinossauro p nova posição
        }
    }
    
    public void atacarJogador(Jogador jogador){
        int dado = Dado.dado3();
        if (dado > jogador.getPercepcao()) {
            jogador.recebeDano(1); 
        }
    }
}
