import jdk.javadoc.internal.doclets.formats.html.resources.standard;

class permu
{

    public static int fact(int n)
    {
        int f = 1;

        for(int i=n;i>1;i--)
        {
            f=f*i;
        }

        return f;
    }

    public static void per(int nums[])
    {
        int l = nums.length;
        int p = fact(l)/fact(l);
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
    }
}