class mergesort
{
    int[]arry;
    int[]temparry;
    int len;
    public static void main(String[] args) {
        int[]inputarr={5,4,3,2,1};
        mergesort ms=new mergesort();
        ms.sort(inputarr);
        for(int i:inputarr)
        {
            System.out.println(i+ " ");
        }

    }
    public void sort(int []inputarr)
    {
        this.arry=inputarr;
        this.len=inputarr.length;
        this.temparry=new int [len];
        divide(0,len-1);
    }
    public void divide(int lowerindex,int higherindex)
    {
        if(lowerindex<higherindex)
        {
            int middle=lowerindex+(higherindex-lowerindex)/2;
            divide(lowerindex,middle);
            divide(middle+1,higherindex);
            mergearry(lowerindex,middle,higherindex);
        }
    }
    public void mergearry(int lowerindex,int middle,int higherindex)
    {
        for(int i=0;i<=higherindex;i++)
        {
            temparry[i]=arry[i];

        }
        int i=lowerindex;
        int j=middle+1;
        int k=lowerindex;
        while(i<=middle && j<=higherindex)
        {
            if(temparry[i]<temparry[j])
            {
                arry[k]=temparry[i];
                i++;
            }
            else
            {
            arry[k]=temparry[j];
            j++;
            }
            k++;
        }
        while(i<=middle)
        {
            arry[k]=temparry[i];
            k++;
            i++;
        }
    }
}