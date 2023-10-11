import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
    int size;
    int [] array;
        Scanner scanner = new Scanner(System.in);
        //tạo mảng và xét điều kiện mảng
        do {
            System.out.println("enter the size of the array: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("the size of the array cannot be more than 20");
            }
        } while (size > 20);
        //nhập phần tử vào mảng
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter array element num " + (i+1) + ": " );
            array[i] = scanner.nextInt();
            i++;
        }
        //trình bày mảng
        System.out.print("Element in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print("\t" + array[j]);
        }
        //điều kiện để đảo ngược mảng
        for (int j = 0; j < array.length/2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        //trình bày mảng đảo ngược
        System.out.println("\n");
        System.out.print("Reversed Array: ");
        for (int j = 0; j < array.length; j++){
            System.out.print("\t" + array[j]);
        }
    }
}
