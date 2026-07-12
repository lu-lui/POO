package prova2025;

import java.lang.IllegalArgumentException;

public class Servico implements Pagavel {
    private double valorHora;
    private int horas;

    public Servico(double valorHora, int horas) throws IllegalArgumentException{
        
        if(valorHora < 0 || horas < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo!");
        }
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public double calcularTotal(){
            double total = valorHora * horas;
            return total;
    }
}
