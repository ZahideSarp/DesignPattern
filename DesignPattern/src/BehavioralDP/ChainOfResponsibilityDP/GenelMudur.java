package BehavioralDP.ChainOfResponsibilityDP;

public class GenelMudur extends Approver{

    public GenelMudur() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {
        System.out.println("Genel Mudur onayladı ...");
        System.out.println("************************");
        return true;
    }
}
