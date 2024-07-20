package static1;

import pack.Data;

public class Data3 {
    public String name;
    public static int count; //static

    public Data3(String name){
        this.name =name;
        count++; //Data3.count++;같은 클래스 본인 것이기에 생략가능
        //기존 코드를 유지하기 위해서 새로운 클래스 생성
        //static int 변수 타입 앞에 static 키워드가 붙어있다.
        // 객체가 생성되면 생성자에서 정적 변수 count의 값을 하나 증가시킨다.
    }
}
