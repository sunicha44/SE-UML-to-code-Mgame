public class Board {
    private Square[] sqrs;
    private int numSqrs;

    public Board(int num){
        this.numSqrs = num;
        sqrs = new Square[num];
        for(int i = 0 ; i < num ; i++){
            sqrs[i] = new Square();
            sqrs[i].setName(""+i);
        }
    }

    public Square getInitSquare(){
        return sqrs[0];
    }
    public Square getSquare(Square oldloc, int fv){
        int oldInt = Integer.parseInt(oldloc.getName());
        int newInt = (oldInt) + fv;
        if(newInt > numSqrs - 1){
            newInt = Math.abs(newInt - numSqrs);
        }
        return sqrs[newInt];
    }
}
