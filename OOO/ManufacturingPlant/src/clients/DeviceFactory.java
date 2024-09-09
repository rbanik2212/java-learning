package clients;

import prcoesses.GeneralManufacturingProcess;
import prcoesses.SmartphoneManufacturingProcess;

public class DeviceFactory {

    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess();
        manufacturer.launchProcess();
    }



}
