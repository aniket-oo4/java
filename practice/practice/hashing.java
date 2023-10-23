import java.util.*;
  public class hashing{



    public static void main(String args[])
    {
        Map<Integer,String> mymap=new HashMap<Integer,String>();
        mymap.put(23,"aniket" );
        mymap.put(90,"tejas");
        System.out.println("map is ::"+mymap);

        mymap.put(90,"sahil");
        System.out.println(mymap.containsKey(9));
        System.out.println(mymap.get(9));// return null if does not exist 
        System.out.println(mymap.get(23));// return value  from specific key 
        for (Map.Entry<Integer,String> it :mymap.entrySet())
        {
           System.out.println(it.getKey()+" "+it.getValue());
        }

        mymap.remove(23);
        for (Map.Entry<Integer,String> it :mymap.entrySet())
        {
           System.out.println(it.getKey()+" "+it.getValue());
        }
        // for(HashMap val:mymap)  // does not work w=over key value pair only works on elements bunch 
        // {

        //   System.out.println(val+"hello");
        // }
    }

    }
  