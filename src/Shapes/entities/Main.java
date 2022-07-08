package Shapes.entities;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("CALCULO DE ÁREA:");
        System.out.print("Insira a altura do retagulo: ");
        double height = scan.nextDouble();
        System.out.print("Insira a largura do retagulo: ");
        double width = scan.nextDouble();
        System.out.print("Insira o raio do círculo: ");
        double radius = scan.nextDouble();
        AbstractShape circle = new Circle(COLOR.RED, radius);
        AbstractShape rectangle = new Rectangle(COLOR.BLUE, width, height);
        System.out.printf("Área do circulo: %.2f, Cor do círculo: %s%n", circle.area(), circle.getColor());
        System.out.printf("Área do retangulo: %.2f, Cor do retangulo: %s%n ", rectangle.area(), rectangle.getColor());


    }
}
