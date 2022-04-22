package herokuapp.assignment.config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFile {

		// TODO Auto-generated method stub
		private java.util.Properties prop=null;

		public void readPropertiesFile(){
		    prop = new Properties();
		    try {


		        InputStream input = new 
		        FileInputStream("C:\\Users\\mvijayanthi\\eclipse-workspace\\assignment\\src\\configs\\Configuration.properties");
		        prop.load(input);


		    } catch (Exception e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		  }
		public String getPropertyValue(String key){
		    return prop.getProperty(key);
		 }
	

}
