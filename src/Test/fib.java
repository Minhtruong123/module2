package Test;

public class fib {
    public static int fib(int n){
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        int i=0;
        for (i=2;i<n+1;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
