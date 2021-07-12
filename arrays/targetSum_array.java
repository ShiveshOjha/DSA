import java.util.*;

class targetSum_array {
    
    public static void sum(int arr[],int t)
    {
        int l=arr.length;
        int s = 0;
        int f = 0;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                s = arr[i] + arr[j];
                if(s==t && i!=j)
                {
                    System.out.println("["+i+","+j+"]");
                    f=1;
                }
            }
            if(f==1)
            break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
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

        System.out.println("Enter target:");
        int t = sc.nextInt();

        sum(arr, t);
    }
}
