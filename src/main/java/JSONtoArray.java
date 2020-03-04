import Entities.Company;
import Entities.Currency;
import Entities.Securities;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class JSONtoArray {
    String json;
    Gson gson = new Gson();
    ArrayList<Company> list = new ArrayList<>();
    public void JSONtoString(String s) throws IOException {
        json = new String(new BufferedInputStream(new FileInputStream(new File(s))).readAllBytes());
    }
    public void JSONtoArrayList(){
        list = gson.fromJson(json, new TypeToken<ArrayList<Company>>(){}.getType());
        list.stream()
                .map(Company -> String.format("%s  %s", Company.getName_short(), Company.getEgrul_date()))
                .forEach(System.out::println);
    }
    public void getCreatedCompaniesAfterDate(String s){
        String newDate = s.replace('/','-').replace('.','-').replace('/', '-');
        StringBuilder sb = new StringBuilder(newDate);
        if(sb.length() == 8){
            sb.insert(6, "20");
            newDate = sb.toString();
        }
        String toCheck = newDate.substring(8,10);
        int x = Integer.parseInt(toCheck);
        if (x>=21){
            sb.replace(6, 8,"19");
            newDate = sb.toString();
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(newDate,dateTimeFormatter);
        list.stream()
                .filter(Company -> LocalDate.parse(Company.getEgrul_date()).isAfter(localDate))
                .map(Company -> String.format("%s  %s", Company.getName_full(), Company.getEgrul_date()))
                .forEach(System.out::println);
    }
    public void getCurrencyByValue (String s){
        if (s.equals("RUB")) {
            list.stream()
                    .map(Company -> String.format("%s",Company.getSecurities().stream()
                    .map(Securities -> Securities.getCurrency().getId())))
                    .forEach(System.out::println);
        }
    }

    }

