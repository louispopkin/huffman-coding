package afterResearch;

import java.io.File;
import java.util.Scanner;

public class Data {

	public int lines;  //Lines of text; starting at 0
	public int chars;
	public int bits;
	public String fileName;
	public String contents;

	public Data(File file) throws Exception {
		Scan(file);
		fileName = file.getName();
		chars = contents.length();
		countBits();
	}

	//Reads the file and saves it to contents
	private void Scan(File file){ 
		String total ="";
		try {

			Scanner input = new Scanner(file);
	        
	        lines = 0;
	        
	        while (input.hasNextLine()) {
	        	String line = input.nextLine();
	        	total += line + "\n";
	        	lines++;
	        }
	        input.close();
	
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		contents = total;
	} 
	
	private void countBits(){
		int len = contents.getBytes().length;
		bits = len*8;
	}
	
	public String getInfo(){
		return "INFO: "+fileName+" has "+lines+" lines, "+chars+" characters and "+bits+" bits.";
	}

	
}
