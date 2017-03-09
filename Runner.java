package afterResearch;

import java.io.File;

public class Runner {

	public static void main(String[] args) throws Exception {
		String fileName = "ShortTest.txt";
		Data raw = new Data(new File(fileName));
		//System.out.println(raw.getInfo());
		
		//System.out.println(raw.contents);
		
		HuffCode code = new HuffCode(raw.contents);
		Process test = new Process(code.getDict(), fileName, raw);
		System.out.println(test.toBin());
	}

}
