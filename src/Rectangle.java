public class Rectangle extends Shapes {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void findArea() {
        System.out.println(a*b);
    }
}
