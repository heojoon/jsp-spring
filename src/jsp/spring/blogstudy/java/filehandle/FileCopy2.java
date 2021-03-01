package jsp.spring.blogstudy.java.filehandle;

import java.io.*;

//DataInputStream , DataOutputStream.
class MultiStream{
	
	public void run() {
		InputStream is=null ,is2 = null;
		OutputStream os = null;
		DataInputStream dis=null,dis2 = null;
		DataOutputStream dos = null;

		try {
			String[] fileName = new String[2];
			fileName[0] = "java_in1.txt";
			fileName[1] = "java_in.txt";
			
//---------------------------------------------------------------------------------------------//
			os = new FileOutputStream(fileName[0]);
			dos = new DataOutputStream(os);
			dos.writeUTF("Writing to file.... by DataOutputStream writeUTF Method");
			
			is = new FileInputStream(fileName[0]);
			dis = new DataInputStream(is);
			
			// readUTF 는 반드시 UTF로 인코딩된  파일만 읽어올 수 있다.
            System.out.println(dis.readUTF());
//---------------------------------------------------------------------------------------------//
            
            is2 = new FileInputStream(fileName[1]);
			dis2 = new DataInputStream(is2);
			//System.out.println(dis2.readUTF());	// 저장한 파일이  UTF로 인코딩하지 않았기 때문에 에러...
			byte[] readbytes = new byte[100];
			dis2.read(readbytes);
			String content = new String(readbytes);
			System.out.println(content);
			
//---------------------------------------------------------------------------------------------//			
		} catch (Exception e) {
			System.out.println("in progress... Error");	
			System.out.println(e.getMessage());
			e.printStackTrace();
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
				}catch(Exception e3) {
					System.out.println(e3.getMessage());
				}
			}
		}

	}
}

public class FileCopy2 {
	public static void main(String[] args) {

		MultiStream a = new MultiStream();
		a.run();
	}
}
