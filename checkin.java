import java.util.Scanner;//A PROGRAM OF HOTEL ROOM BOOKING
public class checkin
{
    static int days;int rno;
    public static void checkin()
    {
        Scanner in=new Scanner(System.in);
        checkin ob=new checkin();
        loading on=new loading();
        System.out.println("Enter Customer's name");
        String name=in.nextLine();
        System.out.println("What kind of room would you like to book?");
        System.out.println("Press 1 to get a non-ac room ");
        System.out.println("Press 2 to get a ac room ");
        System.out.println("Press 3 to get a delux room ");
        System.out.println("Press 4 to get a super delux room ");
        int room=in.nextInt();
        System.out.print("\f");
        on.loading();
        if(room<=4&&room>0)
        {
            ob.days();
            if(days>=5)
            {
                System.out.println("Sorry!");
                System.out.println("We dont give rooms on rent for these many days");
                System.out.println("If you want to book a room for 4 or less days");
                System.out.println("Press 'Y' ");
                String d=in.next();
                if(d.equalsIgnoreCase("Y"))
                    ob.checkin();
                else
                    room=0;
            }
            if(room==1)
                ob.nonac();
            if(room==2)
                ob.ac();
            if(room==3)
                ob.delux();
            if(room==4)
                ob.sdelux();
            if(room==0)
                System.out.println("\f");
        }
        else
        {
            System.out.println("Please enter the correct choice");
            for(int i=0;i<=888888888;i++)
            {
                if(i==888888888)
                    System.out.print("\f");
            }
            ob.checkin();
        }
    }
    public void days()
    {
        Scanner in=new Scanner(System.in);
        checkin ob=new checkin();
        System.out.println("For how many days would you like to book a room for?");
        days=in.nextInt();
    }
    public void nonac()
    {
        Scanner in=new Scanner(System.in);
        checkin ob=new checkin();
        loading on=new loading();
        int rno0=(int)((Math.random()*2)+101);
        int rno1=(int)((Math.random()*5)+103);
        int rno2=(int)((Math.random()*5)+114);
        int rno3=(int)((Math.random()*5)+130);
        int rno4=(int)((Math.random()*5)+160);
        System.out.println("These are the available non-ac rooms in our hotel");
        System.out.println(rno0+"\n"+rno1+"\n"+rno2+"\n"+rno3+"\n"+rno4);
        System.out.println("The price charged on each of these rooms is Rupees 3000");
        int ramt1=3000*days;
        System.out.println("If you wish to pay Rupees "+ramt1+"  and book a room "+ "\n"+"Press Y"+"\n"+"else N");
        String ch1=in.next();
        if(ch1.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the room number you want to book from the above available rooms");
            rno=in.nextInt();
            if(rno==rno0||rno==rno1||rno==rno2||rno==rno3||rno==rno4)
            {
                System.out.print("\f");
                System.out.println("Your room is booked ");
                System.out.println("You can go and rest for a while in your room");
                for(int i=0;i<=888888888;i++)
                {
                    if(i==888888888)
                        System.out.print("\f");
                }
            }
            else
            {
                System.out.println("Please select a room only from the above mentioned rooms");
                for(int i=0;i<=888888888;i++)
                {
                    if(i==888888888)
                        System.out.print("\f");
                }
                ob.nonac();
            }
        }
        else
        {
            System.out.println("Its okay All Right");
            System.out.println("Thank you for coming");
            for(int i=0;i<=888888888;i++)
            {
                if(i==888888888)
                    System.out.print("\f");
            }
        }
    }
    public void ac()
    {
        Scanner in=new Scanner(System.in);
        checkin ob=new checkin();
        loading on=new loading();
        int rn0=(int)((Math.random()*2)+201);
        int rn1=(int)((Math.random()*5)+203);
        int rn2=(int)((Math.random()*5)+214);
        int rn3=(int)((Math.random()*5)+230);
        int rn4=(int)((Math.random()*5)+260);
        System.out.println("These are the available ac rooms in our hotel");
        System.out.println(rn0+"\n"+rn1+"\n"+rn2+"\n"+rn3+"\n"+rn4);
        System.out.println("The price charged on each of these rooms is Rupees 4000");
        int ramt2=4000*days;
        System.out.println("If you wish to pay Rupees "+ramt2+"  and book a room "+ "\n"+"Press Y"+"\n"+"else N");
        String ch2=in.next();
        if(ch2.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the room number you want to book from the above available rooms");
            rno=in.nextInt();
            if(rno==rn0||rno==rn1||rno==rn2||rno==rn3||rno==rn4)
            {
                System.out.print("\f");
                System.out.println("Your room is booked ");
                System.out.println("You can go and rest for a while in your room");
                for(int i=0;i<=888888888;i++)
                {
                    if(i==888888888)
                        System.out.print("\f");
                }
            }
            else
            {
                System.out.println("Please select a room only from the above mentioned rooms");
                for(int i=0;i<=888888888;i++)
                {
                    if(i==888888888)
                        System.out.print("\f");
                }
                ob.ac();
            }
        }
        else
        {
            System.out.println("Its okay "+"All Right");
            System.out.println("Thank you for coming");
            for(int i=0;i<=888888888;i++)
            {
                if(i==888888888)
                    System.out.print("\f");
            }
        }
    }
    public void delux()
    {
        Scanner in=new Scanner(System.in);
        checkin ob=new checkin();
        loading on=new loading();
        int rnd0=(int)((Math.random()*2)+301);
        int rnd1=(int)((Math.random()*5)+303);
        int rnd2=(int)((Math.random()*5)+314);
        int rnd3=(int)((Math.random()*5)+330);
        int rnd4=(int)((Math.random()*5)+360);
        System.out.println("These are the available delux rooms in our hotel");
        System.out.println(rnd0+"\n"+rnd1+"\n"+rnd2+"\n"+rnd3+"\n"+rnd4);
        System.out.println("The price charged on each of these rooms is Rupees 5000");
        int ramt3=5000*days;
        System.out.println("If you wish to pay Rupees "+ramt3+"  and book a room "+ "\n"+"Press Y"+"\n"+"else N");
        String ch3=in.next();
        if(ch3.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the room number you want to book from the above available rooms");
            rno=in.nextInt();

            if(rno==rnd0||rno==rnd1||rno==rnd2||rno==rnd3||rno==rnd4)
            {
                System.out.print("\f");
                System.out.println("Your room is booked ");
                System.out.println("You can go and rest for a while in your room");
                for(int i=0;i<=888888888;i++)
                {
                    if(i==888888888)
                        System.out.print("\f");
                }
            }
            else
            {
                System.out.println("Please select a room only from the above mentioned rooms");
                for(int i=0;i<=888888888;i++)
                {
                    if(i==888888888)
                        System.out.print("\f");
                }
                ob.delux();
            }    
        }
        else
        {
            System.out.println("Its okay "+"All Right");
            System.out.println("Thank you for coming");
            for(int i=0;i<=888888888;i++)
            {
                if(i==888888888)
                    System.out.print("\f");

            }
        }
    }
    public void sdelux()
    {
        Scanner in=new Scanner(System.in);
        checkin ob=new checkin();
        loading on=new loading();
        int rnsd0=(int)((Math.random()*2)+301);
        int rnsd1=(int)((Math.random()*5)+303);
        int rnsd2=(int)((Math.random()*5)+314);
        int rnsd3=(int)((Math.random()*5)+330);
        int rnsd4=(int)((Math.random()*5)+360);
        System.out.println("These are the available super delux rooms in our hotel");
        System.out.println(rnsd0+"\n"+rnsd1+"\n"+rnsd2+"\n"+rnsd3+"\n"+rnsd4);
        System.out.println("The price charged on each of these rooms is Rupees 7000");
        int ramt4=7000*days;
        System.out.println("If you wish to pay Rupees "+ramt4+"  and book a room "+ "\n"+"Press Y"+"\n"+"else N");
        String ch4=in.next();
        if(ch4.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the room number you want to book from the above available rooms");
            rno=in.nextInt();

            if(rno==rnsd0||rno==rnsd1||rno==rnsd2||rno==rnsd3||rno==rnsd4)
            {

                System.out.print("\f");      
                System.out.println("Your room is booked ");
                System.out.println("You can go and rest for a while in your room");
                for(int i=0;i<=888888888;i++)
                {
                    if(i==888888888)
                        System.out.print("\f");
                }
            }
            else
            {
                System.out.println("Please select a room only from the above mentioned rooms");
                for(int i=0;i<=888888888;i++)
                {
                    if(i==888888888)
                        System.out.print("\f");
                }
                ob.sdelux();
            }
        }
        else
        {
            System.out.println("Its okay   "+"    All Right");
            System.out.println("Thank you for coming");
            for(int i=0;i<=888888888;i++)
            {
                if(i==888888888)
                    System.out.print("\f");
            }
        }
    }
}