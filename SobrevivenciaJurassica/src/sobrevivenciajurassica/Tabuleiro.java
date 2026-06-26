package sobrevivenciajurassica;

public class Tabuleiro {
    private Celula[][] tabuleiro;
    private int TAM = 20;
    
    public Tabuleiro(){
        this.tabuleiro = new Celula[TAM][TAM];
        for(int l = 0; l < TAM; l++){
            for(int c = 0; c < TAM; c++){
                tabuleiro[l][c] = new Celula();
            }
        }
    }    
        public int getTamanho(){ 
            return TAM;
        } 
        
        public Celula getCelula(int linha, int coluna){
            return tabuleiro[linha][coluna];
        }
        
        public boolean posicaoValida(int linha, int coluna){
        if (linha < 0 || coluna < 0 || linha >= TAM || coluna >= TAM)
            return false;
        if (tabuleiro[linha][coluna].ehParede())
            return false;
        
        return true;
    }
}
