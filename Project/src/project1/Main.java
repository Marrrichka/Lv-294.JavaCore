package project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		Day[] day = new Day[7];
		
		day[0] = new Day("��������", 2700, 2285, 200,   0,   0, 28,  69,   0, "��������, ���������, ����, ���");
		day[1] = new Day("³������",     0,  100,  34,  65,   0,  0,  55,  56, "�������");
		day[2] = new Day("������",       0,    0,  63,   0,   0, 28,   0,  52);
		day[3] = new Day("������",       0,    0, 118, 170, 476, 28, 120, 132);
		day[4] = new Day("�'������",     0,    0, 369, 107,   0,  0,   0,  70);
		day[5] = new Day("������",    2685,    0,  64,  56,   0, 28,  30,  10, "�� ����");
		day[6] = new Day("�����",       0,    0,  60,  24,   0, 28,   0,   0);
		
		double[] costs = new double[7];
		for(int i = 0; i < day.length; i++) {
		costs[0] += day[i].costUtilities(day);
		costs[1] += day[i].costFood(day);
		costs[2] += day[i].costHouse(day);
		costs[3] += day[i].costMedicine(day);
		costs[4] += day[i].costCigarettes(day);
		costs[5] += day[i].costEntertainment(day);
		costs[6] += day[i].costGoodies(day);
		}
		
		Map<String, Double> mapCosts = new HashMap<String, Double>();
		mapCosts.put("��������� �������", costs[0]);
		mapCosts.put("������� �� ����������", costs[1]);
		mapCosts.put("������� �� ����������� ������", costs[2]);
		mapCosts.put("������� �� ��������", costs[3]);
		mapCosts.put("������� �� ��������", costs[4]);
		mapCosts.put("������� �� ���������", costs[5]);
		mapCosts.put("������� �� ���������", costs[6]);
		
		int number = 0;
		while(number < 999) {
			++number;
			
		try {
		String fileName = "C:\\Users\\1\\eclipse-workspace\\Project\\src\\project1\\help.txt";
		FileReader fr = null;
		BufferedReader bb = null;
		fr = new FileReader(fileName);
		bb = new BufferedReader(fr);
		String help = null;
		
			System.out.println("������ �������");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String comand = br.readLine();
			
			switch(comand.toLowerCase()) {
			
			case "������� ��" : Day.costOfDay(day);
				break;
			case "������� ����" : Day.countCostsSum(day);
			     break;
			case "����� ����" : Day.countIncome(day);
			    break;
			case "������" : Day.countBalance(day);
				break;
			case "������� ���������" : System.out.println("������� �� ������ ����������� ������ = " + costs[0]);
				break;
			case "������� ����������" : System.out.println("������� �� ���������� = " + costs[1]);
				break;
			case "������� �����������" : System.out.println("������� �� ���������� ������ = " + costs[2]);
				break;
			case "������� ��������" : System.out.println("������� �� �������� = " + costs[3]);
				break;
			case "������� ��������" : System.out.println("������� �� �������� = " + costs[4]);
				break;
			case "������� ���������" : System.out.println("������� �� ��������� = " + costs[5]);
				break;
			case "������� ���������" : System.out.println("������� �� ��������� = " + costs[6]);
				break;
			case "��������" : Day.showComments(day);
				break;
			case "������� �������" : 
				for (Iterator i = mapCosts.entrySet().iterator(); i.hasNext();) {
					   Map.Entry entry = (Map.Entry) i.next();
					   System.out.println(entry.getKey() + " = " + entry.getValue());
					};
					break;
			case "������� ���������" : Day.sort(day);
				break;
			case "������� ������" : Day.average(costs);
				break;
			case "������� ������ ��� �����������" : Day.averageWithoutUtilities(costs);
				break;
			case "��������" : while((help = bb.readLine()) != null) {
				System.out.println(help);
			}
			
			bb.close();
			break;
			case "��" : System.out.println(Arrays.toString(day));
			break;
			default : System.out.println("������ ������� ��������. ��� �������� ��� ����� �������, ������ \"��������\".");
			break;
			}
		
		} catch(IOException e) {
				System.err.println(e.getMessage());
			}
		
		}
	}
}