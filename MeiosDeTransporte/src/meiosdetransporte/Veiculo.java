package meiosdetransporte;

public class Veiculo {
    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade = 0;
    
    public Veiculo(String marca, int qtdRodas, String modelo){
        this.marca = marca;
        this.qtdRodas = qtdRodas;
        this.modelo = modelo;
    }
    
    public void imprimirInformacoes(){
        System.out.println("-----Veiculo-----");
        System.out.println("Marca: " + this.marca);
        System.out.println("Quantidade de rodas: " + this.qtdRodas);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade: " + this.velocidade);
    }
    
    public void acelerar(int v){
        this.velocidade += v;
    }
    
    public void frear(int v){
        this.velocidade -= v;
        if(this.velocidade < 0) {
            this.velocidade = 0;
        }
    }
    
}
