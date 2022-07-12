package lambdatest;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public void addPercent(){
        price += price * 0.1;
    }

    @Override
    public String toString() {
        return "Produto: [" +
                name + "" +
                ", Preço: R$" + String.format("%.2f", price) +
                "]";
    }
}
