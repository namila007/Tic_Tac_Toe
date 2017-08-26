
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Namila on 8/26/2017.
 */
public class ActionControl extends TicController implements ActionListener {


    private final GUI view;
    private Icon play;

    public ActionControl(GUI view){

        this.view=view;


    }

    @Override
    public void actionPerformed(ActionEvent e){
        int i=0;
        int j=0;
        for( i=0;i<3;i++) {
            for (j=0; j < 3; j++) {
                if (e.getSource() == view.B[i][j]) {
                    try{
                        play = new ImageIcon(getClass().getResource(nowPlaying.getSymbol()));

                    }catch (Exception ff){
                        System.out.println(ff);
                    }

                    view.B[i][j].setIcon(play);
                    view.B[i][j].setDisabledIcon(play);
                    view.B[i][j].setEnabled(false);
                    setTicValue(i,j);

                    if (nowPlaying == player1) setNowPlaying(player2);
                    else setNowPlaying(player1);
                }
            }


        }
    }



}
