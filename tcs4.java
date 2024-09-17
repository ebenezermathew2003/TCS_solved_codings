/*A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

Note :
RxC- Size of the matrix
Elements of the matrix M should be only 0 or 1. */
import java.util.*;
public class tcs4 {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int row=sc.nextInt();
       int col=sc.nextInt();
       int arr[][]=new int[row][col];
       for(int i=0;i< row;i++)
           for(int j=0;j< col;j++)
               arr[i][j]=sc.nextInt();
       
             int max=0,count=0,index=0;
             for(int i=0;i< row;i++)
               { 
                   count=0;
                   for(int j=0;j< col;j++)
                   {
                       if(arr[i][j]==1)
                       count++;
                   }
                       if(count>max)
                   {
                       max=count;
                       index=i+1;
                   }
                }
       System.out.println(index);
   }
}