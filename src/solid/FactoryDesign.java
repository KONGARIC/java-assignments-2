package solid;

public class FactoryDesign {
    public Printer createPrinter(String printer)
    {
        if(printer.equals("color"))
        {
            return new ColorPrint();
        }
        return new Xerox();
    }
}
