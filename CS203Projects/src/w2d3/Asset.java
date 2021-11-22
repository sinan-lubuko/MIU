package w2d3;

public abstract class Asset {

    protected String name;
    protected String serialNumber;
    protected String category;

    public Asset(String name, String serialNumber, String category) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString(){
        return "Name: "+this.name+", SerialNumber: "+this.serialNumber+" Category: "+this.category;
    }
}
