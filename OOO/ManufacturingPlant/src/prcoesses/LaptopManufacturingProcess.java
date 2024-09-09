package prcoesses;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess{
    @Override
    protected void assembleDevice() {
         System.out.println("Laptop assembled");
    }

    @Override
    protected void testDevice() {
         System.out.println("laptop tested");
    }

    @Override
    protected void packageDevice() {
         System.out.println("laptop packaged");
    }

    @Override
    protected void storeDevice() {
         System.out.println("laptop stored");
    }
}
