package cn.gov.pbc.java.concurrency.callback;

import java.io.File;

public class InstanceCallbackDigestUserInterface { 
    private File inputFile;     //�ص���ÿ���ļ��� 
    private byte digest[];      //�ļ�����ϢժҪ�� 

    public InstanceCallbackDigestUserInterface(File inputFile) { 
        this.inputFile = inputFile; 
    } 

    /** 
     * ����ĳ���ļ�����ϢժҪ�� 
     */ 
    public void calculateDigest() { 
        InstanceCallbackDigest callback = new InstanceCallbackDigest(this, inputFile); 
        Thread t = new Thread(callback); 
        t.start(); 
    } 

    /** 
     * ������ϢժҪ�� 
     * 
     * @param digest 
     */ 
    public void receiveDigest(byte[] digest) { 
        this.digest = digest; 
        //����ϢժҪ�����������̨ʵ����ִ�е���this.toString()���� 
        System.out.println(this); 
    } 

    /** 
     * ��ʾ��� 
     * 
     * @return ��� 
     */ 
    public String toString() { 
        String result = inputFile.getName() + ": "; 
        if (digest != null) { 
            for (byte b : digest) { 
                result += b + " "; 
            } 
        } else { 
            result += "digest �����ã�"; 
        } 
        return result; 
    } 

    public static void main(String[] args) { 
        String arr[] = {"C:\\xcopy.txt", "C:\\x.txt", "C:\\xb.txt", "C:\\bf2.txt"}; 
        args = arr; 
        for (int i = 0; i < args.length; i++) { 
            File f = new File(args[i]); 
            InstanceCallbackDigestUserInterface cb = new InstanceCallbackDigestUserInterface(f); 
            cb.calculateDigest(); 
        } 
    } 
}
