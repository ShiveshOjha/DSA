import java.util.*;

class sum_0 {

    public static int[][] sort(int arr[][])
    {
        int l= arr.length;
        for(int p=0;p<l;p++)
        {
        for(int i=0;i<2;i++)
        {
            int min = i;
            for(int j=i+1;j<3;j++)
            {
                if(arr[p][j] < arr[p][min])
                {
                    min = j;
                }
            }
            int tmp = arr[p][min];
            arr[p][min] = arr[p][i];
            arr[p][i] = tmp;
        }
        }
        return arr;
    }

    public static int[][] duplicate(int arr[][])
    {
        int l= arr.length;

        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(arr[i][j] == arr[i+1][j] && arr[i][j+1] == arr[i+1][j+1])
                {
                    arr[i][0] = 0;
                    arr[i][1] = 0;
                    arr[i][2] = 0;
                }
            }
        }

        return arr;
    }

    public static void asga(int arr[])
    {
        int l = arr.length;
        int sum = 0;
        int s[][] = new int[l/2][3];
        int p=0;

        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(i!=j)
                {
                    for(int k=0;k<l;k++)
                    {
                        if(i!=k && j!=k)
                        {
                            sum = arr[i] + arr[j] + arr[k];
                            if(sum == 0)
                            {
                                s[p][0] = arr[i];
                                s[p][1] = arr[j];
                                s[p][2] = arr[k];
                                p++;
                                // System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                            }
                            sum = 0;
                            if(p>2)
                            break;
                        }
                        if(p>2)
                        break;
                    }
                    if(p>2)
                    break;
                }
            }
        }
        sort(s);
        duplicate(s);
        prt(s);

        
    }

    public static void prt(int arr[][])
    {
        
        for(int i=0;i<arr.length;i++)
        {
             System.out.print("[");
            for(int j=0;j<3;j++)
            {
                if ((arr[i][0] + arr[i][1]) != 0 && j!=2)
                System.out.print(arr[i][j]+",");
                if((arr[i][0] + arr[i][1]) != 0 && j==2)
                System.out.print(arr[i][j]+"]");
                

            }
            
            if((arr[i][0] + arr[i][1]) != 0 && i!=arr.length-1 )
            System.out.print(",");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,-5,4,2,-1,5};
        asga(nums);
    }
}
