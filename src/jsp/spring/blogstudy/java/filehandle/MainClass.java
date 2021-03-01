package jsp.spring.blogstudy.java.filehandle;

import java.io.*;

// Example of write file
class OutputExample {
	public void writeFile() {
		OutputStream os = null;
		try {
			os = new FileOutputStream("java_out.txt");
			String str = "오늘 날씨가 좋네요!!";
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(os != null) {os.close();}
			}catch(Exception e2) {
				System.out.println(e2.getMessage());	
			}
		}

	}
}

// Example of read file
class InputExample {
	public void readFile() {
		
		InputStream is = null;
		
		try {
			is = new FileInputStream("java_in.txt");
			while (true) {
				int i = is.read();
				System.out.println("데이터:" + i);
				if (i == -1)
					break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(is != null) {is.close();}
			}catch(Exception e2) {
				System.out.println(e2.getMessage());	
			}
		}
	}
}

public class MainClass {
	public static void main(String[] args) {

		OutputExample iout = new OutputExample();
		iout.writeFile();

		InputExample iin = new InputExample();
		iin.readFile();
	}
}
