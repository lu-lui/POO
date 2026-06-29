package personagens;

import sobrevivenciajurassica.Posicao;
import sobrevivenciajurassica.Tabuleiro;
import sobrevivenciajurassica.Dado;

public abstract class Dinossauro extends Personagem implements Movimentos{
    private String nome;
    
    public Dinossauro(String nome, int saude, Posicao posicao){
        super(saude, posicao);
        this.nome = nome;
    }
    
    public abstract void mover(Tabuleiro tabuleiro);
    
    public void moveAleatorio(Tabuleiro tabuleiro){
        int linha = posicao.getLinha();
        int coluna = posicao.getColuna();
        int novaL  = linha;
        int novaC = coluna;
        
        int direcao = Dado.dado6();
        
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
        if(dado > jogador.getPercepcao()){
            System.out.println("Jogador sofreu 1 de dano ao encontrar um " + nome);
            jogador.recebeDano(1);
        }
        
        System.out.println("Jogador esquivou o ataque do " + nome);
    }
    
    public String getNomeDino(){
        return nome;
    }
    
    public int checarSaude(){
        if(saude <= 0){
            System.out.println(nome + " morreu.");
            return 1;
        }
        return 0;
    }
}
