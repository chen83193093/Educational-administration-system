package com.zy.view;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.zy.entity.Entity;
import com.zy.entity.Ifon;
import com.zy.entity.User;
import com.zy.net.Net;

import JYE.Jy;
import JYE.Kq;
import Recruitment.integral;
/**
 * ��ͼ�ࣺ���û�����
 * @author zz
 */
public class View {

	Scanner s;
	Net net;
	public View(){
		s=new Scanner(System.in);
		net=new Net();
	}
	
	public void login(){
		System.out.println("�������˺�");
		String username=s.next();
		System.out.println("����������");
		String password=s.next();
		//��������
		User u=new User();
		Entity e=new Entity();
		
		//С����װ�˺ţ�����
		u.setUsername(username);
		u.setPassword(password);
		//�����װ
		e.setObj(u);
		e.setFlag(0);
		
		e=net.connection(e);
		if(e!=null){
			if(e.isResult()){
				//��ת��������
//				if(((User)e.getObj()).getRole==0){
//				}
				System.out.println(e.getMessage());
				main();
			}else{
				System.out.println(e.getMessage());
				login();
			}
		}
	}

	public void main() {
		System.out.println("��ӭ����������ϵͳ");
		System.out.println("�鿴���ڰ���밴1");
		System.out.println("�鿴������Ϣ����밴2");
		System.out.println("�鿴��ҵ��Ϣ����밴3");
		System.out.println("�鿴֪ͨ����밴4");
		System.out.println("��ѡ��");
		int a=s.nextInt();
		Entity e=new Entity();
		if(a==1){
			e.setFlag(1);
			Kq edn = new Kq();
			edn.kqa();
			
			e=net.connection(e);
		}
		else if(a==2){
			e.setFlag(2);
			System.out.println("�����ѽ����������!");
			integral alxy = new integral();
			alxy.begin();
			e=net.connection(e);
			
		}
		else if(a==3){
			e.setFlag(3);
			Jy ahi = new Jy();
			ahi.main(null);
			e=net.connection(e);
		}
		else if(a==4){
			System.out.println("1 �γ�֪ͨ");
			System.out.println("2 ����֪ͨ");
			System.out.println("0 �����ϲ����");
			int w=s.nextInt();
			if(w==1){
				 e.setFlag(100);
			}
			if(w==2){
				 e.setFlag(101);
			}
			if(w==0){
				main();
			}
			
			e=net.connection(e);
			if(e!=null){
				if(e.isResult()){
					Ifon ifon=(Ifon) e.getObj();
					System.out.println(ifon.getTitle());
					System.out.println(ifon.getContent());
					System.out.println(new SimpleDateFormat("yyyy-yMM-dd").format(ifon.getDate()));
				}
			}	
		}
		else if(e!=null){
			
		   e.isResult();
				main();
			}
		System.out.println("�������˵��밴0");
		int n=s.nextInt();	
		if (n==0)
		{main();}}
	
	
	
	
	
}
