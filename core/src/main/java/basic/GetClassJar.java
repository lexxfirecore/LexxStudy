package basic;

import java.net.URL;

/**
 * Created by Alex Corghencea on 19 October 2017.
 */
public class GetClassJar {
    public static void main(String[] args) {

        Class klass = com.sun.org.apache.xml.internal.utils.StringBufferPool.class;
        URL location = klass.getResource('/' + klass.getName().replace('.', '/') + ".class");
        System.out.println(location);
    }

}
