package lt.baltictalents.p31.demo1_ChainOfResponsibility;

public class PresidentPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 60;
    }

    protected String getRole() {
        return "President";
    }
}
