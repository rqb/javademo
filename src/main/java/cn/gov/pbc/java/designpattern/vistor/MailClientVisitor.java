package cn.gov.pbc.java.designpattern.vistor;

public interface MailClientVisitor {
	void visit(OperaMailClient mailClient);
    void visit(SquirrelMailClient mailClient);
    void visit(ZimbraMailClient mailClient);
}
