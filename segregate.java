public class segregate {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,0,1,1};
        int numberofzeros =0;
        int numberofones =1;
        for(int ele:arr){
            if(ele==0)numberofzeros++;
            else numberofones++;
        }
        for(int i=0;i<numberofzeros;i++){
          System.out.print((arr[i]=0)+" ");
    }
    for(int j=0;j<numberofones;j++){
       System.out.print((arr[j]=1)+" ");
    }
}}
