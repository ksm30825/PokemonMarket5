package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SavePage extends JPanel {
	private JPanel sp;
	private MainFrame mf;
	private UserMenuPage ump;
	
	private JButton saveButton = new JButton(new ImageIcon("images/userMenuImages/saveButtonBasic.PNG"));
	private JButton saveBackButton = new JButton(new ImageIcon("images/userMenuImages/saveBackButtonBasic.PNG"));
	
	public SavePage(MainFrame mf,UserMenuPage ump) {
		this.mf = mf;
		this.sp = this;
		this.ump = ump;
		sp.setOpaque(false);
		sp.setBounds(0, 0, 1024, 768);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		
		mf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == UserMenuPage.ESC) {
					mf.remove(sp);
					sp.setVisible(false);
				}
			}
		});
	
		JLabel label = new JLabel();
		label.setText("���� ������");
		label.setBounds(450, 20, 200, 40);
		
		saveButton.setBounds(305, 170, 430, 130);
		saveButton.setBorderPainted(false);
		saveButton.setFocusPainted(false);
		saveButton.setContentAreaFilled(false);
		//�ڷΰ��� ��ư
		saveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				saveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				saveButton.setIcon(new ImageIcon("images/userMenuImages/saveButtonEntered.PNG"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				saveButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				saveButton.setIcon(new ImageIcon("images/userMenuImages/saveButtonBasic.PNG"));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
				//���� ��ư
				//Ŭ���� �̺�Ʈ

			}
		});
		
		saveBackButton.setBounds(315, 370, 430, 130);
		saveBackButton.setBorderPainted(false);
		saveBackButton.setFocusPainted(false);
		saveBackButton.setContentAreaFilled(false);
		//�ڷΰ��� ��ư
		saveBackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				saveBackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				saveBackButton.setIcon(new ImageIcon("images/userMenuImages/saveBackButtonEntered.PNG"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				saveBackButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				saveBackButton.setIcon(new ImageIcon("images/userMenuImages/saveBackButtonBasic.PNG"));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				saveBackButton.setIcon(new ImageIcon("images/userMenuImages/saveBackButtonBasic.PNG"));
				mf.remove(sp);
				ump.setVisible(true);
				mf.requestFocus();
			}
		});
		
		this.add(label);
		this.add(saveBackButton);
		this.add(saveButton);

	}

	
}
