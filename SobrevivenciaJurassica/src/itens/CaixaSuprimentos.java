package itens;

import personagens.Compsognato;

public class CaixaSuprimentos {
    private Item item;
    private Compsognato compsognato;
    
    public CaixaSuprimentos(Item item, Compsognato compsognato){
        this.item = item;
        this.compsognato = compsognato;
    }
    
    public boolean temCompsognato(){
        return compsognato != null;
    } 
    
    public Item getItem(){ 
        return item; 
    }
    
    public Compsognato getComp(){
        return compsognato;
    }
}   