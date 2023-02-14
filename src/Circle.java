public class Circle extends Shapes {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void findArea() {
        System.out.println(radius*radius);
    }

}
