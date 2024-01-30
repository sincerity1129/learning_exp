package basic_upgrade.Form;

import java.time.LocalDate;
import java.util.HashMap;

public class ShopInfo {
    private String product;
    private String price;
    private HashMap<String, Object> defaultProduct;

    public ShopInfo(String product, String price, HashMap<String, Object> defaultProduct) {
        this.product = product;
        this.price = price;
        this.defaultProduct = defaultProduct;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public HashMap<String, Object> getDefaultProduct() {
        return this.defaultProduct;
    }

    public void setDefaultProduct(HashMap<String, Object> defaultProduct) {
        this.defaultProduct = defaultProduct;
    }
}
