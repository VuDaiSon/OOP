package lab10.design.patterns.adapter.charger;

public class LightningToUsbCAdapter implements UsbCCharger {

    private LightningCharger charger;

    public LightningToUsbCAdapter(LightningCharger charger) {
        /* TODO */
        this.charger = charger;
    }

    @Override
    public int outputPower() {
        /* TODO */
        return charger.lightningPower();
    }
}