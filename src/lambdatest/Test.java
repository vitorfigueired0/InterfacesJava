package lambdatest;

import java.util.List;
import java.util.function.Predicate;

public class Test {

    public double sumFilter(List<Product> products, Predicate<Product> predict){
        double sum = 0.0;
        for(Product product: products){
            if(predict.test(product)){
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
