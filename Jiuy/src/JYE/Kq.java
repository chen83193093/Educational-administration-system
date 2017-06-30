package JYE;

import java.util.Scanner;

import com.zy.view.View;

public class Kq extends Jye{
	public void kqa() {
		System.out.println("欢迎来到考勤模块");
		System.out.println("查询上课打卡请按1 ");
		System.out.println("查询下课打卡请按2 ");
		System.out.println("查询请假请按3 ");
		System.out.println("查询审批请按4 ");
		System.out.println("返回主菜单请按5 ");
		System.out.println("请输入：");
		Scanner sa;
		sa=new Scanner(System.in);
		while(true)
		{
		int ba=sa.nextInt();	
		switch(ba) {
		case 1: System.out.println("上课打卡");
		System.out.println("今天是2017年6月23日星期五13：28");
		System.out.println("第一节上课实到50人，缺席一人");
		Tk();
		break;
		case 2 :System.out.println("下课打卡");
		System.out.println("今天是2017年6月23日星期五16：30");
		System.out.println("第二节课李明早退5分钟");
		Tk();
		break;
		case 3:System.out.println("请假");
		System.out.println("今天是2017年6月21日星期三13：30");
		System.out.println("第三节课刘洋因事请假");
		Tk();
		break;
		case 4:System.out.println("审批");
		System.out.println("今天是2017年6月21日星期三12：30");
		System.out.println("李丽老师批准了刘洋的请假");
		Tk();
		break;
		case 5:
		View aln = new View();
		aln.main();

	}
}}
	public void Tk(){
	    System.out.println("返回主菜单请按1，返回上一界面请输入其他数字");
	    {
	    	int t = sa.nextInt();
	    	if(t == 1)
	    	{
	    		View aln = new View();
	    		aln.main();
	        }
	    	else
	    	{
	    		kqa();
	    	}
	    	}
	}	}
