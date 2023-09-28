public class array1 {
    
    public static void main(String  args[])
    {
        // int  a=Integer.parseInt("9023");
        // System.out.println(a);
        // float b=Float.parseFloat("493.244");
        // System.out.println(b);
        

        // Array is  fixed sized collection of similar data elements as contigous memory 
        //accessing elements in array is fast because of contigous allocation

        // int a[]=new int[4];    // declaration + memory alocation 
        
        int []a;// its  declaration   it is a reference  used for pointing memory   in heap    //declaration 
        a=new int[4]; // its memory allocation array cannot be accessable without allocating memory    // memory allocation 
        // initialization ::==
        a[0]=192;a[1]=94;a[2]=449;

        //
        System.out.println(a[2]); //elements within specific indexes are changeable at any time 
        // arra index goes from 0m to array size -1 means n-1;
        int []b={12,455,66,77,2};   // declaration + memory allocation +  initialization 
        for(int i=0;i<b.length;i++)
        {
        System.out.println(b[i]);  // array traversal 
        }

        String str[]= new String[2];
        str[0]="hello";
        str[1]="bahav";
        char ch[]={'a','b','c'};
        System.out.println("length of this array :: "+ch.length);
    float []fl={2.2f,5.3f,3.4f};

    // Naive means simple masoom 
    // sytax of foreach loop in java :

    //  for( data_type variable_name : array|| collectiion variable name )
    // {
    //     use variable_name
    // }

    System.out.println("displaying array using foreach loop");
         for (float temp : fl) {  // this does not gives i value means index 
            System.out.println(temp);            
         }
    }
}
