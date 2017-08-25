/**
 * Created by Namila on 8/25/2017.
 */
public class Player {
    private String symbol;
    private int id;

    public Player(String symbol,int id){
        this.symbol=symbol;
        this.id=id;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getId() {
        return id;
    }
}
