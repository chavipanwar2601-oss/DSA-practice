public class max_ele_of_array {
    public static void main(String[] args) {
        int[] arr ={34,56,87,12,53};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
           if(arr[i] > max) max = arr[i];
           
        } System.out.println(max);
    }
}
