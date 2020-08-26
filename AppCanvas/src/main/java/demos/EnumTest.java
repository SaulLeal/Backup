package demos;

enum PrinterType {
    DOTMATRIX(5), INKJET(10), LASER(50);

    private int pagePrintCapacity;

    private PrinterType(int pagePrintCapacity) {
        this.pagePrintCapacity = pagePrintCapacity;
    }

    public int getPagePrintCapacity() {
        return pagePrintCapacity;
    }
}

public class EnumTest {
    PrinterType printerType;

    public EnumTest (PrinterType pType) {
        printerType = pType;
    }

    public void feature() {
        switch (printerType) {
            case DOTMATRIX:
                System.out.println("Dot-matrix are economical and almost obsolete");
                break;
            case INKJET:
                System.out.println("Inkjet printers provide decent quality prints");
                break;
            case LASER:
                System.out.println("Laser printers provide best quality prints");
                break;
        }
        System.out.println("Print page capacity per minute: " + printerType.getPagePrintCapacity());
    }

    public static void main(String[] args) {
        EnumTest enumTest = new EnumTest(PrinterType.LASER);
        enumTest.feature();

        EnumTest enumTest2 = new EnumTest(PrinterType.INKJET);
        enumTest2.feature();
    }
}
