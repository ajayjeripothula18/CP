class LinearSearch{

    public static void Linearsearch(int[] arr,int n)
    
    {
        for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==n)
        {
        System.out.println(n+" Found at index "+i);
        }
    }
    System.out.println("Not Found");
    }

    public static void main(String args[]) {
    
    int[] arr={12,43,32,54,24,97};

    int n=24;
    Linearsearch(arr,n);
    }

}
