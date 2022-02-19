package by.it.skorobogatyi.jd01_14;

import static java.io.File.separator;


public class FilenameGetter {

    private static final String DOT = ".";


    public static String getFilename(Class<?> aClass, String root, String filename) {
        String userDir = System.getProperty("user.dir");
        String fullRootDir = userDir + separator + root + separator;
        String returnString = aClass.getPackageName().replace(DOT, separator);
        filename = returnString + separator + filename;
        return fullRootDir + filename;
    }
}
