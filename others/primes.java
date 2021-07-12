class primes
{

    public static int prime(int n)
    {
        int p = 0;
        int c = 0;

        if(n==2)
        return p=1;

        if(n==3)
        return p = 2;

        if(n>3)
        {
            for(int i=4;i<n;i++)
            {
                int k = i%10;
                if(k==1 || k==3 || k==5 || k==7 || k==9)
                for(int j=1;j<=i;j++)
                {

                    if((i%j)==0)
                    {
                        c++;
                    }
                    
                }
                
                if(c==2)
                {
                    p++;
                    c=0;

                }
                if(c>2)
                c=0;


            }
        }
        return p;
    }

    public static void main(String[] args) {
        int n = 499979; 
        System.out.println(prime(n));
    }
}