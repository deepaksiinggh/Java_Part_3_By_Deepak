package Collection.Sorting.Project.Amazon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AmazonDriver {
    List<AmazonProduct> product;
    Scanner sc = new Scanner(System.in);

    // to add the product
    public void addProduct() {
        product = new ArrayList<>();
        product.add(new AmazonProduct("Galaxy Phone", 1007898.0, "This is a good phone", 4.8));
        product.add(new AmazonProduct("Air zordan", 500000.0, "This is a good shoes", 4.9));
        product.add(new AmazonProduct("Mac book", 70079.0, "Amezing macBook", 4.2));
        product.add(new AmazonProduct("Air Buds", 1007.0, "bawal airbuds", 4.8));
    }

    // to fetch the product
    public void fetchProduct() {
        boolean flag = true;

        while (flag) {

            System.out.println("*************  Welcome to amazon Website   ***********");
            System.out.println(" 1. Fetch the product based on Product Name");
            System.out.println(" 2. Fetch the product based on Product Price");
            System.out.println(" 3. Fetch the product based on Product Rating");
            System.out.println(" 4. Fetch normal way");
            System.out.println(" 5. Exit....");
            System.out.println("*****************************************************");
            System.out.println("Choose one options");
            int val = sc.nextInt();
            switch (val) {
                case 1: {
                    Comparator<AmazonProduct> shortByName = new Comparator<AmazonProduct>() {
                        @Override
                        public int compare(AmazonProduct a1, AmazonProduct a2) {
                            return a1.productName.compareTo(a2.productName);
                        }

                    };
                    product.sort(shortByName);
                    System.out.println(product);

                }

                    break;

                case 2: {
                    Comparator<AmazonProduct> shortByprice = new Comparator<AmazonProduct>() {
                        @Override
                        public int compare(AmazonProduct a1, AmazonProduct a2) {
                            return a1.price.compareTo(a2.price);
                        }

                    };
                    product.sort(shortByprice);
                    System.out.println(product);

                }

                    break;

                case 3: {
                    Comparator<AmazonProduct> shortByRating = new Comparator<AmazonProduct>() {
                        @Override
                        public int compare(AmazonProduct a1, AmazonProduct a2) {
                            return a1.rating.compareTo(a2.rating);
                        }

                    };
                    product.sort(shortByRating);
                    System.out.println(product);

                }

                    break;

                case 4: {
                    System.out.println(product);
                }
                case 5: {
                    flag = false;
                    System.out.println("exit sucessfully");
                }
                    break;
                default:
                    System.out.println("Please enter the valid number");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        AmazonDriver a1 = new AmazonDriver();
        a1.addProduct();
        a1.fetchProduct();

    }
}
