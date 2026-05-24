package meiosdetransporte;

public class Bicicleta extends Veiculo {
    private int numMarchas;
    private boolean bagageiro;
    
    public Bicicleta (String marca, int qtdRodas, String modelo, int numMarchas, boolean bagageiro){
        super(marca, qtdRodas, modelo);
        this.numMarchas = numMarchas;
        this.bagageiro = bagageiro;
    }
    
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Numero de marchas: " + this.numMarchas);
        System.out.println(this.bagageiro ? "Tem bagageiro: Sim" : "Tem bagageiro: Nao");
    }
}
