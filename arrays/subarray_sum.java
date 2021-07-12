import java.io.*;
import java.util.*;

class subarray_sum {

    public static void indx(int arr[], int sum)
    {
        int a[] = new int[2];
        int l = arr.length;
        int s = 0;
        int i = 0;
        int j = 0;
        int f = 0;
        System.out.println("l="+l+"\nsum="+sum);
        for(i=0;s!=sum;i++)
        {
            s+=arr[i];
            System.out.println("i="+i+"\narr[i]="+arr[i]+"\nj="+j+"\ns="+s+"\n\n");
            if(i==(l-1))
            {
                i=j;
            }
            if(j==(l-1))
            break;
            if(s>sum)
            {
                j++;
                i=j-1;
                s=0;
            }
            if(s==sum)
            {
                a[0] = j;
                a[1] = i;
                f = 1;
                if(i==0)
                i=l-1;
                System.out.println("Subarray between "+(j)+" and "+i);
                break;
            }
        }

        if(f==0)
        System.out.println("No subarray found");

    }

    public static void prt(int arr[])
    {
        int l = arr.length;
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter values in array: ");
        int i=0;
        while(sc.hasNext())
        {
            arr[i] = sc.nextInt();
            i++;
            if(i==n)
            break;
        }
        prt(arr);

        System.out.println("Enter sum: ");
        int sum = sc.nextInt();
        indx(arr,sum);

    }
}
