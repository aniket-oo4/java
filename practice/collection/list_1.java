import java.util.*;
              

// List is an mutable  Interface extending interface Collection 
class list_1
    {     
      static List <String> firstList=new ArrayList<String>();    
      
      public static void main(String args[])
       { 
        
        firstList.add("hello");
        firstList.add("bhava");
        firstList.add("kay kartoy ");
        System.out.println(firstList+"\n");
      list_1  obj=new list_1();
      obj.removeElementByObject("bhava");// remove by name /value elements value 
      System.out.println(firstList);
        obj.removeElementByPos(0);// remove by name /value elements value 
      System.out.println(firstList);
     List<Integer> firstList=new ArrayList<Integer>();
     for(int i=1;i<5;i++)
     {
      firstList.add(i);
     }
     for(int value:firstList)
     {
      System.out.println(value);
     }
     System.out.println("3 index before changging ::"+firstList.get(3));
     firstList.set(3,80);//updating using set()method first paramenter is index and second one is uodated value 
     System.out.println(firstList);
    System.out.println("index of searched result of  value 3  ;::"+firstList.indexOf(3));//searchiing by using indexOf() method
      /*  List lst=new ArrayList();
            lst.add(12);
            lst.add(34);
            lst.add(23);
            System.out.println(lst);
            for(int i=0;i<lst.size();i++)
            {
              if(lst.get(i).equals(34))
{
          lst.remove(i);
                continue;
}
              System.out.println(lst.get(i));
System.out.println(lst);


*/

List link=new LinkedList<Integer>();
link.add(233);
link.add(23);
link.add(12);

       
            }
            void removeElementByPos(int pos)
            {
              firstList.remove(pos);
            }
            void removeElementByObject(String str)
            {
              firstList.remove(str);
            }

       }   
               