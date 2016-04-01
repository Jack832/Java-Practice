import java.io.*;
import java.util.*;
class array2
{
public static void main(String arg[])
  {
//part1: taking input from user row and col
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the size of array row");
  int row=sc.nextInt();
  System.out.println("enter the size of array col");
  int col=sc.nextInt();
 int arr[][]=new int [row][col];
  for(int i=0;i<row;i++)
  {
  for(int k=0;k<col;k++)
	{ 
	  System.out.println("enter the elements in array ");
	  arr[i][k]=sc.nextInt();
	}
  }
  for(int i=0;i<row;i++)
  {
    for(int k=0;k<col;k++)
	{
 	   PrintWriter pw =new PrintWriter(System.out,true);
       pw.println("the array is "+arr[i][k]);
	}
   }
}}
