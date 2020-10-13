package Task2;

public class GroceryCartItem extends GroceryItem{

    float price;
    float quantity;

    public GroceryCartItem(String name, int pricePerKg) {
        super(name, pricePerKg);
    }

    @Override
    public String toString() {
        return String.format("%s (Rs. %d X %.2f kg) = Rs. %.2f",name,pricePerKg,quantity,price);
    }

    public static float extractQuantity(String quantityStr){
        String[] quantityArr;
        quantityArr = new String[2];
        quantityArr = quantityStr.split(" ");
        quantityArr[0] = quantityArr[0].replace("kg","");
        quantityArr[1] = quantityArr[1].replace("g","");
        float kgs = Integer.parseInt(quantityArr[0]);
        float grams = Integer.parseInt(quantityArr[1]);
        float quantityInt ;
        quantityInt = kgs + (grams/1000);
        return quantityInt;

    }

    public static GroceryCartItem createNew(GroceryItem item , String quantityStr){
       GroceryCartItem cartItem = new GroceryCartItem(item.name , item.pricePerKg);
       cartItem.quantity = extractQuantity(quantityStr);
       cartItem.price = item.pricePerKg*cartItem.quantity;
       return cartItem;

    }
}
