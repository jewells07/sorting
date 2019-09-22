import java.util.*;
class Binarysearch
{
    public static void main(String[] args)
    {
        int n,last,middle,first=0,search,array[];
        Scanner sc =new Scanner (System.in);
        System.out.println("How many elements you want:");
        n=sc.nextInt();
        System.out.println("Enter your "+n+" elements in Ascending order");
        array=new int [n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter your one element to search:");
        search=sc.nextInt();
        last=n-1;
        middle=(first+last)/2; 

        while (first<=last)
        {
        
       if(array[middle]==search) 
         {
            System.out.println(search + " found at location " + (middle+1) + ".");
            break;
         }
        else if(array[middle]<search)
         {
             first=middle+1;
         }
         else last=middle-1;

         middle=(first+last)/2; 
        }
        if(first>last)
        System.out.println(search + " isn't present in the list.\n");
    }
}