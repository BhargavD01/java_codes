public class TypeCastingEx
{
    public static void main(String[]args)
    {
        double d = 100.23;

        long l = (long)d;   //explicit type casting :truncation,
        int i = (int)l;   //explicit type casting

        System.out.println("Long value "+1); // fractional part lost ; value: 100

        System.out.println("Int value "+i); // fractional part lost; value : 100
        
    }
}
