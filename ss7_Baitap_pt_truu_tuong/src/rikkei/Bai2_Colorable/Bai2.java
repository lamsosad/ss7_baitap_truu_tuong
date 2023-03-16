package rikkei.Bai2_Colorable;

public class Bai2 {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square(5);
        for (Shape sh : shape) {
            System.out.println(sh);
            if (sh instanceof Square) {
                ((Square) sh).howToColor();
            }
        }
    }
}
