package IO;
import java.io.*;

public class InputStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("exp.txt");
		FileInputStream fi = null;
		try {
			fi = new FileInputStream(f);
			int c;
			while((c=fi.read())!=-1){
				System.out.print((char)c);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			fi.close();
		}
	}

}
