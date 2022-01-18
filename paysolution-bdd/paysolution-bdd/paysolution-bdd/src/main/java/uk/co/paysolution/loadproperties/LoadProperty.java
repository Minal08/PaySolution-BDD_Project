package uk.co.paysolution.loadproperties;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperty {


    String projectPath = System.getProperty("user.dir");
    static Properties prop;
    static FileInputStream input;
    public  String getProperty(String key){
        prop = new Properties();
        try {
            input = new FileInputStream(projectPath + "/src/test/resources/propertyfile/config.properties");
            prop.load(input);
        } catch (Exception e){
            e.printStackTrace();
        }
        return  prop.getProperty(key);

    }
}
