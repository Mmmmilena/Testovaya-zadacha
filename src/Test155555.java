public enum Test155555 {
    MILK(2,150),APPLE(3,100), BANANA(4,1000),
    CHIPS(5,10),CHOCOLATE(6,15);

    private int amount;
    private int price;

    private int result() {
        return amount * price;
    }

    Test155555(int amount1, int price1) {
        this.amount = amount1;
        this.price = price1;
    }
    public  int getAmount() {
        return amount;
    }
    public int getPrice() {
        return price;

    }

   @Override
    public String toString() {
        return super.toString() + " " + result();
    }
}
