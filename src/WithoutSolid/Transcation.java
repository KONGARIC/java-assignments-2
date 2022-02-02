package WithoutSolid;

public class Transcation extends Money{
    public void pay(int amount)
    {
        System.out.println("Amount paid by customer : "+amount);
        if(money-amount>0)
        {
            int res=money-amount;
            System.out.println("Change given to customer : "+res);
            money=0;
        }
        else if(money-amount<0)
        {
            int res=amount-money;
            System.out.println(res+" rs is less");
            money=res;
        }
        else{
            System.out.println("Total clear");
            money=0;
            System.out.println(money);
        }
    }



    public void pay() {
        System.out.println("Paid with UPI");
        money=0;
    }

}
