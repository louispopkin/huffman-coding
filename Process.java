package afterResearch;

public class Process {
	
	static Dictionary d;
	String fileName;
	Data or;
	String contents;
	
	int dLen; 	//length of Dictionary
	int rLen;	//of oRiginal file
	
	public Process (Dictionary dictionary, String fileName, Data originalFile){
		//Initialize
		d = dictionary;
		or = originalFile;
		dLen = d.getLength();
		rLen = or.chars;
		contents = or.contents;
		//End Initialize
	}
	public int findChar(char c){
		for(int x=0;x<dLen;x++){
			if(d.dict[x].Char==c) return x;
		}return -1;//If Failure
	}
	public char getCharAt(int a){	return d.dict[a].Char;}
	public int findBin(String b){
		for(int x=0;x<dLen;x++){
			if(d.dict[x].bin==b) return x;
		}return -1;//If Failure
		
	}
	public String getBinAt(int a){ return d.dict[a].bin;}
	
	public String toBin(){
		char temp = ' ';
		int at = 0;
		String total = "";
		for(int x=0;x<rLen-1;x++){
			temp = contents.charAt(x);
			at = findChar(temp);
			total += getBinAt(at);
		}
		return total;
	}
}
