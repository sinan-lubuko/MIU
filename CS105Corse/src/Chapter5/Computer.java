package Chapter5;

public class Computer {
    private String manufacturer;
    private String  processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(){
      }
    public double computePower(){
        return ramSize*processorSpeed;
    }
    @Override
    public String toString() {
        return manufacturer + " " + processor + " " + ramSize + " " + processorSpeed;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Computer)) return false;
        Computer e = (Computer) o;
        return this.manufacturer.equals(e.manufacturer)
                && this.processor.equals(e.processor);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }
}
