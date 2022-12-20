public class reverseArray {
    public static void main(String[] args) {
        int array[]={10,20,30,40};
        int new_Array[]=reverseArray(array, array.length);
        printArray(array);
        printArray(new_Array);


    }
    static int[] reverseArray(int a[], int n)
    {
        int b[]=new int[n];
        int j=n-1;
        for (int i=0;i<n;i++){
            b[i]=a[j];
            j--;

        }
        return b;
    }
    static void printArray(int x[]){
        for (int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+",");
        }
        System.out.println("\b");
    }
}
