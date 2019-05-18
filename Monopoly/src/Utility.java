public class Utility extends Property {
    private int waterOwner;
    private int electricityOwner;

    public Utility(String name, int fine,int id) {
        super(name, fine,id);
    }

    public void setWaterOwner(int waterOwner) {
        this.waterOwner = waterOwner;
        super.owner=waterOwner;
    }

    public void setElectricityOwner(int electricityOwner) {
        this.electricityOwner = electricityOwner;
        super.owner=electricityOwner;
    }
}
