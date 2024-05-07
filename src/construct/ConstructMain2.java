package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1",15,90);
        MemberConstruct member2 = new MemberConstruct("user2",16);

        MemberConstruct[] members = {member1,member2};
        //생성자는 인스턴스를 생성하고 나서 즉시 호출된다.
        //생성자를 사용하면 중복호출을 제거해준다.
        //생성자에 입력값을 넣지 않으면 컴파일 오류가 발생한다.
        for(MemberConstruct s : members){
            System.out.println("이름:"+s.name+"나이:"+s.age+"성적:"+s.grade);
        }

    }
}
