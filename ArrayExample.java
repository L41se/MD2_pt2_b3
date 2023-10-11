import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,6,8};
        numbers = add(numbers,1);
        numbers = delete(numbers,1000);
        System.out.println(Arrays.toString(numbers));

    }
    public static int[] add(int[] array, int value){
        int n = array.length;
        int[] newArray = new int[n+1];
        for (int i = 0; i < n; i++){
            newArray[i] = array[i];
        }
        newArray[n] = value;
        return newArray;
    }
    public static int[] delete(int[] array,int index){
        int n = array.length;
        int[] newArray1 = new int[n-1];
        int k = 0;
        for (int i = 0; i < n; i++){
            if (i == index){
                continue;
            }
            newArray1[k]=array[i];
        }
        return newArray1;
    }
}
