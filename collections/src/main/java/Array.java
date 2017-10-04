import java.util.Arrays;

/**
 * Created by Alex Corghencea on 07 September 2017.
 */
public class Array {

        public static void main(String[] args) {

            for (int key = 0; key < 7; key++) {

                int array[] = {1, 2, -3, 4};
                Arrays.sort(array);
                printArray("Sorted array", array);

                int index = Arrays.binarySearch(array, key);
                System.out.println("Found key " + key + " at " + index );

                printArray("Sorted array", array);

                index = Arrays.binarySearch(array, key);
                System.out.println("Found key " + key + " at " + index );
            }




        }

        private static void printArray(String message, int array1[]) {
       //     System.out.println(message + ": [lenght: " + array1.length + "]");
            for (int i = 0; i < array1.length; i++) {
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.print(array1[i]);
            }
            System.out.println();
        }
}
