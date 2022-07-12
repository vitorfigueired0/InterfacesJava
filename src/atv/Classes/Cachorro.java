package atv.Classes;

import atv.Abstract.Animal;
import atv.Abstract.Mamifero;
import atv.Interfaces.AnimalDeEstimação;
import atv.Interfaces.AnimalDomesticado;

import java.util.Objects;


public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalDeEstimação {
    private String raça;
    private Double tamanho;


    public Cachorro(String nome, String raça, Double tamanho) {
        super(nome);
        this.raça = raça;
        this.tamanho = tamanho;
    }

    @Override
    public String emitirSom() {
        return "Au Au nessa porra";
    }

    @Override
    public String amamentar() {
        return " ";
    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void chamarVeterinario() {

    }

}
