package oops;

public class Instance {
    private static int  count;
    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count = count;
    }
    Instance()
    {
        count++;
    }
    public static int instanceCount()
    {
        return count;
    }

    public static void main(String[] args) {
        Instance i1 = new Instance();
        Instance i2 = new Instance();
        Instance i3 = new Instance();

       System.out.println("Number of instance of a class is : "+count);

    }
}
