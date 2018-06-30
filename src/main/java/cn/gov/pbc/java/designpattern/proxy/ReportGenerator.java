package cn.gov.pbc.java.designpattern.proxy;

public interface  ReportGenerator {
	void displayReportTemplate(String reportFormat,int reportEntries);
    void generateComplexReport(String reportFormat,int reportEntries);
    void generateSensitiveReport();
}
