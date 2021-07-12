class maxSubarr
{

    public static int sum(int arr[])
    {
        int l = arr.length;
        int max = Integer.MIN_VALUE;
        int min = 0;
        int start = 0, end = 0, s=0;

        for(int i=0;i<l;i++)
        {
            min = min + arr[i];
            if(max < min)
            {
                max = min;
                start = s;
                end = i;
            }
            if(min<0)
            {
                min=0;
                s=i+1;
            }
        }

        System.out.println("start = "+start+"\nend = "+end+"\n");


        return max;
    }

    public static void prt(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            System.out.print(arr[i]+", ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int nums[] = {-2,1,3,-4,1,-2,1,5,4};
        prt(nums);
        System.out.println(sum(nums));
    }
}