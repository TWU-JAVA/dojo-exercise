public class Rectangle {

    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        if(width<=0||length<=0){
            throw new IllegalArgumentException("width or length is illegal");
        }
        this.width = width;
        this.length = length;
    }

    public double area() {
        double area = this.width * this.length;
        return area;
    }


}
