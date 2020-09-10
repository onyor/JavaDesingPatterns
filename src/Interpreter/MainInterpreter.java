package Interpreter;

import Interpreter.yorumlayici.Interpreter;
import Interpreter.yorumlayici.KargaDiliInterpreter;
import Interpreter.yorumlayici.KusDiliInterpreter;

public class MainInterpreter {
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
