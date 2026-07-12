package prova2025;

import java.lang.IllegalArgumentException;

public abstract class ItemFiscal {
    protected String descricao;
    protected double valorUnitario;
    
    public ItemFiscal (String descricao, double valorUnitario) throws IllegalArgumentException {
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Erro de preenchimento da descricçao");  
        }
        if (valorUnitario < 0) {
            throw new IllegalArgumentException("O valor digitado não pode ser negativo");
        }
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public double getValorUnitario(){
        return valorUnitario;
    }
}
