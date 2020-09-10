package Interpreter.yorumlayici;

import Interpreter.dil.KusDili;

public class KusDiliInterpreter implements Interpreter {
    @Override
    public String yorumla(String soz) {
        KusDili kusDili=new KusDili();
        String turkce = kusDili.turkceyeCevir(soz);

        return turkce;
    }
}
