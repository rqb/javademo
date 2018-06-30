package cn.gov.pbc.java.designpattern.strategy;

public class Encryptor {
	private EncryptionStrategy encryptionStrategy;
	
	private String plainText;
	
	public Encryptor(EncryptionStrategy encryptionStrategy){
		this.encryptionStrategy = encryptionStrategy;
	}
	
	public void encrypt(){
		encryptionStrategy.encryptData(plainText);
	}
	
	public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }
}
