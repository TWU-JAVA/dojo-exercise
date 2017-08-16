public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return this.radius*this.radius*3.14;
    }
}
