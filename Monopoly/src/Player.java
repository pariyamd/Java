import java.util.ArrayList;

public class Player {
    private int number;
    static int totalPlayers=0;
    private int money;
    private Room currentRoom;
    private ArrayList<Property> properties=new ArrayList<>();
    public boolean buyProperty(Property property){
        if (property.getPrice()>money) return false;
        property.setOwner(number);
        money-=property.getPrice();
        properties.add(property);
        return true;
    }
    public boolean payFine(){
        Property currentProperty=(Property) currentRoom;
        if (properties.contains(currentProperty)) return true;
        if(currentProperty.getFine()>money) return false;
        money-=currentProperty.getFine();
        return true;
    }
    public void play(int steps){
        int id=currentRoom.getId();
        boolean passGO=false;
        for (int i=0;i<steps;i++)
        {
            id++;
            if(id>Main.propertyNum) {
                id = 0;
                money += 200;
                passGO = true;
            }
        }
        currentRoom=Main.getPropertyById(id);
//        going to jail
//        if (currentRoom.equals(Jail) && passGO) money-=200;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public Player() {
    money=1490;
    currentRoom=Main.getPropertyById(0);
    totalPlayers++;
    number=totalPlayers;
    }
}
