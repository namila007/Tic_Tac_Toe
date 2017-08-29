import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


/**
 * Created by Namila on 8/25/2017.
 */
public class TicView extends JFrame {

    public JButton[][] B = new JButton[3][3];



    public TicView(){

       setLayout(new GridLayout(3,3));


    }

    public void addButtons(ActionListener a){

        for(int i=0 ;i<3;i++) {
            for (int j = 0; j < 3; j++) {

                B[i][j] = new JButton();

                B[i][j].addActionListener(a);
                this.add(B[i][j]);

            }
        }

    }



   /* @Override
    public void actionPerformed(ActionEvent e){
         int i=0;
        for(;i<9;i++) {
            if (e.getSource() == B[i]){

            }

        }
    }
*/




}
