import java.util.*;

public class missing_no {

    public static void miss(int arr[], int pkk[])
    {
        int l = arr.length;

            int f=0;

            for(int k=0;k<l;k++)
            {
                for(int m=0;m<l;m++)
                {
                    if(pkk[k]==arr[m])
                    {
                        f=1;
                    }
                }

                if(f!=1)
                {
                System.out.print(pkk[k]+" ");
                }
                f=0;
            }
        
        System.out.println();

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
        int pk[] = new int[n];
        int i = 0;
        while(sc.hasNext())
        {
            arr[i] = sc.nextInt();
            pk[i] = i+1;
            i++;
            if(i==n)
            break;
        } 

        prt(pk);
        miss(arr, pk);
    }
}
