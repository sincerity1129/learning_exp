package basic_upgrade;

public class Encapsulation {
    /*
    default: 키워드를 아무것도 붙이지 않은 것으로 동일 패키지에서 접근 가능
    public: 외부에서 접근 가능
    private: 외부에서 접근 불가(동일 패키지 다른 파일의 클래스 사용 가능, 다른 클래스 간에 사용 불가)
    protected: 외부에서 접근 불가(동일 파일 다른 클래스 사용가능, 동일 패키지 다른 파일 상속 등 활용할 때 쓸 수 있음)
    */
    public String userName;
    private String userPhone;
    protected String userAddress;

    // public 적용
    public Encapsulation(String userName, String userPhone, String userAddress){
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
    }

    public static void main(String[] args) {
    String userName = "Tester";
    String userPhone = "010-0000-0000";
    String userAddress = "ㅇㅇ시 ㅇㅇ구 ㅇㅇ동";
    // 동일 클래스 내 다른 함수의 경우
    // 3개 다 가능
    Encapsulation pubilc_call = new Encapsulation(userName, userPhone, userAddress);
    System.out.println(String.format(
        "Public 호출: \n이름-%s \n번호-%s \n주소-%s", //
        pubilc_call.userName, pubilc_call.userPhone, pubilc_call.userAddress));
    Encapsulation2.main(args);
    }
    
}

// 다른 클래스에서 사용 할 경우
// private는 사용 할 수 없음
class Encapsulation2 {
    private Encapsulation encapsulationInstance;

    public Encapsulation2(String userName, String userPhone, String userAddress){
    this.encapsulationInstance = new Encapsulation(userName, userPhone, userAddress);
    }
    public static void main(String[] args) {
        String userName = "Tester2";
        String userPhone = "010-2222-2222";
        String userAddress = "ㅇㅇ2시 ㅇㅇ2구 ㅇㅇ2동";

        Encapsulation2 pubilc_call2 = new Encapsulation2(userName, userPhone, userAddress );
        // pubilc_call2.encapsulationInstance.userPhone 선택지가 없음
        System.out.println("\n");
        System.out.println(String.format(
            "2번 class Public 호출: \n이름-%s \n주소-%s", //
            pubilc_call2.encapsulationInstance.userName, pubilc_call2.encapsulationInstance.userAddress));
        }
    }
