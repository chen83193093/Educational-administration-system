package com.zy.model;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import com.zy.entity.Entity;
import com.zy.entity.Ifon;
import com.zy.entity.User;

import JYE.Jy;
import JYE.Kq;
import Recruitment.*;


public class Model {

	public Entity doCmd(Entity e) throws IOException {
		int flag = e.getFlag();
		if (flag == 0) {// 登录
			User u = (User) e.getObj();
			if (u.getUsername().equals("zz") && u.getPassword().equals("qiao")) {
				e.setMessage("登录成功");
				e.setResult(true);
				e.setObj(u);
			} else {
				e.setMessage("登录失败：账号/密码错误");
				e.setResult(false);
			}
		}
		else if (flag == 1) {


		}// 考勤管理
		else if (flag == 2) {
			
		}// 招生信息管理
		else if (flag == 3) {
			
		}// 就业信息管理
		else if (flag == 100) {

			FileInputStream fis = null;
			try {
				fis = new FileInputStream("d:\\qiao.txt");
				byte[] b = new byte[1024];
				int len = -1;
				StringBuffer sb = new StringBuffer();
				while ((len = fis.read(b)) != -1) {
					sb.append(new String(b, 0, len));
				}

				Ifon ifon = new Ifon();
				ifon.setTitle("2015-2016学年第二学期尔雅慕课选修课选课开课通知  ");
				ifon.setContent(sb.toString());
				ifon.setDate(new Date());
				e.setObj(ifon);
				e.setResult(true);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} 
		else if (flag == 101) {

			FileInputStream fis = null;
			try {
				fis = new FileInputStream("d:\\hao.txt");
				byte[] b = new byte[1024];
				int len = -1;
				StringBuffer sb = new StringBuffer();
				while ((len = fis.read(b)) != -1) {
					sb.append(new String(b, 0, len));
				}

				Ifon ifon = new Ifon();
				ifon.setTitle("关于赵XX同学申请转学的情况公示   ");
				ifon.setContent(sb.toString());
				ifon.setDate(new Date());
				e.setObj(ifon);
				e.setResult(true);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} 

		// 通知

		return e;

	}

}
