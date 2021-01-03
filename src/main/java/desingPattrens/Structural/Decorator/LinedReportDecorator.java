package main.java.desingPattrens.Structural.Decorator;

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
