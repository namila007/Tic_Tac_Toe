import javax.swing.*;

/**
 * Created by Namila on 8/25/2017.
 */
public class TicTacToe {


    public static void main(String[] args) {
        TicView ticView =new TicView();
        TicModel model=new TicModel();

        TicController controller=new TicController(model, ticView);

        ticView.setTitle("Tic Toc Toe");
        ticView.setSize(300,300);
        ticView.setLocationRelativeTo(null);
        ticView.setVisible(true);
        ticView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        

    }
}
