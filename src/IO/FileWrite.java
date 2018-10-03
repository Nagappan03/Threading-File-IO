package IO;

import java.io.*;

public class FileWrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("exp.txt");
		FileReader fr = null;
		try {
		if(f.exists()){
			fr = new FileReader(f);
			int c;
			while((c=fr.read())!=-1){
				System.out.print((char)c);
			}
		}
		else {
			f.createNewFile();
		}
	}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			fr.close();
		}
	}

}
