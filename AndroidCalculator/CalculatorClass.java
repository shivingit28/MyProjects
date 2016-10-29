import java.io.*;
import java.math.*;

/**
 *
 * @author Shiv Pratap Singh
 */
public class Calculator_class {

    private static BigDecimal b1;
    private static BigDecimal b2;

    //string to big_decimal

    public static String add(String val1,String val2)
    {
        try{
            b1=new BigDecimal(val1);
            b2=new BigDecimal(val2);
        }
        catch(Exception e)
        {
            System.out.println("It's not a number");
            return "Error";
        }
        BigDecimal res=b1.add(b2);
        String r=res.toString();
        return r;
    }

    public static String subtract(String val1,String val2)
    {
        try{
            b1=new BigDecimal(val1);
            b2=new BigDecimal(val2);
        }
        catch(Exception e)
        {
            System.out.println("It's not a number");
            return "Error";
        }
        BigDecimal res=b1.subtract(b2);
        String r=res.toString();
        return r;
    }
    public static String divide(String val1,String val2)
    {
        try{
            b1=new BigDecimal(val1);
            b2=new BigDecimal(val2);
        }
        catch(Exception e)
        {
            System.out.println("It's not a number");
            return "Error";
        }
        BigDecimal res=b1.divide(b2,new MathContext(10,RoundingMode.HALF_UP));
        String r=res.toString();
        return r;
    }
    public static String multiply(String val1,String val2)
    {
        try{
            b1=new BigDecimal(val1);
            b2=new BigDecimal(val2);
        }
        catch(Exception e)
        {
            System.out.println("It's not a number");
            return "Error";
        }
        BigDecimal res=b1.multiply(b2);
        String r=res.toString();
        return r;
    }
    public static String pow(String val1,String val2)
    {
        try{
            b1=new BigDecimal(val1);
        }
        catch(Exception e)
        {
            System.out.println("Not a number");
            return "Error";
        }
        int e=0;
        try{
            BigInteger b=new BigInteger(val2);
            e=b.intValue();
        }
        catch(Exception f)
        {
            System.out.println("Power should be integer");
            return "Error";
        }
        BigDecimal res=b1.pow(e);
        String r=res.toString();
        return r;
    }



    public static String gcd(String val1,String val2)
    {
        BigInteger b1,b2;
        try{
            b1=new BigInteger(val1);
            b2=new BigInteger(val2);
        }
        catch(Exception e)
        {
            System.out.println("Number shoudl be integers");
            return "Error";
        }
        BigInteger res=b1.gcd(b2);
        String r=res.toString();
        return r;
    }
    public static boolean is_prime(String val1)
    {
        BigInteger b1;
        try{
            b1=new BigInteger(val1);
        }
        catch(Exception e)
        {
            System.out.println("Number should be integer");
            return false;
        }
        boolean res=b1.isProbablePrime(99);
        return res;
    }
    public static String mod(String val1,String val2)
    {
        BigInteger b1,b2;
        try{
            b1=new BigInteger(val1);
            b2=new BigInteger(val2);
        }
        catch(Exception e)
        {
            System.out.println("Number should be integer");
            return "Error";
        }
        BigInteger res=b1.mod(b2);
        String r=res.toString();
        return r;
    }

    public static String logical_and(String val1,String val2)
    {
        BigInteger b1,b2;
        try{
            b1=new BigInteger(val1);
            b2=new BigInteger(val2);
        }
        catch(Exception e)
        {
            System.out.println("Number should be integer");
            return "Error";
        }
        BigInteger res=b1.and(b2);
        String r=res.toString();
        return r;
    }

    public static String logical_xor(String val1,String val2)
    {
        BigInteger b1,b2;
        try{
            b1=new BigInteger(val1);
            b2=new BigInteger(val2);
        }
        catch(Exception e)
        {
            System.out.println("Number should be integer");
            return "Error";
        }
        BigInteger res=b1.xor(b2);
        String r=res.toString();
        return r;
    }
    public static String logical_or(String val1,String val2)
    {
        BigInteger b1,b2;
        try{
            b1=new BigInteger(val1);
            b2=new BigInteger(val2);
        }
        catch(Exception e)
        {
            System.out.println("Number should be integer");
            return "Error";
        }
        BigInteger res=b1.or(b2);
        String r=res.toString();
        return r;
    }
    public static String logical_not(String val1)
    {
        BigInteger b1;
        try{
            b1=new BigInteger(val1);
        }
        catch(Exception e)
        {
            System.out.println("Number should be integer");
            return "Error";
        }
        BigInteger res=b1.not();
        String r=res.toString();
        return r;
    }
}
