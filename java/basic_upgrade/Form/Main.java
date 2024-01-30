package basic_upgrade.Form;

import java.util.HashMap;


// dict 활용한 상품 조회 예제 만들기
// HashMap을 차후에 DB로 구성하면 정보 파싱 가능
public class Main {
    public static void main(String[] args) {
        HashMap<String, Object> defaultproduct = new HashMap<String, Object>();
        defaultproduct.put("bag","15,000원");
        defaultproduct.put("shose","25,000원");
        defaultproduct.put("cloth","40,000원");
        defaultproduct.put("phone","250,000원");
        defaultproduct.put("notebook","1,000,000원");
        defaultproduct.put("coffee","4,500원");
        
        Input input = new Input("bag", "15,000원", defaultproduct);
        input.pruchase("shose");
        input.productInfo("notebook");
        input.onClick();
    }
}
