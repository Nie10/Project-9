import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private static final Map<String, String> phoneBook = new HashMap<String, String>();



    public PhoneBook(){ }

    public void add(String name, String number){
        phoneBook.put(name, number);

    }

    public String lookUp(String name){
        return phoneBook.get(name);
    }

    public void removeEntries(String name){
            phoneBook.remove(name);
    }

    public Set<Map.Entry<String, String>> listAllEntries(){
        return phoneBook.entrySet();
    }
        @Override
        public String toString() {
           return listAllEntries().toString();
    }

    public String reverseLookUp(String number){
        for(Map.Entry<String, String> entry : phoneBook.entrySet()){

            String key = entry.getKey();
            String value = entry.getValue();

            if(number.equals(value)){
                return key;
            }

        }
        return null;

    }

}




//        phoneBook.put("Mom", "302-555-6655");
//        phoneBook.put("Dad", "302- 444-9900");
//        phoneBook.put("MumMum", "856-777-3322");
//        phoneBook.put("PopPop", "856-111-4455");
//        System.out.println(phoneBook);