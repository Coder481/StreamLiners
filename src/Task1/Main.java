package Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple",250);
        Product mango = new Product("Mango",150);
        Product mango1 = new Product("Mango",150);

        for (Product product: Arrays.asList(apple,mango,mango1)){
            System.out.println(product);
        }

        System.out.println(mango.equals(mango1));
        SpecialProduct specialProduct = SpecialProduct.applyOffOnProduct(mango,40);
        System.out.println(specialProduct);
    }
}
