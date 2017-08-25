import javax.swing.*;

/**
 * Created by Namila on 8/25/2017.
 */
public class Main {


    public static void main(String[] args) {
        TicController t=new TicController();
        GUI g=new GUI();

        g.addButtons();
        g.setSize(400,400);
        g.setVisible(true);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
