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
        double raidius = scan.nextDouble();
        AbstractShape circle = new Circle(COLOR.RED, raidius);
        AbstractShape rectangle = new Rectangle(COLOR.BLUE, width, height);
        System.out.printf("Área do circulo: %.2f%n", circle.area());
        System.out.printf("Área do retangulo: %.2f", rectangle.area());


    }
}
