package Part1_Shapes;

public class Cube implements IShape{
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6*Math.pow(side,2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side,3);
    }
}
