package LAB8;

public class Triangle extends Object2D {
    //attributes
    private double width;
    private double lenght;

    //constructor


    public Triangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public void calArea() {

        double area = width * lenght;
        super.setArea(area);
    }

    //getter ang setter

}
