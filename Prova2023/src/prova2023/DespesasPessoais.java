package prova2023;

import java.util.List;

//versão com lista
public class DespesasPessoais implements Calculavel {
    int cpf;
    List<DespesaMes> despesa;

    public DespesasPessoais(int cpf, List<DespesaMes> despesa) {
        this.cpf = cpf;
        this.despesa = despesa;
    }
    
    public float calcularTotal(int mes){
        float total = 0;
        for (int i = 0; i < despesa.size(); i++){
            if (despesa.get(i).getMes() == mes){
                total += despesa.get(i).getValor();
            }
        }
        return total;
    }

    public int getCPF() {
        return cpf;
    }
}

//versão com vetor normal
/*public class DespesasPessoais implements Calculavel {
    int cpf;
    DespesaMes[] despesa;

    public DespesasPessoais(int cpf, DespesaMes[] despesa) {
        this.cpf = cpf;
        this.despesa = despesa;
    }
    
    public float calcularTotal(int mes){
        float total = 0;
        for (int i = 0; i < despesa.length; i++){
            if (despesa[i].getMes() == mes){
                total += despesa[i].getValor();
            }
        }
        return total;
    }

    public int getCPF() {
        return cpf;
    }
}*/


