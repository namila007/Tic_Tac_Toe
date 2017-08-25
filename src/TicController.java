/**
 * Created by Namila on 8/25/2017.
 */
public class TicController {
    public Player player1,player2;
    public TicModel model;
    public Player nowPlaying;


    public TicController(){

        player1=new Player("X",1);
        player2=new Player("O",2);
        model=new TicModel();
        nowPlaying=player1;

    }

    public void setTicValue(int row,int col){
       model.setMatrix(nowPlaying,row,col);
    }

    public void setNowPlaying(Player nowPlaying) {
        this.nowPlaying = nowPlaying;
    }
}
