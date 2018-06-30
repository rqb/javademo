package cn.gov.pbc.java.designpattern.Prototype;

public class DocumentPrototypeManagerTest {
	 
    public static void main(String[] args) {
        PrototypeCapableDocument clonedTAndC = DocumentPrototypeManager.getClonedDocument("tandc");
        System.out.println(clonedTAndC);
        clonedTAndC.setVendorName("Mary Parker");
        System.out.println(clonedTAndC);
        PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getClonedDocument("nda");
        System.out.println(clonedNDA);
        clonedNDA.setVendorName("Patrick Smith");
        System.out.println(clonedNDA);
	}
}
