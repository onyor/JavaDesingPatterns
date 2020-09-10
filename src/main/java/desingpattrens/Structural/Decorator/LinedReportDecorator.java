package main.java.desingpattrens.Structural.Decorator;

/**
 * Çizgili Rapor Decorator
 */

public class LinedReportDecorator extends ReportDecorator {
    public LinedReportDecorator(IReport report) {
        super(report);
    }

    @Override
    public String getText() {
        String text = super.getText();

        String linedText = ReportUtil.getLinedText(text);

        return linedText;
    }
}
