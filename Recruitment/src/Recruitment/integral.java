package Recruitment;

import java.io.Serializable;
import java.util.Scanner;

import com.zy.view.View;

public class integral{
	public void begin()
	{
		System.out.println("请选择您要观看的板块：1.招生指南 2. 历届录取分数线 3.招生人数 4.招生电话");
		System.out.println("若要返回主菜单，请按0!");
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


