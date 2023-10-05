package MCA;

public class student {
    public String name;
    public int roll_no;
    public int marathi,hindi,english,math;
   public  student (int rn,String name,int mar,int hindi,int eng,int math)
    {
        this.roll_no=rn;
        this.name=name;
        this.marathi=mar;
        this.english=eng;
        
        this.hindi=hindi;
        this.math=math;
    }
    public void display()
    {
        System.out.println("Roll nuber :"+this.roll_no+"\n Name: "+this.name+"\n marks ::\n marathi:"+this.marathi+"\n hindi :"+this.hindi+"\n english :"+this.english+"\n math :"+this.math);
    }
}
