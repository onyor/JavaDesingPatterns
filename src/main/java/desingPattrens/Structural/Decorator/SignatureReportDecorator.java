package main.java.desingPattrens.Structural.Decorator;

public class SignatureReportDecorator extends ReportDecorator {
    
    public SignatureReportDecorator(IReport report) {
        super(report);
    }

    @Override
    public String getText() {
        String text = super.getText();
        String signatureText=ReportUtil.addSignedTextToTheEnd(text);
        return signatureText;
    }
}
