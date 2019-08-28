package com.boco.demo04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class Upload implements Runnable {

	private Socket socket;

	public Upload(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try{
			InputStream in = socket.getInputStream();
			File upload=new File("D:\\upload");
			if(!upload.exists()){
				upload.mkdirs();
			}
			FileOutputStream fos=new FileOutputStream(upload+"\\t.png");
			byte [] b=new byte[1024];
			int len=0;
			while ((len=in.read(b))!=-1){
				fos.write(b, 0, len);
			}
			socket.getOutputStream().write("上传成功".getBytes());
			fos.close();
			socket.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
}
