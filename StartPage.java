package view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.UserManager;
import model.vo.User;

public class StartPage extends JPanel{

	private MainFrame mf;
	private JPanel stp;
	
	public StartPage(MainFrame mf) {
		this.mf = mf;
		this.stp = this;
		stp.setOpaque(false);
	      stp.setBounds(0, 0, 1024, 768);
	      this.setLayout(null);
	      this.setBackground(Color.WHITE);
	      
	      JButton startbtn = new JButton("���� ����");
	      JButton nextPage = new JButton("���� ����");
	      startbtn.setSize(200,200);
	      startbtn.setLocation(500,360);
	      
	      nextPage.setSize(200,200);
	      nextPage.setLocation(300,200);

	      
	      startbtn.addMouseListener(new MouseAdapter() {
	         
	         @Override
	         public void mousePressed(MouseEvent e) {
	            
	            String result = JOptionPane.showInputDialog("������ ������ �̸��� �����ּ���!");
	            new User(result);
	            
	            /*mf.remove(stp);
	            m.setVisible(true);
	            mf.requestFocus();
	            ((Map) m).start();*/

	         }
	      });
	         nextPage.addMouseListener(new MouseAdapter() {
	        	 public void mousePressed(MouseEvent e) {
	        		 stp.setVisible(false);
	        		 mf.remove(stp);
	        		 mf.add(new Map(mf));
	        		 mf.requestFocus();
	        		
	        		
	        	 }
	         });
	     
	      
	         stp.add(startbtn);
		      stp.add(nextPage);
		      mf.add(this);
	      
	   }
		
	}
	

