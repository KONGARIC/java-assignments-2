package solid;

public class TranscationByUPI extends TranscationByCash {
    public void pay()
    {
        System.out.println("Paid with UPI"+money);
        money=0;
    }
}
