package Recruitment;

import java.io.Serializable;
import java.util.Scanner;

import com.zy.view.View;

public class integral{
	public void begin()
	{
		System.out.println("��ѡ����Ҫ�ۿ��İ�飺1.����ָ�� 2. ����¼ȡ������ 3.�������� 4.�����绰");
		System.out.println("��Ҫ�������˵����밴0!");
		Scanner in =new Scanner(System.in);
		int xm = in.nextInt();
		if(xm == 0)
		{
			View ac = new View();
			ac.main();
		}
		if(xm == 1)
		{
			recruit ak = new recruit();
			ak.InfoSchool();
			begin();
		}
		if(xm == 2)
		{
			scoreLevel bk = new scoreLevel();
			bk.InfoScore();
			begin();
		}
		if(xm == 3)
		{
			volumeStu ck = new volumeStu();
			ck.InfoStu();
			begin();
		}
		if(xm == 4)
		{
			telephone cp = new telephone();
			cp.Tel();
			begin();
		}
	}
}


