package Task1;

public class SpecialProduct extends Product{

    int regularPrice;
    int percentageOff;

    public SpecialProduct(String name, int discountedPrice) {
        super(name, discountedPrice);
    }

    @Override
    public String toString() {
        return String.format("%d percentage off on %d of regular price",percentageOff,regularPrice);
    }

    public static SpecialProduct applyOffOnProduct(Product product , int percentageOff){
        int discountedPrice = (product.price*percentageOff)/100;
        SpecialProduct specialProduct = new SpecialProduct(product.name, discountedPrice);
        specialProduct.regularPrice = product.price;
        specialProduct.percentageOff = percentageOff;
        return specialProduct;
    }
}
