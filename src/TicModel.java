/**
 * Created by Namila on 8/25/2017.
 */
public class TicModel {
    private static int[][]matrix;

    public TicModel(){
        matrix=new int[3][3];


    }

    public void setMatrix(Player player,int row,int col){
        matrix[row][col]=player.getId();

    }

    public int[][] getMatrix() {
        return matrix;
    }

    public boolean findWinner(int id){
        for(int i=0;i<3;i++){
            //checkiing rows
            if(matrix[i][0]==id && matrix[i][1]==id && matrix[i][2]==id)return true;
            //checking columns
            if(matrix[0][i]==id && matrix[1][i]==id && matrix[2][i]==id)return true;
            //diagonal
            if(matrix[0][0]==id && matrix[1][1]==id && matrix[2][2]==id)return true;
            if(matrix[0][2]==id && matrix[1][1]==id && matrix[2][0]==id)return true;
        }
         return false;
    }

    public void resetMatrix(){
        this.matrix=new int[3][3];

    }

}
