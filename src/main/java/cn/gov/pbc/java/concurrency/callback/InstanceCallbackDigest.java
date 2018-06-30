package cn.gov.pbc.java.concurrency.callback;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class InstanceCallbackDigest implements Runnable { 
    private File inputFile;         //Ŀ���ļ� 
    //ÿ���̰߳�һ���ص����� 
    private InstanceCallbackDigestUserInterface instanceCallback; 

    /** 
     * ����ʱһ��ע��ص����� 
     * 
     * @param instanceCallback 
     * @param inputFile 
     */ 
    public InstanceCallbackDigest(InstanceCallbackDigestUserInterface instanceCallback, File inputFile) { 
        this.instanceCallback = instanceCallback; 
        this.inputFile = inputFile; 
    } 

    public void run() { 
        try { 
            FileInputStream in = new FileInputStream(inputFile); 
            MessageDigest sha = MessageDigest.getInstance("MD5"); 
            DigestInputStream din = new DigestInputStream(in, sha); 
            int b; 
            while ((b = din.read()) != -1) ; 
            din.close(); 
            byte[] digest = sha.digest();   //ժҪ�� 
            //��ɺ󣬻ص����߳̾�̬���������ļ���-ժҪ�������ݸ�ס�߳�  
            instanceCallback.receiveDigest(digest); 
        } catch (FileNotFoundException e) { 
            e.printStackTrace(); 
        } catch (NoSuchAlgorithmException e) { 
            e.printStackTrace(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
}
