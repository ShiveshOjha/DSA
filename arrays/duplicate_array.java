import java.util.*;

public class duplicate_array {
    
    public static void repeat(int arr[])
    {
        int l = arr.length;
        int c = 0;
        int d = l/2;
        int dp[] = new int[d];
        int u = 0;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c>1)
            {
                dp[u] = arr[i];
                u++;
                if(u==d)
                break;
            }
            c=0;
        }
        prt(dp);

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

        repeat(arr);
    }
}
