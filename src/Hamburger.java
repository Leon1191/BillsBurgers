public class Hamburger {
    private int basePrice;
    private String breadRollType;
    private String meat;

    public Hamburger(int basePrice, String breadRollType, String meat) {
        this.basePrice = basePrice;
        this.breadRollType = breadRollType;
        this.meat = meat;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public int addLettuce(int priceOfOne, int howMutch2Add){
    System.out.println("You was add " + howMutch2Add + " portion/s of lettuce. It cost " + priceOfOne * howMutch2Add + "$");
    return priceOfOne * howMutch2Add;}
    public int addTomato(int priceOfOne, int howMutch2Add){
        System.out.println("You was add " + howMutch2Add + " portion/s of tomato. It cost " + priceOfOne * howMutch2Add + "$");
        return priceOfOne * howMutch2Add;
    }



public void costOfHamburger(){
        addLettuce()+
}

}