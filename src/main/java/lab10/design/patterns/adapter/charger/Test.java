package lab10.design.patterns.adapter.charger;

public class Test {
    public static void main(String[] args) {
        PhoneUSBc phone =new PhoneUSBc();
        LightningCharger oldCharger = new LightningCharger(25);
        UsbCCharger adapter = new LightningToUsbCAdapter(oldCharger);
        phone.charge(adapter);
    }
}
