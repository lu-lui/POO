package sobrevivenciajurassica;

import itens.CaixaSuprimentos;
import personagens.Dinossauro;

public class Celula {
    private Dinossauro dinossauro;
    private CaixaSuprimentos caixa;
    private boolean parede;
    
    public boolean ehParede(){
        return parede; 
    }
    
    public boolean temDinossauro(){ 
        return dinossauro != null; 
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
