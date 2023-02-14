public class Square extends Shapes {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void findArea() {
        System.out.println(a*a);
    }
}
