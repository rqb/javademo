package cn.gov.pbc.java.designpattern.proxy;

/**
 * But in enterprise applications, objects of RealSubject classes, such as our ReportGeneratorImpl will be resource-intensive, 
 * and we should be interested in creating their proxies. 
 * 在企業級應用中，“RealSubject”類的對象，例如我們的“ReportGeneratorImpl”将是资源密集型的，我们应该关注于创建他们的代理。
 * Imagine that the generateComplexReport() method needs to communicate with remote repositories 
 * and services to perform data mining to discover patterns from large data sets. 
 * For that, we perform all the initialization and setup tasks in the constructor. 
 * 想象下，generateComplexReport()方法需要与远程的资源通信，并且服务执行大数据集的数据挖掘来发现模式。
 * Also, the generateSensitiveReport() method has to follow regulatory requirements and security policies 
 * and so needs to be protected from unauthorized access.
 * 同时，generateComplexReport()方法必须遵守法规和安全策略，所以需要免受未经授权的访问。
 * So what we will do is create a proxy – the ReportGeneratorImplProxy class that we will write next.
 * 所以我们要做的就是创建一个代理——ReportGeneratorImplProxy类,我们接下来就写。
 * @author renqingbin
 *
 */
public class ReportGeneratorImplProxyTest {
	
	public static void main(String[] args) {
		Role accessRole=new Role();
        accessRole.setRole("Manager");
        ReportGenerator proxy=new ReportGeneratorImplProxy(accessRole);
        proxy.displayReportTemplate("Pdf",150);
        proxy.generateComplexReport("Pdf",150);
        proxy.generateSensitiveReport();
	}
}
