
public class yıldız 
{
    public static void yıldız(int x)
    {
        for (int i = 1; i <=x; i++) 
        {
            for (int j = 0; j <i; j++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) 
    {
        yıldız(6);
    }

}
