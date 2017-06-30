package Recruitment;

import java.io.Serializable;
import java.util.Scanner;

public class recruit extends integral{
	Scanner in = new Scanner(System.in);
	
		public void InfoSchool()
		{
		    	System.out.println("——————招生指南——————");
				System.out.println("长春建筑学院欢迎您的到来！");
				System.out.println("Welcome to Changchun Construction College！");
				System.out.println("我们的校园优美，环境宜人。学校规模庞大，拥有全国共2个校区，分别位于奢岭高校园区和文化创意产业园区。");
				System.out.println("如果您想了解各学院，请按1，返回主菜单请按输入其他数字。");
				int xm = in.nextInt();
			   if(xm == 1)
				{
					System.out.println("长春建筑学院共有8所分院，目前这里只有电气信息学院信息，其他分院信息正在建设中...");
					System.out.println("电气信息学院始建于2003年，距今已有14年历史！");
					System.out.println("电气信息学院目前设有自动化、计算机科学与技术 、电子信息工程、通信工程、信息安全和物联网工程、电气工程及其自动化等7个专业教研室");
					System.out.println("长春建筑学院欢迎您的到来！");
					System.out.println("如果您想返回上层界面，请按1，返回主界面请输入其他数字！");
					xm = in.nextInt();
					if(xm == 1)
					{
						InfoSchool();
					}
					else 
					{
						begin();
					}
				}
			   else
					{
						begin();
					}
				}
			
				
		}; //School Information
	

