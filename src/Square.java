public class Square {
    private int side;

    public Square(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("side is illegal");
        }
        this.side = side;
    }

    public int area() {
        return side * side;
    }
}
