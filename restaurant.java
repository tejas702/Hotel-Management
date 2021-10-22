import java.util.Scanner;//A PROGRAM OF RESTAURANT MANAGEMENT
public class restaurant
{  
    static double bill;static double tax;static double totalbill;
    public static void restaurant()
    {
        Scanner in=new Scanner(System.in);
        restaurant o=new restaurant();
        loading on=new loading();
        int ans;
        String mord="";
        System.out.println("What would you like to order?");
        System.out.println("Press 1 for Starters ");
        System.out.println("Press 2 for Main Course ");
        System.out.println("Press 3 for Deserts ");
        System.out.println();
        System.out.println("Enter your choice");
        ans=in.nextInt();
        System.out.print("\f");
        if(ans==1)
        {
            o.starters();
            System.out.print("\f");
            System.out.println("Do you want to place more order?");
            System.out.println("Press 'Y' is yes");
            System.out.println("Else Press 'N'");
            mord=in.next();
            if(mord.equalsIgnoreCase("y"))
                o.restaurant();
            else
                o.billtot();
        }
        if(ans==2)
        {
            o.maincourse();
            System.out.print("\f");
            System.out.println("Do you want to place more order?");
            System.out.println("Press 'Y' is yes");
            System.out.println("Else Press 'N'");
            mord=in.next();
            if(mord.equalsIgnoreCase("y"))
                o.restaurant();
            else
                o.billtot();
        }
        if(ans==3)
        {
            o.deserts();
            System.out.print("\f");
            System.out.println("Do you want to place more order?");
            System.out.println("Press 'Y' is yes");
            System.out.println("Else Press 'N'");
            mord=in.next();
            if(mord.equalsIgnoreCase("y"))
                o.restaurant();
            else
                o.billtot();  
        }
        if(ans!=1&&ans!=2&&ans!=3)
        {
            System.out.println("Please choose one of the correct choices");
            o.restaurant();
        }
    }
    public void starters()
    {       
        Scanner in=new Scanner(System.in);
        restaurant o=new restaurant();
        String ch="";int vs,nvs;
        int tvs=0,tnvs=0;int vsamt=0;int nvsamt=0;
        int tvsamt=0;int tnvsamt=0;
        System.out.println("Welcome to the Starter Menu!!!");
        System.out.println("Enter 'veg' for veg starters and 'nonveg' for non-veg starters");
        ch=in.next();
        if(ch.equalsIgnoreCase("veg")||ch.equalsIgnoreCase("nonveg"))
        {
            if(ch.equalsIgnoreCase("veg"))
            {   
                System.out.println("Starters\t\t\tPrice in Rs."+"\n");
                System.out.println("1-Paneer Tikka\t\t\t\t120");
                System.out.println("2-Veg Seekh Kebab\t\t\t120");
                System.out.println("3-Hara Bhara Kebab\t\t\t120");
                System.out.println("4-Paneer Chilly\t\t\t\t150");
                System.out.println("5-Soyabean Chilly\t\t\t150");
                System.out.println("6-Spring Roll\t\t\t\t150");
                System.out.println("7-Veg Crispy\t\t\t\t160");
                System.out.println("8-Veg Manchurian\t\t\t160");
                System.out.println("9-Crispy Mushroom\t\t\t160");
                System.out.println("10-Mix Veg Kebab\t\t\t180");
                System.out.println();
                System.out.println("Select a Starter from the given list by entering the correct number");
                vs=in.nextInt();
                if(vs<=10&&vs>0)
                {
                    System.out.println("Enter the total number of plates you want to order");
                    tvs=in.nextInt();
                    if(vs>=1&&vs<=3)
                        vsamt=tvs*120;
                    if(vs>=4&&vs<=6)
                        vsamt=tvs*150;
                    if(vs>=7&&vs<=9)
                        vsamt=tvs*160;
                    if(vs==10)
                        vsamt=tvs*180;
                    tvsamt=tvsamt+vsamt;
                }
                else

                    System.out.println("Please enter number of one of the above mentioned options ");
            }
            if(ch.equalsIgnoreCase("nonveg"))
            {
                System.out.println("Non-Veg Starters\t\t\tPrice in Rs."+"\n");
                System.out.println("1-Chicken Lollipop\t\t\t170");
                System.out.println("2-Chicken Tikka\t\t\t\t170");
                System.out.println("3-Chicken Crispy\t\t\t170");
                System.out.println("4-Chilli Chicken\t\t\t190");
                System.out.println("5-Tangdi Kebab\t\t\t\t190");
                System.out.println("6-Tandoori Chicken\t\t\t190");
                System.out.println("7-Afghani Chicken\t\t\t200");
                System.out.println("8-Chicken Seekh Kebab\t\t\t200");
                System.out.println("9-Fish Tikka\t\t\t\t200");
                System.out.println("10-Shanghai Lasni Kebab\t\t\t230");
                System.out.println("Select a Starter from the given list by entering the correct number");
                nvs=in.nextInt();
                if(nvs<=10&&nvs>0)
                {
                    System.out.println("Enter the total number of plates you want to order");
                    tnvs=in.nextInt();
                    if(nvs>=1&&nvs<=3)
                        nvsamt=tnvs*170;
                    if(nvs>=4&&nvs<=6)
                        nvsamt=tnvs*190;
                    if(nvs>=7&&nvs<=9)
                        nvsamt=tnvs*200;
                    if(nvs==10)
                        nvsamt=tnvs*230;
                    tnvsamt=tnvsamt+nvsamt;
                }
                else
                
                    System.out.println("Please enter number of one of the above mentioned options properly");               
            }
        }
        else
        {
            System.out.println("Please enter one of the correct choices");
            o.starters();
        }
        bill=bill+tvsamt+tnvsamt;
    }
    public void maincourse()
    {
        Scanner in=new Scanner(System.in);
        restaurant o=new restaurant();
        System.out.println("Welcome to Main Course menu");
        int vmc,nvmc,cmc;String ch="";
        int tvmc=0,tnvmc=0,tcmc=0;
        int vmcamt=0,nvmcamt=0,cmcamt=0;
        int tvmcamt=0,tnvmcamt=0,tcmcamt=0;
        System.out.println("Enter 'veg' for Veg main course");
        System.out.println("Enter 'nonveg' for Non-Veg main course");
        System.out.println("Enter 'chinese' for Chinese main course");
        ch=in.next();
        if(ch.equalsIgnoreCase("veg")||ch.equalsIgnoreCase("nonveg")||ch.equalsIgnoreCase("chinese"))
        {
            if(ch.equalsIgnoreCase("veg"))
            {
                System.out.println("Welcome to Indian Veg Dishes");
                System.out.println("Indian Veg Dishes\t\t\t\tPrice in Rs."+"\n");
                System.out.println("1-Shahi Paneer\t\t\t\t\t\t170");
                System.out.println("2-Paneer Tikka Masala\t\t\t\t\t170");
                System.out.println("3-Mutter Paneer\t\t\t\t\t\t170");
                System.out.println("4-Malai Kofta\t\t\t\t\t\t150");
                System.out.println("5-Chana Masala\t\t\t\t\t\t150");
                System.out.println("6-Kadahi Paneer\t\t\t\t\t\t150");
                System.out.println("7-Veg Kolhapuri\t\t\t\t\t\t180");
                System.out.println("8-Kaju Masala\t\t\t\t\t\t180");
                System.out.println("9-Shev Bhaji\t\t\t\t\t\t180");
                System.out.println("10-Tandoor Roti\t\t\t\t\t\t30");
                System.out.println("11-Butter Naan\t\t\t\t\t\t40");
                System.out.println("12-Paratha\t\t\t\t\t\t50");
                System.out.println();
                System.out.println("Select any one of the above by entering its number");
                vmc=in.nextInt();
                if(vmc<=12&&vmc>0)
                {
                    System.out.println("Enter the total number of plates you want to order");
                    tvmc=in.nextInt(); 
                    if(vmc>=1&&vmc<=3)
                        vmcamt=tvmc*170;
                    if(vmc>=4&&vmc<=6)
                        vmcamt=tvmc*150;
                    if(vmc>=7&&vmc<=9)
                        vmcamt=tvmc*180;
                    if(vmc==10)
                        vmcamt=tvmc*30;
                    if(vmc==11)
                        vmcamt=tvmc*40;
                    if(vmc==12)
                        vmcamt=tvmc*50;
                    tvmcamt=tvmcamt+vmcamt;
                }
                else
                
                    System.out.println("Please enter number of one of the above mentioned options properly");
            }
            if(ch.equalsIgnoreCase("nonveg"))
            {
                System.out.println("Welcome to Indian Non-Veg Dishes");
                System.out.println("Indian Non-Veg Dishes\t\t\t\tPrice in Rs."+"\n");
                System.out.println("1-Chicken Tikka Masala\t\t\t\t\t180");
                System.out.println("2-Chicken Tikka Labadar\t\t\t\t\t180");
                System.out.println("3-Fish Dhaniawala\t\t\t\t\t180");
                System.out.println("4-Butter Chicken\t\t\t\t\t200");
                System.out.println("5-Chicken Handi\t\t\t\t\t\t200");
                System.out.println("6-Mutton Handi\t\t\t\t\t\t200");
                System.out.println("7-Murg Masallam\t\t\t\t\t\t220");
                System.out.println("8-Mutton Rogan Josh\t\t\t\t\t220");
                System.out.println("9-Prawn Malai Curry\t\t\t\t\t220");
                System.out.println("10-Tandoor Roti\t\t\t\t\t\t30");
                System.out.println("11-Butter Naan\t\t\t\t\t\t40");
                System.out.println("12-Paratha\t\t\t\t\t\t50");
                System.out.println();
                System.out.println("Select any one of the above by entering its number");
                nvmc=in.nextInt();
                if(nvmc<=12&&nvmc>0)
                {
                    System.out.println("Enter the total number of plates you want to order");
                    tnvmc=in.nextInt();
                    if(nvmc>=1&&nvmc<=3)
                        nvmcamt=tnvmc*180;
                    if(nvmc>=4&&nvmc<=6)
                        nvmcamt=tnvmc*200;
                    if(nvmc>=7&&nvmc<=9)
                        nvmcamt=tnvmc*220;
                    if(nvmc==10)
                        nvmcamt=tnvmc*30;
                    if(nvmc==11)
                        nvmcamt=tnvmc*40;
                    if(nvmc==12)
                        nvmcamt=tnvmc*50;
                    tnvmcamt=tnvmcamt+nvmcamt;
                }
                else
                
                    System.out.println("Please enter number of one of the above mentioned options properly");

            }
            if(ch.equalsIgnoreCase("chinese"))
            {
                System.out.println("Welcome to Chinese Dishes");
                System.out.println("Chinese Dishes\t\t\t\tPrice in Rs."+"\n");
                System.out.println("1-Schezwan Fried Rice\t\t\t\t220");
                System.out.println("2-Veg Fried Rice\t\t\t\t220");
                System.out.println("3-Chicken Fried Rice\t\t\t\t220");
                System.out.println("4-Chicken Noodles\t\t\t\t240");
                System.out.println("5-Veg Hakka Noodles\t\t\t\t240");
                System.out.println("6-Kimchi Rice Veg \t\t\t\t240");
                System.out.println("7-Chicken Manchurian\t\t\t\t250");
                System.out.println("8-Paneer Manchurian\t\t\t\t250");
                System.out.println("9-Shanghai Fried Rice\t\t\t\t250");
                System.out.println();
                System.out.println("Select any one of the above by entering its number");
                cmc=in.nextInt();
                if(cmc<=9&&cmc>0)
                {
                    System.out.println("Enter the total number of plates you want to order");
                    tcmc=in.nextInt();
                    if(cmc>=1&&cmc<=3)
                        cmcamt=tcmc*220;
                    if(cmc>=4&&cmc<=6)
                        cmcamt=tcmc*240;
                    if(cmc>=7&&cmc<=9)
                        cmcamt=tcmc*250;
                    tcmcamt=tcmcamt+cmcamt;
                }
                else
                
                    System.out.println("Please enter number of one of the above mentioned options properly");
            }
        }
        else
        {
            System.out.println("Please enter one of the correct choices");
            o.maincourse();
        }  
        bill=bill+tvmcamt+tnvmcamt+tcmcamt;
    }
    public void deserts()
    {
        Scanner in=new Scanner(System.in); 
        restaurant o=new restaurant();
        System.out.println("Welcome to Deserts menu");
        int des;    
        int desamt=0;
        int tdesamt=0;
        int tdes=0;
        System.out.println("Deserts\t\t\t\t\tPrice in Rs."+"\n"); 
        System.out.println("1-Softy Pineapple\t\t\t\t100");
        System.out.println("2-Softy Crunchy Chocolate\t\t\t100");
        System.out.println("3-Chocolate Walnut Brownie\t\t\t100");
        System.out.println("4-Chocolate Doughnut\t\t\t\t90");
        System.out.println("5-Marble Cake\t\t\t\t\t90");
        System.out.println("6-Mocha Magic\t\t\t\t\t90");
        System.out.println("7-Black Forest Gateaux\t\t\t\t80");
        System.out.println("8-Mango Shake\t\t\t\t\t80");
        System.out.println("9-Tooty Fruity\t\t\t\t\t120");
        System.out.println();
        System.out.println("Select any one of the above by entering its number");
        des=in.nextInt();
        if(des<=9&&des>0)
        {
            System.out.println("Enter the total number of plates you want to order");
            tdes=in.nextInt();
            if(des>=1&&des<=3)
                desamt=tdes*100;
            if(des>=4&&des<=6)
                desamt=tdes*90;
            if(des>=7&&des<=8)
                desamt=tdes*80;
            if(des==9)
                desamt=tdes*120;
            tdesamt=tdesamt+desamt;
        }
        else
        
            System.out.println("Please enter number of one of the above mentioned options properly");
        bill=bill+tdesamt;
    }
    public void billtot()
    {
        Scanner in=new Scanner(System.in);
        restaurant o=new restaurant();
        loading on=new loading();
        System.out.println("\f");
        on.loading();
        System.out.println("Total Bill:");
        tax=Math.round(7.5*bill/100);
        totalbill=totalbill+bill+tax;
        System.out.println("Total Cost(not inclusive of tax) = Rs."+bill);
        System.out.println("Tax Charged =Rs."+tax);
        System.out.println("Total Amount to be paid =Rs."+Math.round(totalbill)+".0");
        System.out.println();
        System.out.println("Thanks For Coming");
        System.out.println("Visit Again"+"\n"+"__________________________________________________________________________");
        for(int i=0;i<=999999999;i++)
        {
            if(i==999999999)
                break;
        }
        for(int j=0;j<=999999999;j++)
        {
            if(j==999999999)
                break;
        }
        for(int l=0;l<788888888;l++)
        {
            if(l==788888888)
                break;
        }
        for(int k=0;k<=999999999;k++)
        {
            if(k==999999999)
                System.out.print("\f");
        }
    }
}       