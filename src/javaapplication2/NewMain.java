package javaapplication2;
import Currency.Converter;
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) 
    {
        Converter obj=new Converter();
        Scanner sc=new Scanner(System.in);
        boolean x=true;
        int ch;
        while(x)
        {
        System.out.println("Select the operation:\n1.Dollar to Rupee\n2.Euro to Rupee\n3.Yen to Rupee\n4.Rupee to Dollar\n5.Rupee to Euro\n6.Rupee to Yen\n7.Exit");   
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter the amount in Dollar:");
                double a=sc.nextDouble();
                System.out.println(a+"Dollar="+obj.DollartoRupee(a)+"Rupee");
                break;
            case 2:
                System.out.println("Enter the amount in Euro:");
                double b=sc.nextDouble();
                System.out.println(b+"Euro="+obj.EurotoRupee(b)+"Rupee");
                break;
            case 3:
                System.out.println("Enter the amount in Yen:");
                double c=sc.nextDouble();
                System.out.println(c+"Yen="+obj.YentoRupee(c)+"Rupee");
                break;
            case 4:
                System.out.println("Enter the amount in Rupee:");
                double d=sc.nextDouble();
                System.out.println(d+"Rupee="+obj.RupeetoDollar(d)+"Dollar");
                break;
            case 5:
                System.out.println("Enter the amount in Rupee:");
                double e=sc.nextDouble();
                System.out.println(e+"Rupee="+obj.RupeetoEuro(e)+"Euro");
                break;
            case 6:
                System.out.println("Enter the amount in Rupee:");
                double f=sc.nextDouble();
                System.out.println(f+"Rupee="+obj.RupeetoYen(f)+"Yen"); 
                break;
            case 7:
                x=false;
                break;
            default:
                System.out.println("Wrong choice!");
                break;
        }
        }
    }   
}
