public class Square {
    private int side;
    public Square(int side) {

        this.side = side;
    }

    public int calculateArea() {
        if(this.side == 0) {
            throw new IndexOutOfBoundsException();

        }
        return side * side;
    }
}
