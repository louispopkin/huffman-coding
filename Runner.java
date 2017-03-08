import java.io.File;

public class Runner {

	public static void main(String[] args) throws Exception {
		Data raw = new Data(new File("TestFile.txt"));
		//System.out.println(raw.getInfo());
		
		//System.out.println(raw.contents);
		
		HuffCode code = new HuffCode(raw.contents);
        System.out.println(code.getDict().toString());
	}

}
