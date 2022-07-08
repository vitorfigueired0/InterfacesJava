package atv.Classes;

import atv.Abstract.Animal;
import atv.Abstract.Mamifero;
import atv.Interfaces.AnimalDeEstimação;
import atv.Interfaces.AnimalDomesticado;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalDeEstimação {
    private String raça;

    public Gato(String nome, String raça) {
        super(nome);
        this.raça = raça;
    }

    @Override
    public String amamentar() {
        return null;
    }
    @Override
    public String emitirSom() {
        return "Miau miau caralho";
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
    @Override
    public void brincar() {

    }
    @Override
    public void levarPassear() {

    }
}
