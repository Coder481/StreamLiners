import Models.Cart;
import Models.Product;
import Models.Variant;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product apple = new Product("Apple",120,1);
        Product mango = new Product("Mango",80,2);
        Product kiwi = new Product("Kiwi");
        Variant kiwi1 = new Variant("200g",50);
        Variant kiwi2 = new Variant("500g",115);
        Product banana = new Product("Banana",30,1);

        cart.addVBPToCart(kiwi,kiwi1);
        cart.addVBPToCart(kiwi,kiwi2);
        cart.addVBPToCart(kiwi,kiwi1);
        cart.addVBPToCart(kiwi,kiwi1);
        cart.updateWBPQty(banana,3);
        System.out.println("Total Price: "+cart.totalPrice +"\nTotal No. of Items: "+cart.totalNoOfItems);
        System.out.println(cart.allCartItemsMap);

        cart.removeVBPFromCart(kiwi,kiwi1);
        System.out.println("Total Price: "+cart.totalPrice +"\nTotal No. of Items: "+cart.totalNoOfItems);
        System.out.println(cart.allCartItemsMap);

        cart.removeAllVariantsFromCart(kiwi);
        System.out.println("Total Price: "+cart.totalPrice +"\nTotal No. of Items: "+cart.totalNoOfItems);
        System.out.println(cart.allCartItemsMap);

        cart.updateWBPQty(apple,5);
        cart.updateWBPQty(mango,2);
        cart.updateWBPQty(apple,7);
        cart.addVBPToCart(kiwi,kiwi2);
        System.out.println("Total Price: "+cart.totalPrice +"\nTotal No. of Items: "+cart.totalNoOfItems);
        System.out.println(cart.allCartItemsMap);
        cart.removeWBPFromCart(apple);

        System.out.println("Total Price: "+cart.totalPrice +"\nTotal No. of Items: "+cart.totalNoOfItems);
        System.out.println(cart.allCartItemsMap);

    }
}
