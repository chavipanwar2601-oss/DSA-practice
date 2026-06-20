public class RotateArray {
    public static void main(String[] args) {
        int[] arr ={6,8,1,2,4,9,0};
        int n =arr.length;
        int i=0, j=2;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        } for(int ele:arr) System.out.print(ele+" ");
System.out.println();
        int k=3, l=n-1;
        while(k<l){
            int temp=arr[k];
            arr[k]=arr[l];
            arr[l]=temp;
            k++;
            l--;
        } for(int ele:arr) System.out.print(ele+" ");
System.out.println();
        int m=0, p=n-1;
        while(m<p){
            int temp=arr[m];
            arr[m]=arr[p];
            arr[p]=temp;
            m++;
            p--;
        } for(int ele:arr) System.out.print(ele+" ");
    }
}
