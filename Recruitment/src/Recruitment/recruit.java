package Recruitment;

import java.io.Serializable;
import java.util.Scanner;

public class recruit extends integral{
	Scanner in = new Scanner(System.in);
	
		public void InfoSchool()
		{
		    	System.out.println("����������������ָ�ϡ�����������");
				System.out.println("��������ѧԺ��ӭ���ĵ�����");
				System.out.println("Welcome to Changchun Construction College��");
				System.out.println("���ǵ�У԰�������������ˡ�ѧУ��ģ�Ӵ�ӵ��ȫ����2��У�����ֱ�λ�������У԰�����Ļ������ҵ԰����");
				System.out.println("��������˽��ѧԺ���밴1���������˵��밴�����������֡�");
				int xm = in.nextInt();
			   if(xm == 1)
				{
					System.out.println("��������ѧԺ����8����Ժ��Ŀǰ����ֻ�е�����ϢѧԺ��Ϣ��������Ժ��Ϣ���ڽ�����...");
					System.out.println("������ϢѧԺʼ����2003�꣬�������14����ʷ��");
					System.out.println("������ϢѧԺĿǰ�����Զ������������ѧ�뼼�� ��������Ϣ���̡�ͨ�Ź��̡���Ϣ��ȫ�����������̡��������̼����Զ�����7��רҵ������");
					System.out.println("��������ѧԺ��ӭ���ĵ�����");
					System.out.println("������뷵���ϲ���棬�밴1�������������������������֣�");
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
	

