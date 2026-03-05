package lab10.design.patterns.adapter.charger;

public class LightningCharger {

    private int power;

    public LightningCharger(int power) {
        this.power = power;
    }

    public int lightningPower() {
        return power;
    }
}