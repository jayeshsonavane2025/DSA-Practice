package practise;

public class array {
    public static void main(String[] args) {
        int a[]={9,8,7,6,5,4,3,2,0,1};
        //sortSelect(a);
        sortInsert(a);
        //sortBubble(a);
        for(int item:a){
            System.out.print(item+" ");
        }

    }
    public static void sortBubble(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j+1]<arr[j] ){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }

        }

    }

    //Selection sort
    public static  void sortSelect(int a[]){
        int min,temp,n=a.length;
        for (int i = 0; i <n-1 ; i++) {
            min=i;
            for (int j = i+1; j <n ; j++) {
                if (a[min]>a[j]){
                    min=j;
                }

            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;


        }

    }
    //insertion sort
    public static void sortInsert(int[] a){
        int n=a.length,last,index;
        for (int i = 1; i < n; i++) {
            last=a[i];
            index=i-1;
            while(index>=0 && a[index]>last)
                  index--;
            for (int k = i; k >(index+1); k--) {
                a[k]=a[k-1];

            }
            a[index+1]=last;

        }
    }

}
