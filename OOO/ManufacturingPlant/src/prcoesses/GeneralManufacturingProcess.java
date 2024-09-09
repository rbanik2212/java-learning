package prcoesses;

public abstract class GeneralManufacturingProcess {


    public void launchProcess(){
        assembleDevice();
        testDevice();
        packageDevice();
        storeDevice();
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();
}
