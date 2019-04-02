public class Main {
    public static void main(String[] args) {
        Square[] arrSquare = new Square[10];
        for (int i = 0; i < arrSquare.length; i++) {
            arrSquare[i] = new Square(Math.random() * 3, " Hinh Vuong " + i);
        }
        for (Square indexArr : arrSquare) {
            System.out.println(indexArr.toString());
            indexArr.howToColor();
        }
    }
}
