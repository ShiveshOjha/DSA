import java.io.*;
import java.util.*;

class mrg_arrays{

    public static void prt(int arr[]){
        int l = arr.length;
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] mrg(int a1[], int a2[])
    {
        int l = a1.length;
        int m[] = new int[l*2];

        int i=0, j=0, k=0;

        while(i<l && j<l)
        {
            if(a1[i] < a2[j])
            {
                m[k] = a1[i];
                k++; i++;
            }
            else
            {
                m[k] = a2[j];
                k++;j++;
            }            
        }

        while(i<l)
        {
            m[k] = a1[i];
            k++; i++;
        }

        while(j<l)
        {
            m[k] = a2[j];
            k++; j++;
        }



        return m;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int a1[] = new int[n];
        int a2[] = new int[n];

        System.out.println("Enter values in array 1: ");
        int i=0;
        while(sc.hasNext()){
            a1[i] = sc.nextInt();
            i++;
            if(i==(n))
            break;
        }

        System.out.println("Enter values in array 2: ");
        i=0;
        while(sc.hasNext()){
            a2[i] = sc.nextInt();
            i++;
            if(i==(n))
            break;
        }

        prt(a1);
        prt(a2);
        
        int[] mr = (mrg(a1,a2));
        System.out.print("\nFinal Array -\n");
        prt(mr);

    }
}