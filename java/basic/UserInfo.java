package basic;

import java.time.Duration;
import java.time.LocalDateTime;

public class UserInfo {
    // private is inner function 
    // If you want to bring any function from the outside you have to declare pubilc.
    private String userName;
    public String userName2;
    private String userPhone;
    private String userAddress;
    private LocalDateTime userAccessTime;

    public UserInfo(String userName, String userPhone, String userAddress){
        this.userName = userName;
        this.userName2 = userName;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userAccessTime = LocalDateTime.now();
    }

    public void ChangeUserName(String userName) {
        this.userName = userName;
    }
    public void ChangeUserPhone(String userPhone) { 
        this.userPhone = userPhone;
    }
    public void ChangeUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return this.userName;
    }
    public String getUserPhone() {
        return this.userPhone;
    }
    public String getUserAddress() {
        return this.userAddress;
    }
    public LocalDateTime getUserAccessTime() {
        return this.userAccessTime;
    }

    public String Logout() {
        Duration timeCheck = Duration.between(this.userAccessTime, LocalDateTime.now());
        return  String.format(
        "이용해주셔서 감사합니다.\n이용시간: %d sencond", timeCheck.getSeconds());
    }

}
