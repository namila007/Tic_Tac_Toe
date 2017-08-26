import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by Namila on 8/25/2017.
 */
public class GUI extends JFrame {

    public JButton[][] B = new JButton[3][3];
    public ActionControl actionControl;


    public GUI (){

       setLayout(new GridLayout(3,3));
       actionControl=new ActionControl(this);

    }

    public void addButtons(){

        for(int i=0 ;i<3;i++) {
            for (int j = 0; j < 3; j++) {

                B[i][j] = new JButton();

                B[i][j].addActionListener(actionControl);
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
