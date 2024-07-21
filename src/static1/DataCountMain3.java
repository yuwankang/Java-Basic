package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        //자바가 좋아하지 않는 코드
        //카운트가 인스턴스 변수라고 착각할수 있다. 좋지 않은 코드
        System.out.println(data4.count);

        //클래스를 통한 접근
        // 100프로 스태틱 변수라고 생각된다.
        System.out.println(Data3.count);

        //코드를 보면 count 정적 변수에 접근하는 방법이 특이하다. Data3.count와 같이 클래스 명에
        // .dot을 사용한다. 마치 클래스에 직접 접근하는 것 처럼 느껴진다.
        //static이 붙은 멤버 변수는 메서드 영역에서 관리한다.
        //Data3("A") 인스턴스를 생성하면 생성자가 호출된다.
        //생성자에는 count++코드가 있다. count는 static이 붙은 정적 변수이다.
        // 이 경우 메서드 영역에 있는 count값이 증가된다.
        //static 변수는 자바 로딩시 하나만 존재하게 된다. 스태틱 변수도 보통 하나에 여러 인스턴스에서 공용으로 사용
        // 인스턴스의 수 만큼의 변수가 존재한다.


    }
}
