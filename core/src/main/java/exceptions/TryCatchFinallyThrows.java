package exceptions;

/**
 * Created by Alex Corghencea on 07 September 2017.
 */
public class TryCatchFinallyThrows {

    public static void main(String[] args) {

        anotherMethod(0);
        anotherMethod(765);

    }

    private static void anotherMethod(int var) {
        try {
            buggyMethod(var);
        } catch (InstantiationException e) {
            System.out.println("Exception message: " + e.getMessage());
            //e.printStackTrace();  // asta printeaza tot stack dar strica ordinea la celalalt text
        } finally {
            System.out.println("\n*** finally: With or without exception occurs it will run.");
        }

    }

    private static void buggyMethod(int var) throws InstantiationException {
        System.out.println("\n*** buggyMethod var: " + var);
        if (var == 0) {
            return;
        }
        throw new InstantiationException("A error occurred during instantiation code: " + var);
    }

}
