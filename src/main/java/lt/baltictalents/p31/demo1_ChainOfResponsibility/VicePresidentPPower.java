package lt.baltictalents.p31.demo1_ChainOfResponsibility;

public class VicePresidentPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 40;
    }

    protected String getRole() {
        return "Vice President";
    }
}
