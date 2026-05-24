package meiosdetransporte;

public class Carro extends Automovel {
    int qtdPortas;
    
    public Carro (String marca, int qtdRodas, String modelo, double potencia, int qtdPortas){
        super(marca, qtdRodas, modelo, potencia);
        this.qtdPortas = qtdPortas;
    }
    
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Quantidade de portas: " + this.qtdPortas);
    }
}
