package main.java.desingpattrens.Behavioural.Interpreter.yorumlayici;

import main.java.desingpattrens.Behavioural.Interpreter.dil.KusDili;

public class KusDiliInterpreter implements Interpreter {
    @Override
    public String yorumla(String soz) {
        KusDili kusDili=new KusDili();
        String turkce = kusDili.turkceyeCevir(soz);

        return turkce;
    }
}
