package IO;
import java.io.*;

public class FileRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("exp.txt");
		FileWriter fw = null;
		try {
		if(f.exists()){
			fw = new FileWriter(f);
			fw.write("Hi Nagappan");
		}
		else {
			f.createNewFile();
		}
	}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			fw.close();
		}
	}

}
