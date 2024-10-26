package design_pattern.templete_method.no_templete;

public class Main {
    public static void main(String[] args) {
        CSVDataClass csvDataClass = new CSVDataClass();
        JPGDataClass jpgDataClass = new JPGDataClass();
        DOCXDataClass docxDataClass = new DOCXDataClass();

        //CSV Data
        System.out.println("\nCSV Data");
        csvDataClass.dataLoad();
        csvDataClass.dataProcess();
        csvDataClass.dataSave();
        //JPG Data
        System.out.println("\nJPG Data");
        jpgDataClass.dataLoad();
        jpgDataClass.dataProcess();
        jpgDataClass.dataSave();
        //DOCX Data
        System.out.println("\nDOCX Data");
        docxDataClass.dataLoad();
        docxDataClass.dataProcess();
        docxDataClass.dataSave();
    }
}
