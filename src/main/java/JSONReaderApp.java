import java.io.*;
public class JSONReaderApp {
    public static void main(String[] args) throws IOException {
        JSONtoArray jsoNtoArray = new JSONtoArray();
        jsoNtoArray.JSONtoString("C:\\Users\\ВОЛОДЯ\\Desktop\\HomeworkAboutJSON\\src\\main\\resources\\json");
        System.out.println("Вывожу краткое название и дату создания:");
        jsoNtoArray.JSONtoArrayList();
        //jsoNtoArray.getCurrencyOutOfDate();
        System.out.println("Вывожу компании, созданные после указанной даты:");
        jsoNtoArray.getCreatedCompaniesAfterDate("10/02/01");
        //jsoNtoArray.getCurrencyByValue("RUB");
    }
}
