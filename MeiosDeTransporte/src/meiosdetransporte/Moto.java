package meiosdetransporte;

public class Moto extends Automovel {
    private boolean partidaEletrica;
    
    public Moto (String marca, int qtdRodas, String modelo, double potencia, boolean partidaEletrica){
        super(marca, qtdRodas, modelo, potencia);
        this.partidaEletrica = partidaEletrica;
    }
    
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println(this.partidaEletrica ? "Partida eletrica: Sim" : "Partida eletrica: Nao");
    }
}
