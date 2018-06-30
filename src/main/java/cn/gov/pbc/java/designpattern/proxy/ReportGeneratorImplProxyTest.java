package cn.gov.pbc.java.designpattern.proxy;

/**
 * But in enterprise applications, objects of RealSubject classes, such as our ReportGeneratorImpl will be resource-intensive, 
 * and we should be interested in creating their proxies. 
 * ����I�������У���RealSubject��Č��������҂��ġ�ReportGeneratorImpl��������Դ�ܼ��͵ģ�����Ӧ�ù�ע�ڴ������ǵĴ���
 * Imagine that the generateComplexReport() method needs to communicate with remote repositories 
 * and services to perform data mining to discover patterns from large data sets. 
 * For that, we perform all the initialization and setup tasks in the constructor. 
 * �����£�generateComplexReport()������Ҫ��Զ�̵���Դͨ�ţ����ҷ���ִ�д����ݼ��������ھ�������ģʽ��
 * Also, the generateSensitiveReport() method has to follow regulatory requirements and security policies 
 * and so needs to be protected from unauthorized access.
 * ͬʱ��generateComplexReport()�����������ط���Ͱ�ȫ���ԣ�������Ҫ����δ����Ȩ�ķ��ʡ�
 * So what we will do is create a proxy �C the ReportGeneratorImplProxy class that we will write next.
 * ��������Ҫ���ľ��Ǵ���һ��������ReportGeneratorImplProxy��,���ǽ�������д��
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
