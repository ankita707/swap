public class variable{
    int a=10;
    static int b=50;
    public static void main(String[] args)
    {
        variable obj=new variable();
        System.out.println(obj.a);
        System.out.println(b);
        obj.method();
    }
    public void method()
    {
        int d=30;
        double e=9.8;
        System.out.println(d);
        System.out.println(e);
    }
}