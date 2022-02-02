package solid;

public class TranscationByUPIwithDiscount extends TranscationByUPI implements Discount{
    @Override
    public void discount() {

        money=money*75/100;
        System.out.println("Amount after Discount "+money);
    }


    public void pay() {
        System.out.println("Paid with UPI");
        money=0;
    }
}
