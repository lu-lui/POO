package meiosdetransporte;

public class Automovel extends Veiculo {
    private double potencia;
    
    public Automovel (String marca, int qtdRodas, String modelo, double potencia){
        super(marca, qtdRodas, modelo);
        this.potencia = potencia;
    }
    
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Potencia do motor: " + this.potencia);
    }
}
