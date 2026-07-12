/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario.excecoes;

/**
 *
 * @author felip
 */
public class ContaNaoLocalizada extends ExcecoesDoBanco {
    public ContaNaoLocalizada() {
        super();
    }
    public ContaNaoLocalizada(String mensagem) {
        super(mensagem);
    }
}
