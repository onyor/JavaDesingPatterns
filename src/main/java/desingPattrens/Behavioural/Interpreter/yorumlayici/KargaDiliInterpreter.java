package main.java.desingPattrens.Behavioural.Interpreter.yorumlayici;
import main.java.desingPattrens.Behavioural.Interpreter.dil.KargaDili;

public class KargaDiliInterpreter implements Interpreter {
    @Override
    public String yorumla(String soz) {
        KargaDili kargaDili=new KargaDili();
        String turkce = kargaDili.turkceyeCevir(soz);

        return turkce;
    }
}
