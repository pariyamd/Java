public class Site extends Property {
    private int houseNum=0;
    private int hotelNum=0;
    private int housePrice;
    private int hotlePrice;
    private int mortgagePrice;

    public Site(String name,int fine,int id,int housePrice, int hotlePrice, int mortgagePrice) {
        super(name,fine,id);
        this.housePrice = housePrice;
        this.hotlePrice = hotlePrice;
        this.mortgagePrice = mortgagePrice;
    }
}
