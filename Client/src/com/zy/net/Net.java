package com.zy.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.zy.entity.Entity;

/**
 * 负责网络链接
 * @author Administrator
 *
 */
public class Net {

	public Entity connection(Entity e){
		try {
			//连接服务器
			Socket socket=new Socket("localhost", 8888);
			//发送数据
			ObjectOutputStream out=new ObjectOutputStream(
					socket.getOutputStream());
			ObjectInputStream in=new ObjectInputStream(
					socket.getInputStream());
			out.writeObject(e);
			e=(Entity) in.readObject();
			return e;
			//发送完毕结束out
			
			//接收数据
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("网络连接中断......");
			return null;
		}
		
	}
	
}
