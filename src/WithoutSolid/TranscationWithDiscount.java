package WithoutSolid;

public class TranscationWithDiscount extends Transcation{
    public void pay() {

        money=money*75/100;
        System.out.println("Paid "+money);
    }
}
