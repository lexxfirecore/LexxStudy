import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

public class Args {

    private static String folder;

    public static void main(String[] args) {
        /*if (args == null) {
            staticMain(new String[]{"arg0", "arg1", "arg2", "arg3", "arg4", "arg5"});
        } else staticMain(args);*/

        String[] pathArray = {"Program", "Files", "And", "Folders", "Mega", "Pack"};
        String[] pathArray2 = {"The", "Book", "Of", "I"};
        String[] pathArray3 = {"Luxury", "Forever"};

        folder = createDir(pathArray);
        folder = createDir(pathArray2);
        folder = createDir(pathArray3);
        pathArray[0] = folder + pathArray[0];
        pathArray2[0] = folder + pathArray2[0];
        pathArray3[0] = folder + pathArray3[0];
        pathArray = ArrayUtils.addAll(pathArray, pathArray2);
        pathArray = ArrayUtils.addAll(pathArray, pathArray3);
        for (String a : pathArray) {
            System.out.print(a + " ");
        }

        getCommandLine(pathArray);
    }

    private static String[] getCommandLine(String[] args) {
        // in case any argument is a path that contains a space symbol, main class will consider it as two separate arguments
        // this small method will concatenate the two parameters that responds as a existing path
        Set<Integer> toRemove = new HashSet<>();
        String path;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            for (int j = i; j < args.length; j++) {
                sb.append(args[j]);
                path = sb.toString();
                if ((new File(path)).exists()) {
                    args[i] = path;
                    for (int k = i + 1; k <= j; k++) {
                        toRemove.add(k);
                    }
                    i = j;
                    break;
                }
                sb.append(" ");
            }
            sb.setLength(0);
        }

        Map<Integer,String> map = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            map.put(i, args[i]);
        }

        for (Integer ind : toRemove) {
            map.remove(ind);
        }

        return map.values().toArray(args);
    }

    private static String createDir(String[] pathArray) {
        StringBuilder sb = new StringBuilder();
        for (String s : pathArray) {
            sb.append(s + " ");
        }
        sb.setLength(sb.length() - 1);
        String path = sb.toString();
        File dir = new File("/temp/" + path);
        dir.mkdir();
        System.out.println("creating " + dir.getAbsoluteFile());
        return new File(dir.getParent()).getAbsolutePath() + "\\";
    }

    public static void staticMain(String[] args) {
        printArgs("original args:", args);
        args = ArrayUtils.remove(args, 3);
        printArgs("removed arg 3: ", args);

    }

    private static void printArgs(String text, String[] args) {
        System.out.println("\n" + text);
        for (String arg : args) {
            System.out.print(arg + " ");
        }
    }

}
