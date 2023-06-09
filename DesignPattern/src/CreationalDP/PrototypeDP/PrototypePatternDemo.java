package CreationalDP.PrototypeDP;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        //1. Yol

        Soldier availableSoldier1=new Soldier(100,45,20,
                50,60,5,"Kilic",true);

        Soldier notAvailableSoldier1=new Soldier(100,45,20,
                50,60,5,"Kilic",false);


        //2. Yol

        Soldier notAvailableSoldier2=  availableSoldier1.clone();
        notAvailableSoldier2.setAvailableForWar(false);

        System.out.println("***********************************");
        System.out.println("NotAvailableSoldier için cıktı :");
        notAvailableSoldier1.showSoldierInfo();


        System.out.println("**********************************");
        System.out.println("Clone ozelligi kulllanılarak retilen askerin çıktısı");
        notAvailableSoldier2.showSoldierInfo();
    }
}
