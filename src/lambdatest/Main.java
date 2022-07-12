package lambdatest;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 200.0));
        products.add(new Product("PC", 2000.0));
        products.add(new Product("Tablet", 450.0));
        products.add(new Product("HD", 250.0));

        for(Product product: products){
            System.out.println(product);
        }

        System.out.println("Soma dos iniciados com 't': ");

        Test test = new Test();
        System.out.println(test.sumFilter(products, p -> p.getName().charAt(0) == 'T'));

    }
}
