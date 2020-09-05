package Visitor.saglikBakanligi;

public interface VisitorDesingPattern {

    /**
     * Eğer bu Ziyaretçi sınıfına İlçe visitorunu daha sonra ekleeyeceksek!
     * Bunu implemnete eden bütün class'larda değişiklik yapmamız gereecek.
     *
     */

    String visitHastane(Hastane hastane);
    String visitIl(Il il);
    String visitUlke(Ulke ulke);
}
