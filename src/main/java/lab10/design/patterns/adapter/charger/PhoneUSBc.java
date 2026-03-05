package lab10.design.patterns.adapter.charger;

public class PhoneUSBc {

    public boolean charge(UsbCCharger charger) {
        if (charger.outputPower() >= 20) {
            System.out.println("Phone is charging...");
            return true;
        } else {
            System.out.println("Not enough power");
            return false;
        }
    }
}