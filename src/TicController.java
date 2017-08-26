/**
 * Created by Namila on 8/25/2017.
 */
public class TicController {
    public Player player1,player2;
    public TicModel model;
    public Player nowPlaying;
    private static int playingCount=0;


    public TicController(){

        player1=new Player("\\image\\x.png",1);
        player2=new Player("\\image\\o.png",2);
        model=new TicModel();
        nowPlaying=player1;

    }

    public void setTicValue(int row,int col){
       playingCount++;
       model.setMatrix(nowPlaying,row,col);
       if(model.findWinner(1)) System.out.println("Player 1 Won");//System.exit(1);
        else if(model.findWinner(2)) System.out.println("Player 2 Won");// System.exit(1);
        else if(playingCount==9  ) System.out.println("DROW");
    }

    public void setNowPlaying(Player nowPlaying) {
        this.nowPlaying = nowPlaying;
    }
}
