public class RectTriangle {
    private double a;
    private double b;
    private double c;

    public RectTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getC() {             //zwroc przeciwprostokatną
        return c;
    }

    public double circumference(){     //obwód
        return a + b + c;
    }

    public double area(){              //pole
        return 0.5 * a * b;
    }

    public void validate() throws NotRectangularTriangleException{
       if (a * a + b * b != c * c){
           throw new NotRectangularTriangleException("It's not a rectangular triangle");
       }
    }

    public static void main(String[] args) throws NotRectangularTriangleException{
        RectTriangle triangle = new RectTriangle(5.0, 12.0, 13.0);
        triangle.validate();
        System.out.println(triangle.getC());
        System.out.println(triangle.circumference());
        System.out.println(triangle.area());
    }
}
