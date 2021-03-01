package jsp.spring.blogstudy.java.filehandle;

import java.io.*;

// Example of write file
class OneByteCopy{
	public void run() {
		InputStream is = null;
		OutputStream os = null;
		
		
		try {
			is = new FileInputStream("java_out.txt");
			os = new FileOutputStream("java_out_copy.txt");
			
			while(true) {
				int i = is.read();
				if (i==-1) break;
				os.write(i);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(is != null) {
				try {
					is.close();
				}catch(Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
			if(os != null) {
				try {
					os.close();
				}catch(Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}

	}
}

class MultiByteCopy{
	public void run() {
		InputStream is = null;
		OutputStream os = null;
		int count;
		
		try {
			is = new FileInputStream("java_out_copy.txt");
			os = new FileOutputStream("java_out_copy2.txt");
			
			byte[] bs = new byte[5];
			
			while(true) {
				count = is.read(bs);
				if (count == -1) break;
				os.write(bs,0,count);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(is != null) {
				try {
					is.close();
				}catch(Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
			if(os != null) {
				try {
					os.close();
				}catch(Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}

	}
}

public class FileCopy {
	public static void main(String[] args) {

		OneByteCopy a = new OneByteCopy();
		a.run();
		MultiByteCopy b = new MultiByteCopy();
		b.run();		
	}
}
