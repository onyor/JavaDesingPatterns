package Interpreter.yorumlayici;

import Interpreter.dil.KargaDili;
import Interpreter.dil.KusDili;

public class KargaDiliInterpreter implements Interpreter {
    @Override
    public String yorumla(String soz) {
        KargaDili kargaDili=new KargaDili();
        String turkce = kargaDili.turkceyeCevir(soz);

        return turkce;
    }
}
