package atv.Classes;

import atv.Interfaces.AnimalDomesticado;
import atv.Abstract.Mamifero;

public class Cavalo extends Mamifero implements AnimalDomesticado {
    public Cavalo(String nome) {
        super(nome);
    }


    @Override
    public String emitirSom() {
        return "hinn in inn";
    }
    @Override
    public String amamentar() {
        return " ";
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
