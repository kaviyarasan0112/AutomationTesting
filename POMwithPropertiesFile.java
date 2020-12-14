import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class POMwithPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String UN = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		System.out.println(UN);
		System.out.println(pwd);

	}

}
