package loja;

public class Loja {
    public static void main(String[] args) {
        Empregada[] funcionaria = new Empregada[4];
        funcionaria[0] = new Secretaria ("Henrique", 5000, 1996);
        funcionaria[1] = new Empregada ("Paula", 4000, 1971);
        funcionaria[2] = new Empregada ("Mauro", 4000, 1973);
        funcionaria[3] = new Gerente ("Luisa", 8000, 2005,(Secretaria) funcionaria[0], funcionaria[1], funcionaria[2]); //casting secretaria
        
        System.out.println("Funcionarios cadastrados:");
        for(int i=0; i < 4; i++){
            funcionaria[i].imprimeDados();
        }
        
        if (funcionaria[3].toString().equals("Gerente")) {//verifica se é gerente para aplicar casting
            ((Gerente) funcionaria[3]).aumento(500, 500);//executa método da Gerente
        } else {
            System.out.println("ERRO");
        }
        System.out.println("\n*Funcionarias após reajuste salarial*");
        for (int i = 0; i < 4; i++) {
            funcionaria[i].imprimeDados();
        }
    }
    
}
