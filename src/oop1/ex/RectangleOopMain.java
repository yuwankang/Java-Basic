package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넓이: " +area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: "+perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: "+square);
        //속성과 기능이 한곳에 뭉쳐있어서 객체 지향은 마치 살아있는듯한 코드
    }
}
