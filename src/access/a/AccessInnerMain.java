package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();
        //같은 패키지 default 호출
        data.defaultField = 2;
        data.defaultMethod();
        //private 호출 불가
        //data.privateField = 3;
        //data.privateMethod();
        data.innerAccess();
        //내부 호출
    }
}
