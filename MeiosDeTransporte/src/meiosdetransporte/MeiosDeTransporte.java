package meiosdetransporte;

public class MeiosDeTransporte {
    public static void main(String[] args) {
       /*Veiculo veiculo = new Veiculo("fiat", 4, "uno");
       Bicicleta bici = new Bicicleta("monark", 2, "sla", 5, false);
       Moto moto = new Moto("honda", 2, "titan", 125, true);
       Carro carro = new Carro("mitsubishi", 4, "lancer", 2000, 4);
       
       veiculo.acelerar(20);
       veiculo.imprimirInformacoes();
       bici.imprimirInformacoes();
       carro.acelerar(300);
       carro.imprimirInformacoes();
       carro.frear(120);
       carro.imprimirInformacoes();
       moto.imprimirInformacoes();*/
       
       
       //nova implementação com a classe CadastroDeVeiculos
        
        CadastroDeVeiculos lista = new CadastroDeVeiculos(2);
        lista.inserir(new Carro("Fiat", 4, "Strada", 1600, 3));
        lista.inserir(new Bicicleta("Caloi", 2, "Barra Forte", 1, true));
        lista.inserir(new Carro("GM", 4, "Classic", 1300, 4));
        lista.inserir(new Moto("Honda", 2, "CG", 125, false));
        
        lista.imprimir();
        
        lista.retornaItem(2).imprimirInformacoes();
    }
}