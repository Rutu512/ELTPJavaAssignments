import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.*;
 
public class SortMap 
{
 
    public static void main(String a[])
    {
        System.out.println("********Sort Map by Value*********");
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Raj", 25);
        map.put("Sunil", 45);
        map.put("Yash", 12);
        map.put("Pradeep", 64);
        map.put("Mike", 23);
        map.put("Om", 85);
        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        System.out.println("Ascending Order : ");
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
        System.out.println("\n Descending Order : ");
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
    }
}

/*
 * ********Sort Map by Value*********
Ascending Order : 
Yash ==== 12
Mike ==== 23
Raj ==== 25
Sunil ==== 45
Pradeep ==== 64
Om ==== 85

Descending Order : 
Om ==== 85
Pradeep ==== 64
Sunil ==== 45
Raj ==== 25
Mike ==== 23
Yash ==== 12
*/
 

