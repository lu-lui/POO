package sobrevivenciajurassica;

import itens.CaixaSuprimentos;
import personagens.Dinossauro;

public class Celula {
    private Dinossauro dinossauro;
    private CaixaSuprimentos caixa;
    private boolean parede;
    
    public boolean estaVazia(){
        if(!parede && caixa == null && dinossauro == null)
            return true;
        return false;
    }
    
    public String mostraConteudo(){
        if(temDinossauro())
            return dinossauro.getNomeDino();
        if(ehParede())
            return "#";
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
}
