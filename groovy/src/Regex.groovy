/**
 * Created by Alex Corghencea on 05 September 2018.
 */
public class Regex {

    static void main(String[] args) {
        def currentPatchResourcesDir = "patches/" + "${project['version']}".replaceFirst("([0-9]*.[0-9]*.[0-9]*.)([0-9]*)","\$1x").replace("-SNAPSHOT","")
        println currentPatchResourcesDir;



    }

}
