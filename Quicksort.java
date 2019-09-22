class Quicksort
{
    public static void main(String[] args) 
    {
    int[] arr={3,7,8,5,2,1};
    int length=arr.length;
    Quicksort qs=new Quicksort();
    qs.Quicksortrecursion(arr,0,length-1);
    qs.printarr(arr);
    }
    
    public int partition(int[]arr,int low ,int high)
    {            
        int pivot=arr[(low+high)/2];  //we consider pivot in middle index value
            while (low<=high)
            {
                    while (arr[low]<pivot)
                    {
                        low++;
                    }
                    while (arr[high]>pivot)
                    {
                        high--;
                    }
                    if(low<=high)            //we are swapping 
                    {
                        int temp=arr[low];
                        arr[low]=arr[high];
                        arr[high]=temp;

                        low++;
                        high--;
                    }
            }
            return low;
    }
    public void Quicksortrecursion(int[]arr,int low,int high)
    {
        int pi=partition(arr,low,high); System.out.println("  "+pi);
        {
            if(low < pi-1)
            {
                Quicksortrecursion(arr,low,pi-1);
            }
            if(pi<high)
            {
                Quicksortrecursion(arr,pi,high);
            }
        }
    }
    public void printarr(int arr[])
    {
        for(int i:arr)
        System.out.println(i+" ");
    }
}