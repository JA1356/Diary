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
		
		JFrame frm = new JFrame("���� ���̾ƿ� ����");
		
		frm.setSize(500,500);
		
		frm.setLocationRelativeTo(null);
		
		//TODO �θ� �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		//TODO �θ� ���̾ƿ� ����
		frm.getContentPane().setLayout(null);
				
		//TODO �ڽ� ���̾ƿ� [��ư] ����
		JPanel grid_panel = new JPanel();
		grid_panel.setLayout(new GridLayout(4, 4, 0, 0)); //���̺� ���� - ��, ��, ���� ����, ���� ����	
		
		for(int idx=0; idx<arr.length; idx++) {
			btn[idx] = new JButton(arr[idx]);
			btn[idx].setFont(new Font("���� ���", 0, 20)); //TODO ��Ʈ ����
			btn[idx].setBackground(Color.GRAY); //TODO ��׶��� ���� ����
			btn[idx].setForeground(Color.WHITE); //TODO �ؽ�Ʈ ���� ����
			btn[idx].addActionListener(test); //TODO Ŭ�� �̺�Ʈ �߰�
			
			grid_panel.add(btn[idx]); //TODO JPanel�� ��ư �߰�
			
		}
		grid_panel.setBounds(0, 100, 500, 350); //setBounds(������ġ, ������ġ, ���α���, ���α���);
		 
		//TODO �θ� �����ӿ��ٰ� �ڽ� ������Ʈ �߰�
		
		frm.getContentPane().add(grid_panel);
		
		//TODO �θ� �������� ���̵��� ����
		frm.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e != null) {
			
		}
		else {
			System.out.print("������ ����");
		}
	}

}

