import java.io.File;
import java.util.Scanner;

public class ReadDictionary {
	//READ DICTIONARY
	//TAKE EVERY E AND PUT THAT INTO THE T ON FREQ NODE
	//TAKE THE FREQ NUMBER AND TURN THAT INTO THE NODE NUMBER
	
	private int lines;  //Lines of text; starting at 0
	private int chars;
	public int bits;
	public String fileName;
	private String contents;
	public Data meme;
	
	public ReadDictionary(File file) throws Exception{
		meme = new Data(file);
		
		
	}
	
	public FreqNode getNode(String line){
		char ch = line.charAt(0);
		line = line.substring(1);
		line = line.substring(1);
		int fr = Integer.valueOf(line);
		FreqNode dank = new FreqNode(ch,fr);
		return dank;
		
	}


}
