import jdk.javadoc.internal.doclets.formats.html.resources.standard;

class spiral_mat
{

    public static int[] spr(int mt[][])
    {

        int m = mt.length;
        int n = mt[0].length;
        int l = m*n;
        int y = 0;
        int b = n-1;
        int f = m-2;
        int g = 1;
        int d=1;
        int dr = 0;

        int k[] = new int[l];

        System.out.println(l);

        

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0) // 1st row
                {
                    k[y] = mt[i][j];
                    y++;
                }
                else if(i!=m-1 && i!=0) // last column
                {
                    if(d<m-1)
                    {
                    k[y] = mt[d][n-1];
                    y++;
                    d++;
                    }
                }
                else if(i == m-1) // last row 
                {
                    k[y] = mt[i][b];
                    y++;
                    b--;
                    if(b==-1)
                    dr = 1;
                }

               if(dr==1) // 1st column
                {
                   while(f!=0)
                    {
                    k[y] = mt[f][0];
                    y++;
                    f--;
                    dr=2;
                    }
                }

                // System.out.println("dr = "+dr);


                if(dr==2) // middle row
                {
                    
                    while(g!=(n-1))
                    {
                        k[y] = mt[1][g];
                        y++;
                        g++;
                    }
                }
            }
        }

       
        

        return k;
    }

    public static void prt(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int mt[][] = {{1,2,3},{4,5,6}}; //{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; //{{1,2,3},{4,5,6},{7,8,9}} ; //{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        prt(spr(mt));
    }
}