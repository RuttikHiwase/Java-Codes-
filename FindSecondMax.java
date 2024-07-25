package Arrays;

public class FindSecondMax {
    public static void main(String[] args) {
        int arr[]={110,20,40,30,100,90,60};
        int max=0;
        int smax=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<max && arr[i] > smax)
            {
                smax=arr[i];
            }
        }
        System.out.println(smax);

    }
}
