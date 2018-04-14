/*
 * Created for ICS 4UE.
 */
package TicTac;

import java.awt.*;
import javax.swing.*;


public class TicTac extends JFrame {
    JButton replay = new JButton ("Replay");
    TicTacEvent tictac = new TicTacEvent(this);
    JPanel row1 = new JPanel();
    JButton[ ] [ ] boxes = new JButton [4][4];
    JButton play = new JButton ("Play");
    JTextField blank1 = new JTextField();
    JTextField blank2 = new JTextField();
   // JButton replay = new JButton ("Replay");
    JOptionPane win = new JOptionPane("Winner");
    ImageIcon back = new ImageIcon("cardback.jpg ");
    JOptionPane score = new JOptionPane("Score");
    
    
    
     
    public TicTac() {
        super ("Tic Tac Toe");
     if(replay.isSelected()){     
        setSize (670,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        int name = 0;
        String newname;
        
        
        GridLayout layout1 = new GridLayout(5, 4, 10, 10);
        row1.setLayout(layout1);
        for (int x=0; x<=3; x++){
            for (int y=0; y<=3; y++){
                name = name + 1;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                row1.add(boxes[x][y]);
            }
        }
        row1.add(blank1);
        row1.add(play);
        row1.add(replay);
        row1.add(blank2);
        add (row1);
        
        
        play.addActionListener(tictac);
        for (int x=0; x<=3; x++){
            for (int y=0; y<=3; y++){
                boxes[x][y].addActionListener(tictac);
            }
        }
        
        setVisible(true);
     return ;
    }      
}    
    public static void main(String[] arguments){
        TicTac frame = new TicTac();
    }
 
}