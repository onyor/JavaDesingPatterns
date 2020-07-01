package Decorator;

/**
 * Düz Rapor
 */
public class StraightReport implements IReport {

    private  String text;

    public StraightReport(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
