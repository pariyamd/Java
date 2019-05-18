public class Property extends Room{
    String name;
    int owner;
    int fine;
    int price;


    public Property(String name, int fine,int id) {
        super(id);
        this.name = name;
        this.fine = fine;

    }

    public String getName() {
        return name;
    }

    public int getOwner() {
        return owner;
    }

    public int getFine() {
        return fine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
