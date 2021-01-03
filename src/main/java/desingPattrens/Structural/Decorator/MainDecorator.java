package main.java.desingPattrens.Structural.Decorator;

public class MainDecorator {
    /**
     * Dekorator -> Dekoratör ("Bir işe uygun olarak dekor hazırlayan.")
     * Bazen nesnelerin bir birinden türemesine çalışma zamanın da ihtiyaç duyulur.
     * Fakat sınıf yapılarını, sınıf hiyerarşilerini run time da değiştiremeyiz.
     * Ama böyle bir hiyerarşiye ihtiyacımız vardır.
     * Tam bu sorunlara çözüm ürete bilmek için Decorator düşünülmüş.
     *
     * Örn:
     * Bir rapor tasarım programımız olduğunu düşünelim.
     * 3 tane taslağımız var. Çizgili, Küçük ve İmza kutucuklu olsun
     * Bizde buna göre bir tasarım yaptık.
     *
     * İstediğimiz zaman, istediğimiz taslağı extend ederek.
     * Taslaklarla istediğimiz kombinasyonu yapabiliyor olmalıyız.
     * Ve bunu runtime da yapabiliyor olmalıyız.
     * @param args
     */
    public static void main(String[] args) {
        String content = getReportContent();
        //String text = straightReportReturn(content);
        String text = linedReportReturn(content);
        //String text = linedSmallReportReturn(content);
        //String text = signatureLinedSmallReportReturn(content);
        System.out.println(text);
    }

    private static String signatureLinedSmallReportReturn(String content) {
        StraightReport straightReport=new StraightReport(content);
        LinedReportDecorator linedReportDecorator = new LinedReportDecorator(straightReport);
        SmallReportDecorator smallReportDecorator = new SmallReportDecorator(linedReportDecorator);
        SignatureReportDecorator signatureReportDecorator=new SignatureReportDecorator(smallReportDecorator);
        return signatureReportDecorator.getText();
    }

    private static String linedSmallReportReturn(String content) {
        StraightReport straightReport=new StraightReport(content);
        LinedReportDecorator linedReportDecorator = new LinedReportDecorator(straightReport);
        SmallReportDecorator smallReportDecorator = new SmallReportDecorator(linedReportDecorator);
        return smallReportDecorator.getText();
    }

    private static String linedReportReturn(String content) {
        StraightReport straightReport = new StraightReport(content);
        LinedReportDecorator linedReportDecorator = new LinedReportDecorator(straightReport);

        return linedReportDecorator.getText();
    }

    private static String straightReportReturn(String content) {
        StraightReport straightReport = new StraightReport(content);

        return straightReport.getText();
    }

    private static String getReportContent() {
        String content = "Lorem Ipsum Nedir?\n" +
                "\nLorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. Lorem Ipsum, adı bilinmeyen bir matbaacının " +
                "\nbir hurufat numune kitabı oluşturmak üzere bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı " +
                "\nsahte metinler olarak kullanılmıştır. Beşyüz yıl boyunca varlığını sürdürmekle kalmamış, aynı zamanda pek değişmeden " +
                "\nelektronik dizgiye de sıçramıştır. 1960'larda Lorem Ipsum pasajları da içeren Letraset yapraklarının yayınlanması ile ve " +
                "\nyakın zamanda Aldus PageMaker gibi Lorem Ipsum sürümleri içeren masaüstü yayıncılık yazılımları ile popüler olmuştur.";
        return content;
    }
}
