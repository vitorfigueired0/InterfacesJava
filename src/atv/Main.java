package atv;

import atv.Abstract.Animal;
import atv.Classes.Cachorro;
import atv.Classes.Cavalo;
import atv.Classes.Gato;
import atv.Classes.Papagaio;
import atv.Interfaces.AnimalDomesticado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Animal[] animals = new Animal[4];
        animals[0] = new Cachorro("ScoobyDoo", "Bull", 1.78);
        animals[1] = new Gato("Robson", "Persa");
        animals[2] = new Cavalo("Ricardo");
        animals[3] = new Papagaio("Richarlison");

        System.out.println();
        System.out.println(animals[0].getNome());
        System.out.println(animals[0].emitirSom());
        System.out.println(animals[1].getNome());
        System.out.println(animals[1].emitirSom());
        System.out.println(animals[2].getNome());
        System.out.println(animals[2].emitirSom());
        System.out.println(animals[3].getNome());
        System.out.println(animals[3].emitirSom());

        AnimalDomesticado.teste();

    }
}
