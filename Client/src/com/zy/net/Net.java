package com.zy.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.zy.entity.Entity;

/**
 * ������������
 * @author Administrator
 *
 */
public class Net {

	public Entity connection(Entity e){
		try {
			//���ӷ�����
			Socket socket=new Socket("localhost", 8888);
			//��������
			ObjectOutputStream out=new ObjectOutputStream(
					socket.getOutputStream());
			ObjectInputStream in=new ObjectInputStream(
					socket.getInputStream());
			out.writeObject(e);
			e=(Entity) in.readObject();
			return e;
			//������Ͻ���out
			
			//��������
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("���������ж�......");
			return null;
		}
		
	}
	
}
