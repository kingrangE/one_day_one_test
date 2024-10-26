package design_pattern.templete_method.templete;

public class Main {
    public static void main(String[] args) {

        DataClass csv = new CSVDataClass();
        DataClass docx = new DOCXDataClass();
        DataClass jpg = new JPGDataClass();

        System.out.println("\nCSV Data");
        csv.process();
        System.out.println("\nJPG Data");
        jpg.process();
        System.out.println("\nDOCX Data");
        docx.process();
    }
}