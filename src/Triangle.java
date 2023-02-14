public class Triangle extends  Shapes {
   private int a;
  private int b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void findArea() {
        System.out.println((a*b/2));
    }
}
