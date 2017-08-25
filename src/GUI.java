import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Namila on 8/25/2017.
 */
public class GUI extends JFrame {

    public JButton[] B = new JButton[9];
    public ActionControl actionControl;


    public GUI (){

       setLayout(new GridLayout(3,3));
       actionControl=new ActionControl(this);

    }

    public void addButtons(){
          int i=0;
        for( ;i<9;i++){
             B[i] = new JButton();

            B[i].addActionListener(actionControl);
            this.add(B[i]);

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
