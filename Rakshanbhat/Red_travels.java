import java.util.Scanner;
class Red_travels extends linearsearch
{   static int r=0;
    static String name="";
    static long aadhar=0;
    static int choice1=0;static int pos;
    static String date_and_time;
      public static void display()
      {
          
          Scanner sc=new Scanner(System.in);
          System.out.println("enter your name and aadhar");
           name=sc.nextLine();
           aadhar=sc.nextLong();
        System.out.println("Welcome,"+name+ " to Red Travels!");
        System.out.println("Please enter the mode of transport that you want to tavel in.");
        System.out.println("1.Roadways\n2.Railways\n3.Airways.\n4.Waterways(Cruise Ships!)");
        choice1=sc.nextInt();
        if(choice1==1||choice1==2)
        {
            Anirudh();
        }
        else if(choice1==3||choice1==4)
        {
            Rakshan();
        }
        else
        System.out.println("Please choose 1,2,3 or 4");       
        }
    public static void Anirudh()
{Scanner sc=new Scanner(System.in);
System.out.println("Enter your age");
int a=sc.nextInt();
System.out.println("Enter the number of people travelling");
System.out.println("please note tht the number of people allowed for road travel & railway travel must not exceed 4");
System.out.println("please book once more to accomodate");
int number1=sc.nextInt();
System.out.println("please enter date and time");
date_and_time=sc.next();
switch(choice1)
{
case 1:System.out.println("1.intra city transport");
             System.out.println("2.inter city transport");
             int u_suck=sc.nextInt();
             if(u_suck==1)
             {
            String oK[]={"1.gottigere","2.bilekahalli","3.white field","4.palace grounds","5.bommanahalli","6.K R Market","7.chikkapete","8.malleshwara"};
            int Ko[]={100,80,200,150,90,70,80,160}; 
            for(int fi=0;fi<=7;fi++)
            {
                System.out.println(oK[fi]);
            }
            System.out.println("enter choice");
            int rio=sc.nextInt();
            switch(rio)
            {
                case 1:r=Ko[0];
                break;
                case 2:r=Ko[1];
                break;
                case 3:r=Ko[2];
                break;
                case 4:r=Ko[3];
                break;

                case 5:r=Ko[4];
                break;
                case 6:r=Ko[5];
                break;
                case 7:r=Ko[6];
                break;
                case 8:r=Ko[7];
                break;
                case 9:r=Ko[8];
                break;
                case 10:r=Ko[9];
                break;
                default:System.out.println("invalid");
            }
        }
        else if(u_suck==2)
        {
            String rid[]={"1.Andhra pradesh","2.Arunachal pradesh","3.Assam","4.Bihar","5.Chattisgarh","6.goa","7.gujrat","8.Haryana","9.Himachal pradesh","10.Jammu & Kashmir","11.jharkhand","12.karnataka","13.kerala","14.Madhya pradesh","15.Maharashtra","16.manipur","17.meghalaya","18.mizoram","19.nagaland","20.Odisha","21.Punjab","22.Rajasthan","23.Sikkim","24.Tamil nadu","25.Telangana","26.Tripura","27.Uttar pradesh","28.Uttara khand","29.West bengal","30.chandigarh","31.dadra","32.daman & diu","33.pudducherry","34.delhi"};
            int dir[]={500,600,700,1000,500,600,700,600,800,900,600,700,800,900,600,500,450,600,700,800,900,700,600,700,800,600,700,800,700,900,600,450,600};
            for(int fin=0;fin<=32;fin++)
            {
                System.out.println(rid[fin]);
            }
            System.out.println("enter choice");
            int riot=sc.nextInt();
            switch(riot)
            {
                case 1:r=dir[0];
                break;
                case 2:r=dir[1];
                break;
                case 3:r=dir[2];
                break;
                case 4:r=dir[3];
                break;
                case 5:r=dir[4];
                break;
                case 6:r=dir[5];
                break;
                case 7:r=dir[6];
                break;
                case 8:r=dir[7];
                break;
                case 9:r=dir[8];
                break;
                case 10:r=dir[9];
                break;
                case 11:r=dir[10];
                break;
                case 12:r=dir[11];
                break;
                case 13:r=dir[12];
                break;
                case 14:r=dir[13];
                break;
                case 15:r=dir[14];
                break;
                case 16:r=dir[15];
                break;
                case 17:r=dir[16];
                break;
                case 18:r=dir[17];
                break;
                case 19:r=dir[18];
                break;
                case 20:r=dir[19];
                break;
                case 21:r=dir[20];
                break;
                case 22:r=dir[21];
                break;
                case 23:r=dir[22];
                break;
                case 24:r=dir[23];
                break;
                case 25:r=dir[24];
                break;
                case 26:r=dir[25];
                break;
                case 27:r=dir[26];
                break;
                case 28:r=dir[27];
                break;
                case 29:r=dir[28];
                break;
                case 30:r=dir[29];
                break;
                case 31:r=dir[30];
                break;
                case 32:r=dir[31];
                break;
                case 33:r=dir[32];
                break;
                default:System.out.println("invalid");
            }
        }
System.out.println("Please choose");
System.out.println("1.for sedan");
System.out.println("2.for hatchback");
System.out.println("3.for SUVs");
System.out.println("4.for sports cars");
int q=sc.nextInt();String car=" ";
if(q==1)
{
System.out.println("1.scorpio"+" /n"+" 2.XUV 500"+" /n"+" 3.fortuner");
int w=sc.nextInt();
switch(w)
{
case 1:car="scorpio";
break;
case 2:car="XUV 500";
break;
case 3:car="fortuner";
break;
default:System.out.println("invalid option");
}
}
else if(q==2)
{
System.out.println("1.indigo"+" /n"+"2.polo" +"/n"+" 3.santro");
int w=sc.nextInt();
switch(w)
{
case 1:car="indigo";
break;
case 2:car="polo";
break;
case 3:car="santro";
break;
default:System.out.println("invalid option");
}
}
else if(q==3)
{
System.out.println("1.corolla "+"/n"+" 2.etios" +"/n"+" 3.city");
int w=sc.nextInt();
switch(w)
{
case 1:car="corolla";
break;
case 2:car="etios";
break;
case 3:car="city";
break;
default:System.out.println("invalid option");
}
}
else if(q==4)
{
System.out.println("1.dodge challenger "+"/n"+" 2.ferrari aventador" +"/n"+" 3.lambo");
int w=sc.nextInt();
switch(w)
{
case 1:car="dodge challenger";
break;
case 2:car="ferrari";
break;
case 3:car="lambo aventedor";
break;
default:System.out.println("Invalid entry");
}
}
if(a<=15)
{
int cost=number1*r*10;
System.out.println("your bill");
System.out.println("Mr./Mrs."+name+" ,thank you for using red travels");
System.out.println("your total has been generated to Rs."+cost);
System.out.println("Your "+car +" will come to your current position on "+date_and_time);
System.out.println("please keep your GPS on");
}
else if(a>15&&a<=45)
{
int cost=number1*r*30;
System.out.println("your bill");
System.out.println("Mr./Mrs."+name+" ,thank you for using red travels");
System.out.println("your total has been generated to Rs."+cost);
System.out.println("Your "+car+" will come to your current position on ");
System.out.println("please keep your GPS on");
}
else
{
int cost=r*15;
System.out.println("your bill");
System.out.println("Mr./Mrs."+name+" ,thank you for using red travels");
System.out.println("your total has been generated to Rs."+cost);
System.out.println("Your "+car+" will come to your current position within 30 min.");
System.out.println("please keep your GPS on");
}
break;
case 2:System.out.println("choose required option");
            System.out.println("1.railway services");
            System.out.println("2.metro services");
            int f=sc.nextInt();
               switch(f)
                 {
            case 1:String rid[]={"1.Andhra pradesh","2.Arunachal pradesh","3.Assam","4.Bihar","5.Chattisgarh","6.goa","7.gujrat","8.Haryana","9.Himachal pradesh","10.Jammu & Kashmir","11.jharkhand","12.karnataka","13.kerala","14.Madhya pradesh","15.Maharashtra","16.manipur","17.meghalaya","18.mizoram","19.nagaland","20.Odisha","21.Punjab","22.Rajasthan","23.Sikkim","24.Tamil nadu","25.Telangana","26.Tripura","27.Uttar pradesh","28.Uttara khand","29.West bengal","30.chandigarh","31.dadra","32.daman & diu","33.pudducherry","34.delhi"};
            int dir[]={500,600,700,1000,500,600,700,600,800,900,600,700,800,900,600,500,450,600,700,800,900,700,600,700,800,600,700,800,700,900,600,450,600};
            for(int fin=0;fin<=32;fin++)
            {
                System.out.println(rid[fin]);
            }
            System.out.println("enter choice");
            int riot=sc.nextInt();
            switch(riot)
            {
                case 1:r=dir[0];
                break;
                case 2:r=dir[1];
                break;
                case 3:r=dir[2];
                break;
                case 4:r=dir[3];
                break;
                case 5:r=dir[4];
                break;
                case 6:r=dir[5];
                break;
                case 7:r=dir[6];
                break;
                case 8:r=dir[7];
                break;
                case 9:r=dir[8];
                break;
                case 10:r=dir[9];
                break;
                case 11:r=dir[10];
                break;
                case 12:r=dir[11];
                break;
                case 13:r=dir[12];
                break;
                case 14:r=dir[13];
                break;
                case 15:r=dir[14];
                break;
                case 16:r=dir[15];
                break;
                case 17:r=dir[16];
                break;
                case 18:r=dir[17];
                break;
                case 19:r=dir[18];
                break;
                case 20:r=dir[19];
                break;
                case 21:r=dir[20];
                break;
                case 22:r=dir[21];
                break;
                case 23:r=dir[22];
                break;
                case 24:r=dir[23];
                break;
                case 25:r=dir[24];
                break;
                case 26:r=dir[25];
                break;
                case 27:r=dir[26];
                break;
                case 28:r=dir[27];
                break;
                case 29:r=dir[28];
                break;
                case 30:r=dir[29];
                break;
                case 31:r=dir[30];
                break;
                case 32:r=dir[31];
                break;
                case 33:r=dir[32];
                break;
                default:System.out.println("invalid");
            }
              int cos=100*r;
            System.out.println("your bill");
            System.out.println("Mr./Mrs"+name+" ,Thank you for using red travels");
            System.out.println("your total has been generated to Rs."+cos);
            System.out.println("Train will arrive at the platform half hourly");
            System.out.println("Please wait");
            break;
            case 2:String oK[]={"1.gottigere","2.bilekahalli","3.white field","4.palace grounds","5.bommanahalli","6.K R Market","7.chikkapete","8.malleshwara"};
            int Ko[]={100,80,200,150,90,70,80,160}; 
            for(int fis=0;fis<=7;fis++)
            {
                System.out.println(oK[fis]);
            }
            System.out.println("enter choice");
            int rio=sc.nextInt();
            switch(rio)
            {
                case 1:r=Ko[0];
                break;
                case 2:r=Ko[1];
                break;
                case 3:r=Ko[2];
                break;
                case 4:r=Ko[3];
                break;
                case 5:r=Ko[4];
                break;
                case 6:r=Ko[5];
                break;
                case 7:r=Ko[6];
                break;
                case 8:r=Ko[7];
                break;
                case 9:r=Ko[8];
                break;
                case 10:r=Ko[9];
                break;
                default:System.out.println("invalid");           
                }
                int cost=100*r;
            System.out.println("your bill");
            System.out.println("Mr./Mrs"+name+" ,Thank you for using red travels");
            System.out.println("your total has been generated to Rs."+cost);
            System.out.println("Train will arrive at the platform half hourly");
            System.out.println("Please wait");
            break;
            }
        }

        }

public static void Rakshan()
{
    
        switch(choice1)
        {
         case 3: Scanner sc=new Scanner(System.in);
         System.out.println("Enter your destination:\n1.Delhi,\n2.Mumbai,\n3.Kolkata,\n4.Hyderabad,\n5.Vishakapatna");
          System.out.println("Here is the cost of ticket per passenger:\n1.Delhi-INR.18000\n2.Mumbai-INR.25000\n3.Kolkata-INR.35000\n4.Hyderabad-INR.45000\n5.Vishakapatna-INR.90000");   
         int search1=sc.nextInt();
         if(search1>5)
         System.out.println("PLese choose 1,2,3,4 or 5");
         System.out.println("Congrats!You have availed the new year offer:NO tickets for children below 14 years of age!!\nEnter the number of Adults.");
         int n=sc.nextInt();
         int price[]={n*18000,n*25000,n*35000,n*45000,n*90000};
         int deno[]={1,2,3,4,5};
         String dest[]={"Delhi","Mumbai","Kolkata","Hyderabad","Vishakapatna"};
         int flag=0,l,u,m=0;
         l=0;u=5;
         while(l<=u)
         {
             m=(l+u)/2;
             if(search1>deno[m])
             l=m+1;
             else if(search1<deno[m])
             u=m-1;
             else
             {flag=1;
                 break;
               }
         }
         if(flag==1)
          pos=m;
         else
         {System.out.println("Please choose a destination from the list:)");break;}
         System.out.println("Choose the date and time this month\n1.1st January:0500\n2.3rd January:1600\n3.6th January:2200\n4.15th January:1900\n5.28thJanuary:0030");
         int dt=sc.nextInt();
         if(dt==1)
         date_and_time="1st January 2018,0500";
         else if(dt==2)
         date_and_time="3rd January 2018,1600";
         else if(dt==3)
         date_and_time="6th January 2018,2200";
         else if(dt==4)
         date_and_time="15th January 2018,1900";
         else if(dt==5)
         date_and_time="28th January 2018,0030";
         else
         System.out.println("Please choose 1,2,3,4 or 5");
         System.out.println("Please wait while we generate your bill!");
        
         
         System.out.println("               Red Travels                          ");
         System.out.println(" Name:"+name                                       );
         System.out.println(" Aadhar no.:"+aadhar                                        );
         System.out.println(" Number of Adults:"+n                                        );
         System.out.println(" Mode of transport:Airways(Rakshan 1315 luxury airways)                                                               ");
         System.out.println(" Destination:"+dest[pos]                                        );
         System.out.println(" Total Amount(Including all taxes):INR "+price[pos]                                        );
         System.out.println(" Date and time:"+date_and_time                                        );
         System.out.println("           Please be present at the Rakshan International Airport 45 minutes before the stipulated time" );
         System.out.println("                                  Have a safe and a happy journey                                    ");
         System.out.println("                              Thank you for travelling in Red travels                            ");
        
         break;
         case 4 : 
         Scanner sc1=new Scanner(System.in);System.out.println("Enter your destination:1.Sri Lanka,\n2.Lakshadweep,\n3.Andaman and Nicobar,\n4.Madagascar,\n5.New Zealand");
          System.out.println("Here is the cost of ticket per passenger:\nINR.16000\nLakshadweep-INR.20000\nAndaman and Nicobar-INR.25000\nMadagascar-INR.50000\nNew Zealand-INR.100000");   
         int search2=sc1.nextInt();
          if(search2>5)
         System.out.println("PLese choose 1,2,3,4 or 5");
         System.out.println("Congrats!You have availed the new year offer:NO tickets for children below 14 years of age!!\nEnter the number of Adults.");
         int n1=sc1.nextInt();
         int price1[]={n1*16000,n1*20000,n1*25000,n1*50000,n1*100000};
         String dest1[]={"SriLanka","Madagascar","NewZealand","AndamanandNicobar","Lakshadweepislands"};
         int deno1[]={1,2,3,4,5};
         int flag1=0,lb,ub,mi=0;
         lb=0;ub=5;
         while(lb<=ub)
         {
             mi=(lb+ub)/2;
             if(search2>deno1[mi])
             lb=mi+1;
             else if(search2<deno1[mi])
             ub=mi-1;
             else
             {flag1=1;
                 break;
               }
         }
         if(flag1==1)
          pos=mi;
         else
         {System.out.println("Please choose a destination from the list:)");break;}
         System.out.println("Choose the date and time this month\n1.1st January:0500\n2.15th January:1600");
         int dat=sc1.nextInt();
         if(dat==1)
         date_and_time="1st January 2018,5a.m";
         else if(dat==2)
         date_and_time="15th January 2018,4p.m.";
         else
         System.out.println("Please choose 1 or 2");
         System.out.println("Please wait while we generate your bill!");
        
         String Name=name;
         System.out.println("               Red Travels                          ");
         System.out.println(" Name:"+Name                                      );
         System.out.println(" Aadhar no.:"+aadhar                                        );
         System.out.println(" Number of Adults:"+n1                                        );
         System.out.println(" Mode of transport:Waterways(Rakshan 1315 luxury cruise ship) [15 days ultra luxury cruise]           ");
         System.out.println(" Destination:"+dest1[pos]                                        );
         System.out.println(" Total Amount(Including all taxes):INR"+price1[pos]                                        );
         System.out.println(" Date and time:"+date_and_time                                        );
         System.out.println("           Please be present at the Rakshan International Harbour 45 minutes before the stipulated time" );
         System.out.println("                                  Have a safe and a happy journey                                    ");
         System.out.println("                              Thank you for travelling in Red travels                            ");
        
         
         break;
         default:System.out.println(" ");
        }
    }
    static void main()
    {
       
        
        display();
    }
}
