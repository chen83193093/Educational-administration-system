package JYE;
import java.util.Scanner;

import com.zy.view.View;


public class Jye {
	Scanner sa = new Scanner(System.in);
	public void Jyea(){
		System.out.println("��ӭ������ҵ��Ϣģ��");
		System.out.println("��ѯ��ҵ���밴1 ");
		System.out.println("��ѯ��Ƹ��Ϣ�밴2  ");
		System.out.println("��ѯ��������밴3  ");
		System.out.println("�������˵��밴4");
	
	
	
	while(true)
	{
	int ba=sa.nextInt();
	switch(ba) {
	case 1: System.out.println("��������������ҵ����ҵ�ʡ�����������");
	System.out.println("2017���ҵ����ҵ��Ϊ80%��������̱�ҵ����ҵ��Ϊ77%��");
	System.out.println("2016���ҵ����ҵ��Ϊ70%��������̱�ҵ����ҵ��Ϊ66%��");
	System.out.println("2015���ҵ����ҵ��Ϊ70%��������̱�ҵ����ҵ��Ϊ66%��");
	System.out.println("2014���ҵ����ҵ��Ϊ60%��������̱�ҵ����ҵ��Ϊ50%��");
	System.out.println("2013���ҵ����ҵ��Ϊ95%��������̱�ҵ����ҵ��Ϊ55%��");
	Ts();
	break;
	case 2:
	System.out.println("2017��Ƹ��Ϣ��");
	System.out.println("[ȫ��]�˱�������2017��7��1�����Ŵ�¥��¥����У����Ӧ����������Ƹ��");
	System.out.println("[����|�Ϻ�|����|����]������̼��Ź�˾��2017��7��1�����Ŵ�¥��¥����У����Ӧ����������Ƹ�� ");
	System.out.println("[����]���������ѹ���زٶ������������ι�˾��2017��7��1�����Ŵ�¥һ¥����У����Ӧ����������Ƹ��");
	System.out.println("[�ӱ�]��ɽ��Ԫ���ֺ����豸���޹�˾��2017��7��1�����Ŵ�¥��¥����У����Ӧ����������Ƹ�� ");
	System.out.println("�������ͬѧ����ü����μ�����");
	Ts();
	break;
	case 3:
	System.out.println("������飺");
	System.out.println("�������");
	System.out.println("�Ļ������ҵ����");
	System.out.println("�Ϻ���˼���ӹ������޹�˾");
	System.out.println("�½���̩��ѧʥ����Դ�ɷ����޹�˾");
	System.out.println("�����");
	System.out.println("��Ѷ�Ƽ��ɷ����޹�˾");
	System.out.println("ɽ���˳��ư漯�Źɷ����޹�˾");
	System.out.println("���Ͻ�Ϊ���ֺ�����飬ȫ������뿴ѧУ�ٷ���վ");
	Ts();
	break;
	case 4:
		View aln = new View();
		aln.main();
	}
	

	}}
	public void Ts(){
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
	    		Jyea();
	    	}
	    	}
	}	
}
