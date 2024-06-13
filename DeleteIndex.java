public class DeleteIndex {
    public static void main(String[] args) {
        int [] arr={10,11,22,34,44,55};
        int key=22,n=5;
        int i;
        for(i=0;i<n;i++)

            if(arr[i]==key)
                break;

        for(int j=i;j<n-1;j++)
        {
            arr[j]=arr[j+1];
        }


    }
}
