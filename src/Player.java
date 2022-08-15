public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private Die[] dices;

    public Player(String name,Die[] dices,Board board) {
        this.name = name;
        this.dices = dices;
        this.board = board;

        this.piece = new Piece();
        this.piece.setLocation(board.getInitSquare());
    }

    public void takeTurn(){
        int fv = 0;
        int numDies = dices.length;
        for(int i = 0 ; i < numDies ; i++){
            dices[i].roll();

            System.out.printf("dice %d = %d ",(i+1),dices[i].getFaceValue());

            fv += dices[i].getFaceValue();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc,fv);
        this.piece.setLocation(newLoc);

        System.out.printf(" >> total = %d\n",fv);
        System.out.printf("oldloc = %s >> newloc = %s\n",oldLoc.getName(),piece.getLocation().getName());
        System.out.println("---------------------------------");

    }


    public String getName() {
        return name;
    }
}
