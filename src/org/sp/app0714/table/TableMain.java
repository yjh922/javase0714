package org.sp.app0714.table;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//자바의 GUI 컴포넌트 중 표형태의 레코드를 출력하기에 가장 최적화된 컴포넌트인 JTable을 이용해 보자
public class TableMain extends JFrame{
	JTable table;
	JScrollPane scroll;
	String[][] data= {
			{"1","batman","배트맨","010"},
			{"2","xman","엑스맨","016"},
			{"3","spiderman","스파이더맨","011"}
	};
	String[] column= {"member_idx","id","name","phone"};
	public TableMain() {
		table = new JTable(data,column);
		scroll = new JScrollPane(table);
		
		
		add(scroll);
		
		setVisible(true);
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new TableMain();
	}
}
