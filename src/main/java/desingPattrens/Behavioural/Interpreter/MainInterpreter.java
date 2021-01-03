package main.java.desingPattrens.Behavioural.Interpreter;

import main.java.desingPattrens.Behavioural.Interpreter.yorumlayici.Interpreter;
import main.java.desingPattrens.Behavioural.Interpreter.yorumlayici.KargaDiliInterpreter;
import main.java.desingPattrens.Behavioural.Interpreter.yorumlayici.KusDiliInterpreter;

public class MainInterpreter {
    /**
     * Interpreter -> Yorumlayıcı
     * Belirli bir düzeyde kendi içinde bir mantıkla yazılmış kendi gramer'i olan bir yapıyı yorumlamak için uygun bir tasarım kalıbıdır.
     *
     * Örn:
     * Kuş dili -> ca ce
     * Karga dili -> ga ge
     * @param args
     */
    public static void main(String[] args) {
        String kusSozu = getKusSozu();
        String kargaSozu = getKargaSozu();


        yazdir(kusSozu, new KusDiliInterpreter());
        yazdir(kargaSozu, new KargaDiliInterpreter());

    }

    private static void yazdir(String kusSozu, Interpreter interpreter){
        String turkce = interpreter.yorumla(kusSozu);
        System.out.println(turkce);
    }

    private static String getKargaSozu() {
        return "Sacadıcık Bacahacadıcır Mecemiciş cacacıcık yecer";
    }

    private static String getKusSozu() {
        return "Sagadıgık Bagahagadıgır Megemigiş cagacıgık yeger";
    }
}
