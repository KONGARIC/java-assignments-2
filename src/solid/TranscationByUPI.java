package solid;

public class TranscationByUPI extends Cost {
    public void pay()
    {
        System.out.println("Paid with UPI"+money);
        money=0;
    }
}
