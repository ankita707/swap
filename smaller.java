import java.util.List;
import java.util.Arrays;
public class smaller {
    public static void main(String[] args)
    {
        List<Integer>numbers=Arrays.asList(10,20,30,40,50,60,90);
        int min=numbers.get(0);
        for(int num:numbers)
        {
            if(num<min)
            {
                min=num;
            }
        }
System.out.println("smallest number"+min);
    }
}
