package ReadFromGlobalEnvironmentFiles;

import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Set;

public class GlobalValuesDrive {

    public  void loadPropertiesFromFile() throws IOException {
        Properties prop = new Properties();
        ClassLoader clsLoader = ClassLoader.getSystemClassLoader();
        File file = new File("C:\\Rahula Space\\Intellij Idea Projects\\githubRepo\\TestNGLearning\\src\\test\\java\\resources\\SeleniumWebDriverProps\\data.properties");
        FileInputStream fis = new FileInputStream(file);
        prop.load(fis);
        Set<Object> pairsKeys = prop.keySet();
        int size = pairsKeys.size();

        for(Object key : pairsKeys) {
            System.out.println("Key = "+key +" / Value = "+prop.getProperty(key.toString()));
        }
        System.out.println(prop.getProperty("browser"));


        prop.setProperty("AmazonUrl","http://www.amazon.com");
        FileOutputStream fos = new FileOutputStream(file);
        prop.store(fos,"add amazon url");

    }

    public  File getFile(String fileName) throws FileNotFoundException {

        //ClassLoader classLoader = GlobalValuesDrive.class.getClass().getClassLoader();

       // URL resource = classLoader.getResource(fileName);
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource("SeleniumWebDriverProps");
        String path = url.getPath();
        System.out.println(path);

        URL resource = GlobalValuesDrive.class.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }
    }
    public static void  main(String args[]) throws IOException {
        GlobalValuesDrive obj = new GlobalValuesDrive();
        obj.loadPropertiesFromFile();
    }
}
