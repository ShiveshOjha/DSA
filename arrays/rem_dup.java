class rem_dup {

    public static int dupl(int arr[])
    {
        int l=arr.length;
        int k[] = new int[l];
        int c=1;
        int y=0;

        if(l<1)
        return c;

        if(l>1)
        {
        for(int i=0;i<l-1;i++)
        {
            

            if(arr[i]!=arr[i+1])
            {
                k[y]=arr[i];
                y++;
                c++;
            }

            if(i==(l-2) )
            {
                k[y]=arr[i+1];
                //y++;
                //k[y] = -78452;
                break;
            }

        }
       
        for(int w=0;w<l;w++)
        {
            arr[w]=k[w];
        }

        // System.out.print("[");
        // for(int p=0;p<l;p++)
        // {
            

        //     if(p!=c-1)
        //     {
        //         System.out.print(k[p]+",");
                
        //     }

        //     if(k[p+1]==-78452)
        //     {
        //         System.out.print(k[p]);
        //         break;
        //     }

        // }

        // System.out.print("]\n");
    }
        return c;
    
    }

    public static void main(String[] args) {
        int a[] = {1,2}; //{0,0,1,1,1,2,2,3,3,4,6,8,8,8,8};
        System.out.println(dupl(a));
    }
}