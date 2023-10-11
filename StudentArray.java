import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"jeff","bob","freddy","nate","brad"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a student name:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (input_name.equals(students[i])) {
                System.out.println("Location of the student in array " + input_name + " is " + (i+1)  );
                isExist = true;
                break;
            }
        }
        if (isExist == false) {
            System.out.println("The student is not in the array");
        }
    }
}
