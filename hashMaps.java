import java.util.HashMap;

public class hashMaps {
    public static void main(String[] args) {
        HashMap<String,String> zipCode=new HashMap<String,String>();
        zipCode.put("12400","Horana");
        zipCode.put("10000","Panadura");
        zipCode.put("12000","Anuradhapura");
        System.out.println(zipCode);
        for (String i: zipCode.keySet()){
            System.out.print(i+"\t:"+"");

            System.out.println(zipCode.get(i));
        }



    }
}
