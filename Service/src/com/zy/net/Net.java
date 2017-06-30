package com.zy.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.zy.entity.Entity;
import com.zy.entity.User;
import com.zy.model.Model;

public class Net {
	Model m;
	public Net(){
		m=new Model();
	}
	public static void main(String[] args) {
		Net net=new Net();
		//服务器开启
		net.start();
	}
	public void start(){
		try {
			//开启服务器
			ServerSocket ss=new ServerSocket(8888);
			//等待客户端连接
			while(true){
			Socket socket=ss.accept();
			ObjectInputStream in=new ObjectInputStream(
					socket.getInputStream());
			ObjectOutputStream out=new ObjectOutputStream(
					socket.getOutputStream());
			//接收客户端数据
			Entity e=(Entity) in.readObject();
			System.out.println(e.getFlag());
			e=m.doCmd(e);
			out.writeObject(e);
			socket.shutdownInput();
			socket.shutdownOutput();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
