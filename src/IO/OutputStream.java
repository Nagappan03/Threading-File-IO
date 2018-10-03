package IO;
import java.io.*;

public class OutputStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("exp.txt");
		FileOutputStream fo = null;
		String s = "Hi How are you Nagappan";
		byte[] b = s.getBytes();
		try {
			fo = new FileOutputStream(f);
			fo.write(b);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			fo.close();
		}
	}

}
