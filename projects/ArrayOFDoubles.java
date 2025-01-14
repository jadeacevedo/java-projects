import java.util.*;

//problem 2 done in class assignment 9 
public class ArrayOFDoubles {
	    
	    
	     public static void main(String[]args)
	     { //CREATE TEH Array
	     double [] array = {3,2,9,1, 0};
	     System.out.println("original array: " + Arrays.toString(array));
	     System.out.println("Sorted Array: "+ Arrays.toString(bubbleSort(array)));
	         
	     }
	     
	     
	     
	     public static double [] bubbleSort(double [] a)
	     {
	         double temp;
	         for (int pass = 1; pass < a.length; pass ++ )
	         {  for (int i = 0; i < a.length - pass; i++)
	             {
	                  if (a[i]> a[i+1])
	                  { //swap
	                      temp = a[i];
	                      a[1]=a[i+1];
	                      a[i+1] = temp;
	                  }
	             }
	            System.out.println("After pass"+ pass +": " + Arrays.toString(a));
	            
	         }
	         return a;
	     }
	}
