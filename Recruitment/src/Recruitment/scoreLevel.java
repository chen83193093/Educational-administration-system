package Recruitment;

import java.util.Scanner;

public class scoreLevel extends integral {
	public void InfoScore()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("——————历届分数线——————");
		System.out.println("可查询2017、2016和2015年录取分数线");
		System.out.println("下面是2017年分数线，请输入2016或2015查询相应年份录取线");
			System.out.println("——————2017年长春建筑学院录取平均分数线——————");
			System.out.println("东四省：455  长江以南地区：429  西北地区：460  其他地区：461");
			System.out.println("如您想查询2016或2015年分数线，请输入相应年份，返回上层请按1，返回主界面请按2");
		int xy = in.nextInt();
		while((xy != 2016) && (xy != 2015) && (xy != 1) && (xy != 2) )
		{
			System.out.println("输入无效，请重新输入：");
			xy = in.nextInt();
		}
		if(xy == 2016)
		{
			System.out.println("——————2016年长春建筑学院录取平均分数线——————");
			System.out.println("东四省：480  长江以南地区：454  西北地区：422  其他地区：462");
			System.out.println("如您还想查询2015年分数线，请输入2015，返回上层请按1");
			xy = in.nextInt();
			while( (xy != 2015) && (xy != 1) )
			{
				System.out.println("输入无效，请重新输入：");
				xy = in.nextInt();
			}
		}
		if(xy == 2015)
		{
			System.out.println("——————2015年长春建筑学院录取平均分数线——————");
			System.out.println("东四省：429  长江以南地区：430  西北地区：444  其他地区：422");
			System.out.println("返回录取界面请按1，返回主界面请按2");
			xy = in.nextInt();
			while( (xy != 1) && (xy != 2) )
			{
				System.out.println("输入无效，请重新输入：");
				xy = in.nextInt();
			}
		}
			if(xy == 1)
			{
				InfoScore();
			}
			if(xy == 2)
			{
				begin();
			}

//		if(xy == 1)
//		{
//			InfoScore();
//		}
//		if(xy == 2)
//		{
//			begin();
//		}
		
	}
}
