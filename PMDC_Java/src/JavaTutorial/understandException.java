package JavaTutorial;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class understandException {
		
	  private static FileInputStream fs;

	
		  public static void main(String[] args) {
		    try {
		    	// code that may generate IOException
			    File newFile = new File("test.txt");
			    
			    //System.exit(0);
			    
			    fs = new FileInputStream(newFile);	//1		    
			    System.out.println(fs.toString());
			    
		    }
			/*
			 * catch (IOException e) { System.out.println("IOException");//2
			 * 
			 * } catch (Exception e) { System.out.println("Exception"); }
			 */
		    catch (Throwable t) {
			      System.out.println("Throwable");
			    }
		    finally {
		    		System.out.println("always execute");//3
		    }
		  }
	}
