package JYE;
import java.util.Scanner;

import com.zy.view.View;


public class Jye {
	Scanner sa = new Scanner(System.in);
	public void Jyea(){
		System.out.println("欢迎来到就业信息模块");
		System.out.println("查询就业率请按1 ");
		System.out.println("查询招聘信息请按2  ");
		System.out.println("查询合作伙伴请按3  ");
		System.out.println("返回主菜单请按4");
	
	
	
	while(true)
	{
	int ba=sa.nextInt();
	switch(ba) {
	case 1: System.out.println("——————毕业生就业率——————");
	System.out.println("2017年毕业生就业率为80%；软件工程毕业生就业率为77%。");
	System.out.println("2016年毕业生就业率为70%；软件工程毕业生就业率为66%。");
	System.out.println("2015年毕业生就业率为70%；软件工程毕业生就业率为66%。");
	System.out.println("2014年毕业生就业率为60%；软件工程毕业生就业率为50%。");
	System.out.println("2013年毕业生就业率为95%，软件工程毕业生就业率为55%。");
	Ts();
	break;
	case 2:
	System.out.println("2017招聘信息：");
	System.out.println("[全国]人本集团于2017年7月1日社团大楼三楼面向本校所有应届生进行招聘！");
	System.out.println("[北京|上海|厦门|其它]国网许继集团公司于2017年7月1日社团大楼三楼面向本校所有应届生进行招聘！ ");
	System.out.println("[西安]西安西电高压开关操动机构有限责任公司于2017年7月1日社团大楼一楼面向本校所有应届生进行招聘！");
	System.out.println("[河北]唐山开元特种焊接设备有限公司于2017年7月1日社团大楼二楼面向本校所有应届生进行招聘！ ");
	System.out.println("有意向的同学请带好简历参加面试");
	Ts();
	break;
	case 3:
	System.out.println("合作伙伴：");
	System.out.println("中软国际");
	System.out.println("文化创意产业基地");
	System.out.println("上海三思电子工程有限公司");
	System.out.println("新疆中泰化学圣雄能源股份有限公司");
	System.out.println("恒大集团");
	System.out.println("易讯科技股份有限公司");
	System.out.println("山西运城制版集团股份有限公司");
	System.out.println("以上仅为部分合作伙伴，全部伙伴请看学校官方网站");
	Ts();
	break;
	case 4:
		View aln = new View();
		aln.main();
	}
	

	}}
	public void Ts(){
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
	    		Jyea();
	    	}
	    	}
	}	
}
