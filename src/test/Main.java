package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Quantidade de produtos: ");
        int n = scan.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.printf("Produto #%d:%n", i);
            System.out.print("Nome: ");
            String name = scan.next();
            System.out.print("Preço: ");
            double price = scan.nextDouble();
            products.add(new Product(name, price));
        }

        Comparator<Product> compare = (p1, p2) -> p1.getName().compareTo(p2.getName());
        products.sort(compare);
        for(Product p : products){
            System.out.println(p);
        }
    }
}
