package cn.gov.pbc.java.designpattern.vistor;

public interface MailClient {
	void sendMail(String[] mailinfo);
	void receiveMail(String[] mailinfo);
	boolean accept(MailClientVisitor visitor);
}
