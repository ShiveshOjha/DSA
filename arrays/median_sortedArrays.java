import java.util.*;

class median_sortedArrays {

    public static void merge(int a1[], int a2[])
    {
        int n1 = a1.length;
        int n2 = a2.length;
        int l = n1+n2;
        int m[] = new int[l];

        int i=0, j=0, k=0;

        while(i<n1 && j<n2)
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

        while(i<n1)
        {
            m[k] = a1[i];
            k++; i++;
        }

        while(j<n2)
        {
            m[k] = a2[j];
            k++; j++;
        }

        double md=0;
        int e1 = l/2-1;
        int e2 = e1 + 1;

        if((l%2)==0)
        md = (m[e1] + m[e2])/2.0;
        else
        md = m[l/2];

        prt(m);
        System.out.println("m[e1]="+m[e1]+"\nm[e2]="+m[e2]);
        System.out.println("\ne1="+e1+"\ne2="+e2+"\nMedian is "+md);
        // System.out.println(md);
    }

    public static void prt(int arr[]){
        int l = arr.length;
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter values in array 1: ");
        int i=0;
        while(sc.hasNext())
        {
            arr1[i] = sc.nextInt();
            i++;
            if(i==n1)
            break;
        }

        System.out.println("Enter size of array 2: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter values in array 2: ");
        i=0;
        while(sc.hasNext())
        {
            arr2[i] = sc.nextInt();
            i++;
            if(i==n2)
            break;
        }

        merge(arr1, arr2);
    }
}
