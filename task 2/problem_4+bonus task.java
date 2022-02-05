abstract class Piece{
    boolean white;
    int x;
    int y;
    public abstract boolean isLegalMove(int x1,int y1, int x2, int y2);
    Piece(boolean white, int x, int y){
        this.white = white;
        this.x=x;
        this.y=y;
    }
}

class King extends Piece{
    King(boolean white,int x, int y){
        super(white,x,y);
    }
    public boolean isLegalMove(int x1,int y1, int x2, int y2){
        int x = Math.abs(x1 - x2);
        int y = Math.abs(y1 - y2);
        if (x + y == 1) {
            return true;
        }
        // Чтобы правильно рассчитать ход, нам нужно добавить класс полной игры и тогда мы сможем посмотреть, занята ли эта клетка кем-то, какого она цвета.
        // Но на джаве мы настолько сильно не изучали синтаксис. Сверху идёт расчет только математически.
        return false;
    }
}
class Knight extends Piece{
    Knight(boolean white,int x, int y){
        super(white,x,y);
    }
    public boolean isLegalMove(int x1,int y1, int x2, int y2){
        int x = Math.abs(x1 - x2);
        int y = Math.abs(y1 - y2);
        if(x * y == 2) return true;
        else return false;
    }
}
class Rook extends Piece{
    Rook(boolean white,int x, int y){
        super(white,x,y);
    }
    public boolean isLegalMove(int x1,int y1, int x2, int y2){
        int x = Math.abs(x1-x2);
        int y = Math.abs(y1-y2);
        if((y == 0 && x > 0) || (y > 0 && x == 0)) return true;
        return false;
    }
}



public class problem_4 {
    public static void main(String args[]){

    }
}
