package prcoesses;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess{

    public SmartphoneManufacturingProcess(){

    }

    @Override
    protected void assembleDevice() {
        System.out.println( "Smartphone assembled");
    }

    @Override
    protected void testDevice() {
        System.out.println( "smartphone tested");
    }

    @Override
    protected void packageDevice() {
        System.out.println( "packaged device");
    }

    @Override
    protected void storeDevice() {
        System.out.println( "device stored");
    }
}
