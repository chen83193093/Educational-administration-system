package JYE;

import java.util.Scanner;

import com.zy.view.View;

public class Kq extends Jye{
	public void kqa() {
		System.out.println("��ӭ��������ģ��");
		System.out.println("��ѯ�Ͽδ��밴1 ");
		System.out.println("��ѯ�¿δ��밴2 ");
		System.out.println("��ѯ����밴3 ");
		System.out.println("��ѯ�����밴4 ");
		System.out.println("�������˵��밴5 ");
		System.out.println("�����룺");
		Scanner sa;
		sa=new Scanner(System.in);
		while(true)
		{
		int ba=sa.nextInt();	
		switch(ba) {
		case 1: System.out.println("�Ͽδ�");
		System.out.println("������2017��6��23��������13��28");
		System.out.println("��һ���Ͽ�ʵ��50�ˣ�ȱϯһ��");
		Tk();
		break;
		case 2 :System.out.println("�¿δ�");
		System.out.println("������2017��6��23��������16��30");
		System.out.println("�ڶ��ڿ���������5����");
		Tk();
		break;
		case 3:System.out.println("���");
		System.out.println("������2017��6��21��������13��30");
		System.out.println("�����ڿ������������");
		Tk();
		break;
		case 4:System.out.println("����");
		System.out.println("������2017��6��21��������12��30");
		System.out.println("������ʦ��׼����������");
		Tk();
		break;
		case 5:
		View aln = new View();
		aln.main();

	}
}}
	public void Tk(){
	    System.out.println("�������˵��밴1��������һ������������������");
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
