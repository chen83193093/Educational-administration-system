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
 * 视图类：与用户交互
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
		System.out.println("请输入账号");
		String username=s.next();
		System.out.println("请输入密码");
		String password=s.next();
		//创建袋子
		User u=new User();
		Entity e=new Entity();
		
		//小袋子装账号，密码
		u.setUsername(username);
		u.setPassword(password);
		//大袋子装
		e.setObj(u);
		e.setFlag(0);
		
		e=net.connection(e);
		if(e!=null){
			if(e.isResult()){
				//跳转到主界面
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
		System.out.println("欢迎进入教务管理系统");
		System.out.println("查看考勤板块请按1");
		System.out.println("查看招生信息板块请按2");
		System.out.println("查看就业信息板块请按3");
		System.out.println("查看通知板块请按4");
		System.out.println("请选择");
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
			System.out.println("您现已进入招生板块!");
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
			System.out.println("1 课程通知");
			System.out.println("2 个人通知");
			System.out.println("0 返回上层界面");
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
		System.out.println("返回主菜单请按0");
		int n=s.nextInt();	
		if (n==0)
		{main();}}
	
	
	
	
	
}
