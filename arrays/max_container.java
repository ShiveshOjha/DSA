import java.util.*;

class max_container {

    public static void maxArea(int arr[])
    {
        int m1 = 0;
        int m2 = 0;
        int l = arr.length;
        int k1 = 0, k2 = 0;

        for(int i=0;i<l;i++)
        {
            if(arr[i]>m1)
            {
                m1=arr[i];
            }
        }
        for(int j=0;j<l;j++)
        {
            if(arr[j]>m2 && arr[j]!=m1)
            {
                m2=arr[j];
            }
        }

        int c = 0;

        for(int i=0;i<l;i++)
        {
            if(m1==arr[i])
            {
                k1=i;
                break;
            }
        }
        for(int i=0;i<l;i++)
        {
            if(m2==arr[i])
            {
                k2=i;
                break;
            }
        }

        int area = m2*(k2-1);
        System.out.println("DO the code again!!");


    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
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

        maxArea(arr);
    }
}
