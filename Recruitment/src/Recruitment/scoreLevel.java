package Recruitment;

import java.util.Scanner;

public class scoreLevel extends integral {
	public void InfoScore()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("��������������������ߡ�����������");
		System.out.println("�ɲ�ѯ2017��2016��2015��¼ȡ������");
		System.out.println("������2017������ߣ�������2016��2015��ѯ��Ӧ���¼ȡ��");
			System.out.println("������������2017�곤������ѧԺ¼ȡƽ�������ߡ�����������");
			System.out.println("����ʡ��455  �������ϵ�����429  ����������460  ����������461");
			System.out.println("�������ѯ2016��2015������ߣ���������Ӧ��ݣ������ϲ��밴1�������������밴2");
		int xy = in.nextInt();
		while((xy != 2016) && (xy != 2015) && (xy != 1) && (xy != 2) )
		{
			System.out.println("������Ч�����������룺");
			xy = in.nextInt();
		}
		if(xy == 2016)
		{
			System.out.println("������������2016�곤������ѧԺ¼ȡƽ�������ߡ�����������");
			System.out.println("����ʡ��480  �������ϵ�����454  ����������422  ����������462");
			System.out.println("���������ѯ2015������ߣ�������2015�������ϲ��밴1");
			xy = in.nextInt();
			while( (xy != 2015) && (xy != 1) )
			{
				System.out.println("������Ч�����������룺");
				xy = in.nextInt();
			}
		}
		if(xy == 2015)
		{
			System.out.println("������������2015�곤������ѧԺ¼ȡƽ�������ߡ�����������");
			System.out.println("����ʡ��429  �������ϵ�����430  ����������444  ����������422");
			System.out.println("����¼ȡ�����밴1�������������밴2");
			xy = in.nextInt();
			while( (xy != 1) && (xy != 2) )
			{
				System.out.println("������Ч�����������룺");
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
