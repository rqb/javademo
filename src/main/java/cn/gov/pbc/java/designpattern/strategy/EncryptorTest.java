package cn.gov.pbc.java.designpattern.strategy;

public class EncryptorTest {

	public static void main(String[] args) {
		AesEncryptionStrategy aesEncryptionStrategy = new AesEncryptionStrategy();
		Encryptor aesencryptor = new Encryptor(aesEncryptionStrategy);
		aesencryptor.setPlainText("1111111111");
		aesencryptor.encrypt();
		
		BlowfishEncryptionStrategy blowfishEncryptionStrategy = new BlowfishEncryptionStrategy();
		Encryptor blowfishencryptor = new Encryptor(blowfishEncryptionStrategy);
		blowfishencryptor.setPlainText("1111111111");
		blowfishencryptor.encrypt();
	}

}
