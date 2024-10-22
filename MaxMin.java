import java .util.*;

public class MaxMin {
    public static void main(String args[])
 {
     int a[] ={50,30,40,20,100};
    int max=a[0];
    for(int i=0;i<a.length;i++)
    {
        if(a[i]>max)
    {
        max=a[i];
    }    }
    
    } 
    System.out.println("Maximum Element in array is:"+ max);
    
    
    int min=a[0];
    for(int i=0;i<a.length;i++)
    {
        if(a[i]<min)
    {
        min=a[i];
}}
System.out.println("Minimum Element in an Array is:"+ min);
}
