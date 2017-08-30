import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;


/**
 * Created by Namila on 8/25/2017.
 */
public class TicController implements ActionListener {

    private TicView ticView;
    private Player player1,player2;
    private TicModel model;
    private Player nowPlaying;
    private Icon play;
    private static int playingCount=0;
    private int optionPaneValue=0;


    public TicController(TicModel model, TicView ticView){

        player1=new Player("/image/x.png",1);
        player2=new Player("/image/o.png",2);

        this.model=model;
        this.ticView = ticView;
        nowPlaying=player1;



    }

    public void setTicValue(int row,int col){
       playingCount++;
       model.setMatrix(nowPlaying,row,col);
       if(model.findWinner(1)) {
           System.out.println("Player 1 Won");
          // JOptionPane.showMessageDialog(null, "Player 1 Won", "InfoBox: " + "Won", JOptionPane.INFORMATION_MESSAGE);

           optionPaneValue= JOptionPane.showOptionDialog(null,"Player 1 Won.\n Restart the game?","Player 1 Won",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null, null, null);
            if(optionPaneValue==JOptionPane.YES_OPTION) {
                reset();

            }
           if(optionPaneValue==JOptionPane.NO_OPTION) {
               System.exit(0);

           }
       }
        else if(model.findWinner(2)) {
           System.out.println("Player 2 Won");// System.exit(1);
           optionPaneValue= JOptionPane.showOptionDialog(null,"Player 2 Won the game.\n Restart the game?","Player 2 Won",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null, null, null);
           if(optionPaneValue==JOptionPane.YES_OPTION) {
               reset();

           }
           if(optionPaneValue==JOptionPane.NO_OPTION) {
               System.exit(0);

           }
       }
        else if(playingCount==9 ) {
           System.out.println("DRAW");
           optionPaneValue= JOptionPane.showOptionDialog(null,"Draw.\n Restart the game?","Draw Game",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null, null, null);
           if(optionPaneValue==JOptionPane.YES_OPTION) {
               reset();

           }
           if(optionPaneValue==JOptionPane.NO_OPTION) {
               System.exit(0);

           }
       }
    }

    public void setNowPlaying(Player nowPlaying) {
        this.nowPlaying = nowPlaying;
    }


    @Override
    public void actionPerformed(ActionEvent e){
        int i=0;
        int j=0;
        for( i=0;i<3;i++) {
            for (j=0; j < 3; j++) {
                if (e.getSource() == ticView.B[i][j]) {
                    try{
                        play = new ImageIcon(getClass().getResource(nowPlaying.getSymbol()));

                    }catch (Exception ff){
                        System.out.println(ff);
                    }
                    if(ticView.B[i][j].getIcon()==null) {
                        ticView.B[i][j].setIcon(play);
                        ticView.B[i][j].setDisabledIcon(play);

                        setTicValue(i, j);
                        if (nowPlaying == player1) setNowPlaying(player2);
                    	else setNowPlaying(player1);
                    }else System.out.println("set"+nowPlaying.getId());
                    
                }
            }


        }

    }
    public void reset(){
        model.resetMatrix();
        playingCount=0;
        ticView.setVisible(false);
        ticView.dispose();

        TicTacToe.main(null);
    }


}


