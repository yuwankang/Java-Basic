package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age){
        this(name,age, 50);//this() 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다.
        //this() 생성자 코드의 첫줄에만 작성할 수 있다.
    }

    MemberConstruct(String name, int age, int grade){//생성자의 이름은 클래스와 같아야한다. 반환타입이 없다.
        System.out.println("생성자 호출 name="+name+",age="+age+",grade="+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
