package cn.gov.pbc.java.designpattern.strategy;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AesEncryptionStrategy implements EncryptionStrategy {

	@Override
	public void encryptData(String plaintext) {
		System.out.println("-----ʹ��AES�㷨��������-------");
		try {
	           KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
	           keyGenerator.init(128);
	           SecretKey secretKey = keyGenerator.generateKey();
	           byte[] plaintTextByteArray = plaintext.getBytes("UTF8");

	           Cipher cipher = Cipher.getInstance("AES");
	           cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	           byte[] cipherText = cipher.doFinal(plaintTextByteArray);

	           System.out.println("Original data: " + plaintext);
	           System.out.println("Encrypted data:");
	           for (int i = 0; i < cipherText.length; i++) {
	               System.out.print(cipherText[i] + " ");

	           }
	       }
	           catch(Exception ex){
	               ex.printStackTrace();
	           }
	       }
}
