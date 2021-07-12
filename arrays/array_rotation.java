import java.util.*;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

class array_rotation {


    public static void rotation(int arr[],int d)
    {
        int l = arr.length;
        int rtr[] = new int[l];
        int f=d;

        for(int i=0;i<l;i++)
        {
            rtr[i]=arr[f];
            f++;
            if(f==l)
            f=0;
        }

        prt(rtr);
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
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i = 0;
        while(sc.hasNext())
        {
            arr[i] = sc.nextInt();
            i++;
            if(i==n)
            break;
        } 
        System.out.println("Enter d:");
        int d = sc.nextInt();
        prt(arr);
        rotation(arr, d);
    }
}
