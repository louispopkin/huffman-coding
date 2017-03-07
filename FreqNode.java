public class FreqNode {
	
	private char Char;
	public int freq;
	
	public FreqNode(char inC){
		Char = inC;
		freq = 0;
	}
	public FreqNode(char inC, int frq){
		Char = inC;
		freq = frq;
	}
	public void add(){
		freq++;
	}
}
