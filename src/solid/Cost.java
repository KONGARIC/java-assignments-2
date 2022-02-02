package solid;

public abstract class Cost {
    static int money;
    public static int amountToPay()
    {
        System.out.println("Total amount : "+money);
        return money;
    }
}
