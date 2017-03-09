package afterResearch;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileSave {
	
	public void saveBinary(String bin, String name){
		
		
	}
	
	private void save(Object in, String name){
		try{
			  FileWriter fstream = new FileWriter(name);
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write(in.toString());
			  out.close();
			  
			  }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
		
		
	}
}
