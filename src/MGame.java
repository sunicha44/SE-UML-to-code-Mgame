import java.util.ArrayList;

public class MGame {
    private int roundCat;
    private Board board;
    private Die[] dices;
    private Player[] players;
    private static int N;

    public MGame(int numPlayer) {
        this(numPlayer,50);
    }
    public MGame(int numPlayer,int numRound){
        this(numPlayer,numRound,40);
    }
    public MGame(int numPlayer, int numRound, int numSqrs){
        this(numPlayer,numRound,numSqrs,2);
    }

    public MGame(int numPlayer, int numRound, int numSqrs, int numDices){
        dices = new Die[numDices];
        players = new Player[numPlayer];
        board = new Board(numSqrs);
        initDices();
        N = numRound;
        roundCat = 0;
        initPlayer(numPlayer);
    }

    public void initPlayer(int numPlayer){
        for(int i = 0 ; i < numPlayer ; i++){
            players[i] = new Player("Player "+(i+1),dices,board);
        }
    }
    public void initDices(){
        int numDices = dices.length;
        for(int i = 0 ; i < numDices ; i++){
            dices[i] = new Die();
        }
    }

    public void playGame(){
        for ( ; roundCat < N ; roundCat++ ){
            System.out.println("round : " + (roundCat+1));
            playRound();
        }

    }

    private void playRound(){
        int numPlayer = players.length;
        for(int i = 0 ; i < numPlayer ; i++ ){

            System.out.printf("%s : ",players[i].getName());
            players[i].takeTurn();
        }
        System.out.println();

    }
}
