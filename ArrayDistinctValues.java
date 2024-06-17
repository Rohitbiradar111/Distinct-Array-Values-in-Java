//This program counts the number of Distinct elements in an array in Java

import java.util.Scanner;
public class ArrayDistinctValues {
    public static int countDigits(int arr[], int n)
    {
        int count = 0;
        boolean isdistinct = true;
        for(int i=0;i<n;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(arr[i] == arr[j])
                {
                    isdistinct = false;
                    break;
                }
            }
            if(isdistinct == true)
            {
                count++;
            }
            isdistinct = true;
        }
        return count;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array values/elements = ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(countDigits(arr, n));
    }
}