package WithoutSolid;


public class InternetServiceShop {

    public static void main(String[] arg)
    {
        System.out.println("Person 1: ");
        BuyItems white_book=new BuyItems();
        white_book.bookType();
        white_book.paperType();
        white_book.howMany(4);
        white_book.buy();
        //white_book.calculateCost();
        //ColorPrint colorPrint = new ColorPrint();
        //ColorPrint color_print= colorPrint;
        //color_print.print();
        // color_print.calculateCost();
        Print print=new Print();


        print.colorPrint();
        TranscationWithDiscount transcation=new TranscationWithDiscount();


        transcation.pay();
    }

}
