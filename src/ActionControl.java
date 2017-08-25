
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Namila on 8/26/2017.
 */
public class ActionControl extends TicController implements ActionListener {


    private final GUI view;

    public ActionControl(GUI view){

        this.view=view;


    }


    @Override
    public void actionPerformed(ActionEvent e){
        int i=0;
        for(;i<9;i++) {
            if (e.getSource() == view.B[i]){

                view.B[i].setText(nowPlaying.getSymbol());

                if(nowPlaying==player1)setNowPlaying(player2);
                else setNowPlaying(player1);
            }


        }
    }


}
