package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter; //this가 없어도 멤버 변수에 접근한다.
    }
}
