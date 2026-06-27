package itens;

public class CaixaSuprimentos {
    private Item item;
    private boolean temCompsognato;
    
    public CaixaSuprimentos(Item item, boolean temCompsognato){
        this.item = item;
        this.temCompsognato = temCompsognato;
    }
    
    public boolean temCompsognato(){
        return temCompsognato;
    } 
    
    public Item getItem(){ 
        return item; 
    }
}   