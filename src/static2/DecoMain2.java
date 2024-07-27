package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);

        //static이 있으면 선언 없이 바로 부를수 있다.
        //클래스명 + .(dot)+메서드 명으로 바로 호출가능
        System.out.println("before: " + s);
        System.out.println("after: " + deco);



    }
}
