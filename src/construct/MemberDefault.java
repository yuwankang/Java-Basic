package construct;

public class MemberDefault {
    String name;

    public MemberDefault(){
        System.out.println("생성자 호출"); //자바의 생성자는 1개도 없을경우 자동으로 생성된다.
        //생성자는 반드시 호출되어야 한다
        //생성자가 없으면 기본 생성자가 제공된다.
        //생성자가 하나라도 있으면 기본생성자가 제공되지않는다. 이 경우 개발자가 정의한 생성자를 직접호출해야한다.
    }
}
