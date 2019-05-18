public class Station extends Property {
    private int southOwner;
    private int northOwner;
    private int eastOwner;
    private int westOwner;

    public Station(String name, int fine,int id) {
        super(name, fine,id);
    }

    public void setSouthOwner(int southOwner) {
        super.owner=southOwner;
        this.southOwner = southOwner;
    }

    public void setNorthOwner(int northOwner) {
        super.owner=northOwner;
        this.northOwner = northOwner;
    }

    public void setEastOwner(int eastOwner) {
        super.owner=eastOwner;
        this.eastOwner = eastOwner;
    }

    public void setWestOwner(int westOwner) {
        super.owner=westOwner;
        this.westOwner = westOwner;
    }
}
