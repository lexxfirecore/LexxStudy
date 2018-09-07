/**
 * Created by Alex Corghencea on 05 September 2018.
 */
public class Regex {
    public static void main(String[] args) {

        String string1 = "patches/8.8.2.125.36-SNAPSHOT";
        String string2 = "patches/8.8.2.125.36";
        String string3 = "patches/123.456.789.125-SNAPSHOT";
        String string4 = "patches/111.2.34.1245-SNAPSHOT";
        String string5 = "patches/48641.489483.48613789.1251321-SNAPSHOT";
        String string6 = "patches/186132.eadxed.748ade.5-SNAPSHOT";


        System.out.println("\n" + string1 + "\n" + replace(string1));
        System.out.println("\n" + string2 + "\n" + replace(string2));
        System.out.println("\n" + string3 + "\n" + replace(string3));
        System.out.println("\n" + string4 + "\n" + replace(string4));
        System.out.println("\n" + string5 + "\n" + replace(string5));
        System.out.println("\n" + string6 + "\n" + replace(string6));
        

    }

    private static String replace(String string) {

        return string   .replace("-SNAPSHOT", "").replaceFirst("([0-9]*$)", "x");

    }
}
