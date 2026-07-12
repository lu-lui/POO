package prova2025;

public class Prova2025 {

    public static void main(String[] args) {
        Pagavel[] item = new Pagavel[3];
        double soma = 0;
        
        item[0] = new Produto("desinfetante", 7, 10);
        item[1] = new Produto("detergente", 2, 12);
        item[2] = new Servico(25, 4);
        
        for (int i = 0; i < item.length; i++){
            System.out.println("Valor total do item: R$" + item[i].calcularTotal());
            soma += item[i].calcularTotal();
        }
        
        System.out.println("Soma total dos itens: R$" + soma);
    }
    
}
