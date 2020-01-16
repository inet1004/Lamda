package co.micol.lamda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionTest extends JFrame {
	
	JButton btn;

	public ActionTest() {
		this.setTitle("frame test");
		this.setSize(300, 200);
		int var=10;

		// 버튼 추가
		btn = new JButton("눌러줘");
//		btn.addActionListener(new ActionHandler());  //람다식으로 표현 필요
		btn.addActionListener((arg0) -> {
			System.out.println("버튼 클릭");
			//람다식 안에서 this는 람다식을 실행하는 outer클래스
			this.setTitle("클릭");  //호출한 클래스말함 , 클릭시 창의 타이틀리 바뀜
			this.btn.setText("클릭됨...");
			System.out.println(var);
		});

		this.getContentPane().add(btn);
		this.setVisible(true);

		this.setVisible(true);

	}

	public static void main(String[] args) {
		new ActionTest();
	}

//	class ActionHandler implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent arg0) {
//			System.out.println("버튼 클릭");
//		}

}
