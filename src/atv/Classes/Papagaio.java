package atv.Classes;

import atv.Abstract.Ave;

public class Papagaio extends Ave {
    public Papagaio(String nome) {
        super(nome);
    }
    @Override
    public String emitirSom() {
        return "RÁRÁRÁŔA";
    }

    @Override
    public String voar() {
        return " ";
    }
}
