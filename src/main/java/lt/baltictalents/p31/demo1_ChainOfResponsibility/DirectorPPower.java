package lt.baltictalents.p31.demo1_ChainOfResponsibility;

public class DirectorPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 20;
    }

    protected String getRole() {
        return "Director";
    }
}
