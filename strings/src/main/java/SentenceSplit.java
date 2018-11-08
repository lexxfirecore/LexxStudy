import java.util.Arrays;

/**
 * Created by Alex Corghencea on 24 October 2018.
 */
public class SentenceSplit {

    public static void main(String[] args) {
        String text = "Ziua incepe cu un rasarit de soare. La amiaza soarele e in zenit. Sara soarele ne bucura cu un asfentit miraculos.";
        String[] cuvinte = text.split(" ");
        System.out.println(Arrays.toString(cuvinte));
        System.out.println(cuvinte.length);

        String[] propozitii = text.split("[.]");
        System.out.println(Arrays.toString(propozitii));
        System.out.println(propozitii.length);

    }
}
