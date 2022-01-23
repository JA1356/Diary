import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestProject extends JFrame implements ActionListener{
	
	static String[] arr = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	
	static JButton[] btn = new JButton[arr.length];
	
	static TestProject test;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test = new TestProject();
		
		JFrame frm = new JFrame("동적 레이아웃 생성");
		
		frm.setSize(500,500);
		
		frm.setLocationRelativeTo(null);
		
		//TODO 부모 프레임을 닫았을 때 메모리에서 제거되도록 설정
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		//TODO 부모 레이아웃 설정
		frm.getContentPane().setLayout(null);
				
		//TODO 자식 레이아웃 [버튼] 생성
		JPanel grid_panel = new JPanel();
		grid_panel.setLayout(new GridLayout(4, 4, 0, 0)); //테이블 형식 - 행, 열, 가로 여백, 세로 여백	
		
		for(int idx=0; idx<arr.length; idx++) {
			btn[idx] = new JButton(arr[idx]);
			btn[idx].setFont(new Font("맑은 고딕", 0, 20)); //TODO 폰트 정의
			btn[idx].setBackground(Color.GRAY); //TODO 백그라운드 색상 정의
			btn[idx].setForeground(Color.WHITE); //TODO 텍스트 색상 정의
			btn[idx].addActionListener(test); //TODO 클릭 이벤트 추가
			
			grid_panel.add(btn[idx]); //TODO JPanel에 버튼 추가
			
		}
		grid_panel.setBounds(0, 100, 500, 350); //setBounds(가로위치, 세로위치, 가로길이, 세로길이);
		 
		//TODO 부모 프레임에다가 자식 컴포넌트 추가
		
		frm.getContentPane().add(grid_panel);
		
		//TODO 부모 프레임이 보이도록 설정
		frm.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e != null) {
			
		}
		else {
			System.out.print("프레임 생성");
		}
	}

}

