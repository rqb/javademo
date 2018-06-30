package cn.gov.pbc.java.designpattern.proxy;

/**
 * In the proxy class above, we implemented the same ReportGenerator interface of ReportGeneratorImpl. 
 * This will allow our proxy to be used wherever a ReportGeneratorImpl object is expected. 
 * 
 * In Line 5, we declared a reference to the ReportGeneratorImpl object. 
 * By going with the principle of “Prefer composition over inheritance”, 
 * 我们声明了一个ReportGeneratorImpl对象的引用，根据“ 优先使用（对象）组合，而非（类）继承”的原则。
 * we me made our proxy composed of the real ReportGeneratorImpl object. 
 * We also declared a Role instance variables that we initialized through the constructor. 
 * But, we intentionally refrained from instantiating ReportGeneratorImpl in the constructor – 
 * we want to create it only when it is required. 
 * 
 * From Line 11 – Line 14, we implemented the displayReportTemplate() method. 
 * Again, what I want to point out is that if the client makes a request to display how a report looks like in a particular format (but, without any data), 
 * we don’t want to create the expensive ReportGeneratorImpl object just to display the template. 
 * 
 * It is only when the client calls generateComplexReport() that we wrote from Line 16 to Line 21, 
 * we create a ReportGeneratorImpl object and pass the method call to it. 
 * What we implemented is the functionality of a virtual proxy. 
 * 
 * From Line 22 to Line 33, 
 * we wrote the generateSesnsitiveReport() method to implement the functionality of a protection proxy. 
 * 
 * In this method, we checked the role name of aRole object that the proxy was initialized with. 
 * We allowed access to the ReportGeneratorImpl object only if the role name is Manager. 
 * 
 * @author renqingbin
 *
 */
public class ReportGeneratorImplProxy implements ReportGenerator{
	ReportGenerator reportGeneratorImpl;
    private Role accessRole;
    public ReportGeneratorImplProxy(Role accessRole){
            this.accessRole=accessRole;
    }
 
    @Override
    public void displayReportTemplate(String reportFormat,int reportEntries) {
        System.out.println("ReportGeneratorImplProxy: Displaying blank report template in " + reportFormat + " format with " + reportEntries + " entries");
    }
 
    @Override
    public void  generateComplexReport(String reportFormat,int reportEntries){
        if(reportGeneratorImpl==null)
            reportGeneratorImpl = new ReportGeneratorImpl();
            reportGeneratorImpl.generateComplexReport(reportFormat,reportEntries);
    }
    @Override
    public void generateSensitiveReport(){
        if(accessRole.getRole().equals("Manager")){
            if(reportGeneratorImpl==null)
                reportGeneratorImpl = new ReportGeneratorImpl();
                reportGeneratorImpl.generateSensitiveReport();
        }
        else{
            System.out.println("You are not authorized to access sensitive reports.");
        }
 
    }
}
