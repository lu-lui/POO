/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package jogodavelha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author felipe
 */
public class TicTacToe extends JFrame implements ActionListener {
    private BoardCell[] buttons;
    private boolean playerX;
    private int[] board;

    public TicTacToe() {
        // Inicializa os atributos
        buttons = new BoardCell[9];
        playerX = true;
        board = new int[9]; // 0: vazio, 1: X, 2: O
                
        // Configura a Janela
        setTitle("Jogo da Velha");
        setLayout(new GridLayout(3, 3));
        
        for (int i = 0; i < 9; i++) {
            buttons[i] = new BoardCell();
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setSize(800, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        BoardCell clickedButton = (BoardCell) e.getSource();
        int index = -1;
        for (int i = 0; i < 9; i++) {
            if (clickedButton == buttons[i]) {
                index = i;
                break;
            }
        }

        if (board[index] == 0) {
            board[index] = playerX ? 1 : 2;
            //clickedButton.setText(playerX ? "X" : "O");
            clickedButton.setIcon(playerX ? BoardCell.ICON_X : BoardCell.ICON_O);
            playerX = !playerX;

            if (checkWin()) {
                JOptionPane.showMessageDialog(this, (playerX ? "O" : "X") + " venceu!");
                resetGame();
            } else if (checkDraw()) {
                JOptionPane.showMessageDialog(this, "Empate!");
                resetGame();
            }
        }
    }

    public boolean checkWin() {
        // Verifica linhas, colunas e diagonais
        int[][] winConditions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
        for (int[] condition : winConditions) {
            if (board[condition[0]] != 0 && board[condition[0]] == board[condition[1]] && board[condition[1]] == board[condition[2]]) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDraw() {
        for (int i : board) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }

    public void resetGame() {
        for (int i = 0; i < 9; i++) {
            board[i] = 0;
            //buttons[i].setText("");
            //buttons[i].setIcon(iconVazio);
            buttons[i].resetIcon();
        }
        playerX = true;
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
