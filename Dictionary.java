import java.util.Arrays;

public class Dictionary {
	
		public FreqNode[] dict;
		public int count;
		
		public Dictionary(){
			count = 0;
			
		}
		public void add(FreqNode input){
			count++;
			if(count==1){
				dict = new FreqNode[1];
				dict[0] = input;
			} else{
				dict = addOn(dict,input);
			}
		}
		private FreqNode[] addOn(FreqNode[] input, FreqNode newNode){
			input = Arrays.copyOf(input, input.length+1);
			input[input.length-1] = newNode;
			return input;
		}
		public String toString(){
			if(count==0)return "Dictionary Is Empty.";
			String total = "";
			for(int x=0;x<count;x++){
				total+=dict[x].Char + "\t" + dict[x].bin+"\n";
			}
			
			return total;
		}
		public int getLength(){
			return dict.length;
		}
}
