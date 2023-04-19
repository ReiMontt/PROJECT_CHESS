import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.*;

import Chess.*;
import Chess.JChessUI;
public class App {
    public static void main(String[] args) throws Exception {
        new myFrame();
    }
}

class myFrame extends JFrame{
    myFrame(){
        int Frame_Width = 500;
        int Frame_Height = 540;
        
        this.setResizable(false); 
        this.setSize(Frame_Width,Frame_Height); 
        this.setTitle("Game");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JChessUI MyChessGame = new JChessUI(500,Chess.Util.PieceColor.WHITE);
        this.add(MyChessGame,BorderLayout.CENTER);

        JButton GoBack = new JButton("Undo");
        GoBack.addActionListener(e -> MyChessGame.ResetGame());
        GoBack.setPreferredSize(new Dimension(40,40));
        
        this.add(GoBack, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}