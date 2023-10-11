import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,6,8};
        int[] arr2 = {2,6,7,9,1};
        int[] arr3 = new int[5];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[index] = arr1[i];
                    index++;
            }
        }

    }System.out.println(Arrays.toString(arr3));

}
}
