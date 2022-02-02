package solid;

public class InternetServiceShop {
    public static void main(String[] arg)
    {
        System.out.println("Person 1: ");
        BuyRoughWhiteBooks white_book=new BuyRoughWhiteBooks();
        white_book.bookType();
        white_book.paperType();
        white_book.howMany(4);
        white_book.buy();
        //white_book.calculateCost();
        //ColorPrint colorPrint = new ColorPrint();
        //ColorPrint color_print= colorPrint;
        //color_print.print();
        // color_print.calculateCost();
        FactoryDesign create=new FactoryDesign();
        Printer obj=create.createPrinter("color");
        obj.print();

        TranscationByUPIwithDiscount transcation=new TranscationByUPIwithDiscount();
       // transcation.amountToPay();
        transcation.discount();
        int amo=Cost.amountToPay();
        transcation.pay();






    }
}
