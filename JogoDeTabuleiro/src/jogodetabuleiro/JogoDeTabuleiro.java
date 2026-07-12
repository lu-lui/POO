/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogodetabuleiro;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Felipe Marques
 */
public final class JogoDeTabuleiro extends JFrame implements ActionListener{
    private final Tabuleiro tabuleiro;
    private final List<Jogador> jogadores;
    private int jogadorDoTurno;
    private final JButton bDado;
    private final PainelDeMensagem pMensagem;
    private static final Random gerador = new Random();
    private static final Color[] coresDosJogadores = {
                                    new Color(0,0,255),
                                    new Color(34,139,34),
                                    new Color(255, 140, 0),
                                    new Color(139, 0, 139)};
    
    public JogoDeTabuleiro() {
        jogadorDoTurno = 0;
        jogadores = new ArrayList<>();
        tabuleiro = new Tabuleiro();
        bDado = new JButton("Rolar o Dado");
        pMensagem = new PainelDeMensagem("Bem-vindo ao Jogo de Tabuleiro!");
    }
    
    private Jogador proximoJogador() {
        jogadorDoTurno++;
        if (jogadorDoTurno >= jogadores.size())
            jogadorDoTurno = 0;
        return jogadores.get(jogadorDoTurno);
    }
    
    private void criarJanela() {
        bDado.addActionListener(this);
        // Caracteristicas da Janela Principal ############################################
        setTitle("Jogo de Tabuleiro");
        setSize(520, 560);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
                
        // Definição dos paineis ---------------------------
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        // -- Painel Superior ----------------------------------
        JPanel pSuperior = new JPanel();
        
        pSuperior.setLayout(new GridBagLayout());
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.8;
        c.weighty = 1.0;
        c.gridx = 0;
        c.gridy = 0;
        pSuperior.add(pMensagem, c);

        c.weightx = 0.2;
        c.weighty = 1.0;
        c.gridx = 1;
        c.gridy = 0;
        pSuperior.add(bDado, c);
        
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 0.1;
        c.gridx = 0;
        c.gridy = 0;
        add(pSuperior, c);

        // -- Tabuleiro --------------------------------------
        c.weightx = 1.0;
        c.weighty = 0.9;
        c.gridx = 0;
        c.gridy = 1;
        add(tabuleiro, c);
    }

    private void atualizarSituacaoDoJogo(int valorDado) {
        Jogador j = jogadores.get(jogadorDoTurno);

        pMensagem.alterarTexto("O Jogador [" + j + "] tirou " + valorDado + " no dado.");
        Celula celula = tabuleiro.moverJogador(j, valorDado);
        
        char tipo = celula.tipo();
        switch(tipo) {
            case 'F' -> fimDoJogo();
            case '?' -> blocoInterrogacao();
        }
    }
    
    private void fimDoJogo() {
        Jogador j = jogadores.get(jogadorDoTurno);
        bDado.setEnabled(false);
        pMensagem.alterarTexto("O Jogador '" + j.getNome() + "' vanceu o jogo!");
        JOptionPane.showMessageDialog(this, "O Jogador '" + j.getNome() + "' vanceu o jogo!");
    }
    
    private void blocoInterrogacao() {
        Jogador j = jogadores.get(jogadorDoTurno);
        int valor = gerador.nextInt(5) - 2; // Valor entre [-2 : 2]
        
        if (valor == 0) { // O jogador fica uma rodada sem jogar
            j.bloquear();
            pMensagem.alterarTexto("O Jogador '" + j.getNome() + "' ficara uma rodada sem jogar!");
            JOptionPane.showMessageDialog(this, "O Jogador '" + j.getNome() + "' ficara uma rodada sem jogar!");
        } else if (valor > 0) {
            pMensagem.alterarTexto("O Jogador '" + j.getNome() + "' avancou " + valor + " casa(s).");
            JOptionPane.showMessageDialog(this, "O Jogador '" + j.getNome() + "' avancou " + valor + " casa(s).");
            atualizarSituacaoDoJogo(valor);
        } else {
            pMensagem.alterarTexto("O Jogador '" + j.getNome() + "' retrocedeu " + valor + " casa(s).");
            JOptionPane.showMessageDialog(this, "O Jogador '" + j.getNome() + "' retrocedeu " + valor + " casa(s).");
            atualizarSituacaoDoJogo(valor);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bDado) {
            Jogador j = jogadores.get(jogadorDoTurno);
            
            if (j.podeJogar()) {
                int valorDado = gerador.nextInt(6) + 1;
                atualizarSituacaoDoJogo(valorDado);
            } else {
                pMensagem.alterarTexto("O Jogador '" + j.getNome() + "' ficara sem jogar nesta rodada!");
                JOptionPane.showMessageDialog(this, "O Jogador '" + j.getNome() + "' ficara sem jogar nesta rodada!");                j.desbloquear();
            }
            
            proximoJogador();
        }
    }
    
    private void configurar() {
        Scanner sc = new Scanner(System.in);

        // - Definir quem são os jogadores -------------------------------------
        System.out.print("Digite o numero de jogadores [2-4]: ");
        int nJogadores = 0;
        do {
            try {
                nJogadores = sc.nextInt();
            } catch (Exception e) {
                System.err.println("Número inválido!");
                nJogadores = 0;
                sc.nextLine();
            }
        } while(nJogadores < 2 || nJogadores > 4);
        sc.nextLine();
        
        for (int i = 0; i < nJogadores; i++) {
            System.out.print("Digite o nome do jogador: ");
            String nomeJogador = sc.nextLine();
            Jogador jogador = new Jogador(nomeJogador, coresDosJogadores[i]);
            jogadores.add(jogador);
        }
        tabuleiro.adicionarJogadores(jogadores);
        //----------------------------------------------------------------------
        
        // - Cria e torna a janela visível -------------------------------------
        criarJanela();
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Código para rodar a janela ------------------------------------------
        EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
            	JogoDeTabuleiro jogo = new JogoDeTabuleiro();
                jogo.configurar();
            }
        });
        // ---------------------------------------------------------------------
    }
}
