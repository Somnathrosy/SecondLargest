public class Second_Largest {
    public static void main(String[] args) {
        int arr [] = new int[]{1,8,9,99,10,8,1,2,3,4,60};
        int n = arr.length;
        int largest = arr[0];

        // To find the Largest
        for(int i=0;i<n;i++)
            if(arr[i]>largest)
                largest = arr[i];

        //To find the Second Largest
        int Second_Largest = -1;
        for (int i=0;i<n;i++)
            if(arr[i]>Second_Largest && arr[i]!=largest)
                Second_Largest=arr[i];
        System.out.println("The second Largest Element: "+Second_Largest);
    }
}

