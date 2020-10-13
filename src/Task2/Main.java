package Task2;



public class Main {
    public static void main(String[] args) {
        GroceryItem Sugar = new GroceryItem("Sugar",40);
        GroceryItem Dal = new GroceryItem("Dal",90);
        GroceryItem Chips = new GroceryItem("Chips",100);
        GroceryItem Apple = new GroceryItem("Apple",120);

        Cart cart = new Cart();
        cart.add(GroceryCartItem.createNew(Sugar,"2kg 500g"))
                .add(GroceryCartItem.createNew(Dal,"1kg 0g"))
                .add(GroceryCartItem.createNew(Chips,"0kg 800g"))
                .add(GroceryCartItem.createNew(Apple,"1kg 500g"));
        System.out.println(cart);
    }
}
