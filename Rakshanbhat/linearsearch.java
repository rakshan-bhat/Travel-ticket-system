import java.util.Scanner;
class linearsearch extends redtravels
{
    public static void main()
    {
        
        int a[]={1,2,3,4,5,6,7,8,9,10};
        System.out.print("all ");
        System.out.println("the best");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to be searched");int flag=0;
int n=sc.nextInt();int i=0;
for( i=0;i<10;i++)
{
if( n==a[i])
{flag=1;
break;} 
}
if(flag==1)
System.out.println("Element found at"+(i+1));
else
System.out.println("Element not found");
}
}