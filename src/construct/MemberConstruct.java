package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade){//생성자의 이름은 클래스와 같아야한다. 반환타입이 없다.
        System.out.println("생성자 호출 name="+name+",age="+age+",grade="+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
