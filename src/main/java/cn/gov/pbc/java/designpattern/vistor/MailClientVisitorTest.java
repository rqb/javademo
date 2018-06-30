package cn.gov.pbc.java.designpattern.vistor;

public class MailClientVisitorTest {
	
	public static void main(String[] args) {
	   MacMailClientVisitor macVisitor = new MacMailClientVisitor();
	   LinuxMailClientVisitor linuxVisitor = new LinuxMailClientVisitor();
	   WindowsMailClientVisitor windowsVisitor = new WindowsMailClientVisitor();
	   OperaMailClient operaMailClient = new OperaMailClient();;
	   SquirrelMailClient squirrelMailClient = new SquirrelMailClient();
	   ZimbraMailClient zimbraMailClient = new ZimbraMailClient();
	   
	   operaMailClient.accept(macVisitor);
	   operaMailClient.accept(linuxVisitor);
	   operaMailClient.accept(windowsVisitor);
	}
	
}
