package sobrevivenciajurassica;

import itens.CaixaSuprimentos;
import personagens.Dinossauro;
import personagens.Jogador;

public class Celula {
    private Dinossauro dinossauro;
    private CaixaSuprimentos caixa;
    private boolean parede;
    private Jogador jogador;
    
    public boolean estaVazia(){
        if(!parede && caixa == null && dinossauro == null)
            return true;
        return false;
    }
    
    public boolean estaJogador(){
        return jogador != null;
    }
    
    public String mostraConteudo(){
        if(ehParede())
            return "#";
        if(estaJogador()){
            if(temDinossauro())
                return "P+" + dinossauro.getNomeDino();
            if(temCaixa())
                return "P+X";
            return "P";
        }
        if(temDinossauro())
            return dinossauro.getNomeDino();
        if(temCaixa())
            return "X";
        return " ";
    }
    
    public boolean ehParede(){
        return parede; 
    }
    
    public boolean temDinossauro(){ 
        return dinossauro != null; 
    }
    
    public boolean temCaixa(){
        return caixa != null;
    }

    public Dinossauro getDinossauro(){ 
        return dinossauro; 
    }
    
    public void setDinossauro(Dinossauro dinossauro){ 
        this.dinossauro = dinossauro; 
    }

    public CaixaSuprimentos getCaixa(){ 
        return caixa; 
    }
    
    public void setCaixa(CaixaSuprimentos caixa){ 
        this.caixa = caixa; 
    }

    public void setParede(boolean parede){ 
        this.parede = parede; 
    }
    
    public void setJogador(Jogador jogador){
        this.jogador = jogador;
    }
}
