package Collection.Sorting.Project.Amazon;

public class AmazonProduct {
    String productName;
    Double price;
    String discription;
    Double rating;

    @Override
    public String toString() {
        return "AmazonProduct [productName=" + productName + ", price=" + price + ", discription=" + discription
                + ", rating=" + rating + "]";
    }

    public AmazonProduct(String productName, Double price, String discription, Double rating) {
        this.productName = productName;
        this.price = price;
        this.discription = discription;
        this.rating = rating;
    }

}
