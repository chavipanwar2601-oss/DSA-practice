public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={4,7,9,8,3,1,2};
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
