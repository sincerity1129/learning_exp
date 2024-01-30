package basic_upgrade.Form;

import java.time.LocalDate;
import java.util.HashMap;

public class Input<T> extends ShopInfo implements ClickEvent {

    public Input(String product, String price,  HashMap<String, Object> defaultProduct){
        super(product, price, defaultProduct);
    }

    public void productInfo(String productname) {
        HashMap<String, Object> products = getDefaultProduct();
        if(products.get(productname)==null){
            System.out.println(
                productname+"는 등록된 상품이 아닙니다."
                );
                return;
            }
            System.out.println(
                productname+"의 가격은 "+products.get(productname)
            );
        }

    public void pruchase(String productname) {
        HashMap<String, Object> products = getDefaultProduct();
        if(products.get(productname)!=null){
        System.out.println(
            productname+"를 구매하셨습니다.\n"+
            "구매 일시는 "+LocalDate.now()+"입니다."
                );
                setProduct(productname);
                return;
            }
        System.out.println(
            productname+"의 상품 정보를 확인해 주세요."
            );
        }


    @Override
    public void onClick(){
        System.out.println(
        "방금 구매하신 상품은 "+getProduct()+"입니다."
        );
    }
}
