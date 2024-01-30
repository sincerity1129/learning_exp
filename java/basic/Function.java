package basic;

public class Function {
public static void main(String[] args) {
        String userName = "Tester";
        String userPhone = "010-0000-0000";
        String userAddress = "ㅇㅇ시 ㅇㅇ구 ㅇㅇ동";

        UserInfo userInfo = new UserInfo(userName, userPhone, userAddress);

        System.out.println(userInfo.getUserName() + userInfo.getUserPhone() + userInfo.getUserAddress());
        userInfo.ChangeUserName("Tester2");
        System.out.println(userInfo.getUserName() + userInfo.getUserPhone() + userInfo.getUserAddress());
        System.out.println(userInfo.getUserAccessTime());
        
        System.out.println(userInfo.Logout());
}
}
