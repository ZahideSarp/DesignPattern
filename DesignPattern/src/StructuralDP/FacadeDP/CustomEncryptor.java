package StructuralDP.FacadeDP;

public class CustomEncryptor {
    public static void main(String[] args) {
        String text=" Content";

        //!!Kotu dizayn ornegi
        AESEnc aesEnc=new AESEnc();
        aesEnc.encrypt(text);


        MD5Enc md5Enc=new MD5Enc();
        md5Enc.encrypt(text,"KEY");


        SHAEnc shaEnc=new SHAEnc();
        shaEnc.encrypt(text,"KEY", true);

        //!!!İyi bir dizayn ornegi
        System.out.println("**********************************");
        EncFacade encFacade=new EncFacade();
        encFacade.encrypt(text, EncFacade.EncType.AES);
        encFacade.encrypt(text, EncFacade.EncType.SHA);



    }
}
