package Models;

public class CartItem {

    public String name;
    public int price;
    public float qty;

    public CartItem(String name,int price){
        this.name=name;
        this.price=price;
        qty=1;
    }

    public CartItem(String name,int price, float qty){
        this.qty=qty;
        this.price=price;
        this.name=name;
    }
}
