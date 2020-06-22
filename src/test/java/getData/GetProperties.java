package getData;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProperties {

    private static Properties properties;

    static {
        properties = new Properties();
        try(InputStream inputStream = GetProperties.class.getClassLoader().getResourceAsStream("testData.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty (String property){
        return properties.getProperty(property);
    }
}
