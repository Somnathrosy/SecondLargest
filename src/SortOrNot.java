public class SortOrNot {
    static boolean Is_Sort(int[] arr, int n){
        for (int i =1;i<n;i++){
            if(arr[i]<arr[i-1])
                return false;
            }
        return true;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,4,5,6,7,8};
        int n = arr.length;
        System.out.println(Is_Sort(arr,n));

    }
}
