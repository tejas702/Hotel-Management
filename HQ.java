import java.util.Scanner;
public class HQ //AN APP OF HOTEL MANAGEMENT(THIS IS THE HEADQUARTERS) 
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        checkin ob=new checkin();     
        restaurant on=new restaurant();
        loading o=new loading(); 
        HQ obj=new HQ();
        System.out.println("********Welcome to the EXPLICIT Lodging And Restaurant********");
        System.out.println("What would you like to do first?");
        System.out.println("Press 1 to book a room");
        System.out.println("Press 2 to get into the restaurant to have food");
        int lr=in.nextInt();
        if(lr==1)
        {
            System.out.print("\f");
            o.loading();
            ob.checkin();
            System.out.println("Would you like to go to the restaurant to have food?");
            System.out.println("Press 'Y' if you want to "+"\n"+"else'N'");
            String ch=in.next();
            if(ch.equalsIgnoreCase("Y"))
            {
                System.out.println("Welcome to the EXPLICIT Restaurant!!!!!");
                on.restaurant();
            }
            else
            { System.out.println("Its okay "+"All Right");
                System.out.print("\f");
            }
        }
        if(lr==2)
        {
            System.out.print("\f");
            o.loading();
            System.out.println("Welcome to the EXPLICIT Restaurant!!!!!");
            on.restaurant();
            System.out.println("Would you like to book a room in our hotel?");
            System.out.println("Press 'Y' if you want to "+"\n"+"else 'N'");
            String ch1=in.next();
            if(ch1.equalsIgnoreCase("Y"))
                ob.checkin();
            else
            { System.out.println("Its okay "+"All Right");
                System.out.print("\f");
            }
        }
        if(lr!=1&&lr!=2)
        {
            System.out.print("\f");
            System.out.println("You have entered the wrong choice");
            System.out.println("Please enter one of the correct choices"); 
            obj.main();
        }
    }     
}