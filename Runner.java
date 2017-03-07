import java.io.File;

public class Runner {

	public static void main(String[] args) throws Exception {
		File test = new File("TestFile.txt");
		Data raw = new Data(test);
		raw.getInfo();

	}

}
