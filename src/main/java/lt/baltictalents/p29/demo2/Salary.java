package lt.baltictalents.p29.demo2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Salary {

    private BigDecimal amount;

    private LocalDate hired;

    private LocalDate fired;

    public Salary(BigDecimal amount, LocalDate hired, LocalDate fired) {
        this.amount = amount;
        this.hired = hired;
        this.fired = fired;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getHired() {
        return hired;
    }

    public void setHired(LocalDate hired) {
        this.hired = hired;
    }

    public LocalDate getFired() {
        return fired;
    }

    public void setFired(LocalDate fired) {
        this.fired = fired;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "amount=" + amount +
                ", hired=" + hired +
                ", fired=" + fired +
                '}';
    }
}
