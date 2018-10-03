package IO;
import java.io.*;

public class Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("exp.txt");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.lastModified());
		System.out.println(f.length());
		System.out.println(f.getName());
		System.out.println(f.isHidden());
	}

}
