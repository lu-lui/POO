/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodavelha;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author felipe
 */
public class BoardCell extends JButton {
    public final static ImageIcon ICON_X = new ImageIcon("x.png");
    public final static ImageIcon ICON_O = new ImageIcon("o.png");
    public final static ImageIcon ICON_EMPTY = new ImageIcon("vazio.png");
    
    public BoardCell() {
        super("");
    }
    
    public void setIcon(ImageIcon icon) {
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(getWidth() - 5, getHeight() - 5, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);
        super.setIcon(icon);
    }
    
    public void resetIcon() {
        setIcon(BoardCell.ICON_EMPTY);
    }
}
