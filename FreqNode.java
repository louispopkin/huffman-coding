public class FreqNode {
	
	private char Char;
	public int freq;
	
	public FreqNode(char inC){
		Char = inC;
		freq = 0;
	}
	public void add(){
		freq++;
	}
}
