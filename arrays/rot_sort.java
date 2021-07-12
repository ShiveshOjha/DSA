import jdk.javadoc.internal.doclets.formats.html.resources.standard;

class rot_sort
{
    public static int pivot(int arr[], int t)
    {

        int l=arr.length;

        for(int i=0;i<l;i++)
        {
            if(arr[i]==t)
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int tr = 2;
        System.out.println(pivot(nums,tr));
    }
}