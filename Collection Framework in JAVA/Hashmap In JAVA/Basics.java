import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Basics {

    public static void main (String[] args) {

        Map<String, String> mapping = new HashMap<>();

        mapping.put("In", "India");
        mapping.put("In", "Indonesia");
        mapping.put("EN", "England");
        mapping.put("US", "United States");

        System.out.println(mapping); 
        // Output : {In=Indonesia, EN=England, US=United States}


        // Put ALL (Copy all entries from one map to another)
        Map<String, String> table = new HashMap<>();
        table.put("Br", "Brazil");

        table.putAll(mapping); // Copies all from 'mapping' to 'table'
        System.out.println(table);
        // Output : {Br=Brazil, In=Indonesia, EN=England, US=United States}


        table.remove("EN");
        System.out.println(table);
        // Output : {Br=Brazil, In=Indonesia, US=United States}

        // Size():
        System.out.println(table.size());    // 3


        // Clear():

        // table.clear();
        // System.out.println(table.size());    // 0


        // putIfAbsent(): Insert only if Key is Missing
        table.putIfAbsent("IS", "Iceland");
        table.putIfAbsent("IN", "India3");
        System.out.println(table);
        // Output : {Br=Brazil, In=Indonesia, IN=India3, IS=Iceland, US=United States}


        // get() and getOrDefault():
        String val1 = table.get("Br");
        System.out.println(val1);       // Brazil
        // String val2 = table.getOrDefault("USA", "None");
        // System.out.println(val2);       // None


        // containsKey() and containsValue():
        boolean Haskey = table.containsKey("IN");
        boolean HasValue = table.containsValue("United States");
        System.out.println(Haskey);    // true
        System.out.println(HasValue);  // true
        

        // replace() - Update Value :
        table.replace("IN" , "India");
        System.out.println(table);
        

        // KeySet() : Get All the Keys:
        Set<String> Keys = table.keySet(); 
        System.out.println(Keys);     // [Br, In, IN, IS, US]

        // values() : Get all Values:
        Collection<String> values = table.values();
        System.out.println(values);     // [Brazil, Indonesia, India, Iceland, United States]

        // entrySet() : Get all Entries (Key-Value pairs)
        Set<Map.Entry<String, String>> entries = table.entrySet();
        System.out.println(entries);
        // Output : [Br=Brazil, In=Indonesia, IN=India, IS=Iceland, US=United States]

    }
}