package basic_upgrade.capsule;


// 동일한 패키지에 다른 클래스 상속 받을 때 아래와 같이 사용
// protected의 경우 상속을 통해 사용 가능하나 private는 상속 불가
// 아래와 같이 필드 재선언을 통해서 사용 가능
// 여기서 T라는 것은 제너릭으로 any와 같은 개념으로 볼 수 있음
public class ExtendClass<T> extends Encapsulation {
    private T userPhone;
    private T userNickName;

    public ExtendClass(String userName, T userPhone, String userAddress, T userNickName) {
        super(userName, null, userAddress);
        this.userPhone = userPhone;
        this.userNickName = userNickName;
    }

    public static void main(String[] args) {
    String userName = "Tester";
    String userPhone = "010.0000.0000";
    String userAddress = "ㅇㅇ시 ㅇㅇ구 ㅇㅇ동";
    String userNickName = "별명";
    ExtendClass user = new ExtendClass(userName, userPhone, userAddress, userNickName);
    
    System.out.println(
    "이름: "+ user.userName +'\n'+   
    "전화번호: "+ user.userPhone +'\n'+
    "주소: "+ user.userAddress +'\n'+
    "별명: "+ user.userNickName
    );   
    }
}
