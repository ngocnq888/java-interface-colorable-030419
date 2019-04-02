public class Square implements Colorable {
    public double size;
    public String name;

    public Square() {
    }

    public Square(double size, String name) {
        this.size = size;
        this.name = name;
    }

    public double getArea() {
        return this.size * this.size;
    }

    public double getPerimeter() {
        return this.size * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        String str = " Name: " + this.name + " - Size: " + this.size + " - Area: " + this.getArea() + " - Perimeter: " + this.getPerimeter();
        return str;
    }

}
