package prova2025;

import java.lang.IllegalArgumentException;

public class Produto extends ItemFiscal implements Pagavel {
    private int quantidade;
    
    public Produto(String descricao, double valorUnitario, int quantidade)throws IllegalArgumentException{
        super(descricao, valorUnitario);
        if (quantidade < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo");
        }
        this.quantidade = quantidade;
    }
    
    public double calcularTotal(){
        double total = valorUnitario * quantidade;
        return total;
    }
}