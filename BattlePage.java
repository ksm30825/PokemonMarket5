package view;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class BattlePage extends JPanel {
	private JPanel bp;
	private MainFrame mf;
	private Map m;
	private BattleSkillPage bsp;
	private PInfoPage pip;
	
	//��ư �̹��� �ø���
	private Image fightButtonImage = new ImageIcon("images/�ο�ٹ�ư.png").getImage();
	private Image changeButtonImage = new ImageIcon("images/���ϸ��ư.png").getImage();
	private Image invenButtonImage = new ImageIcon("images/�����ư.png").getImage();
	private Image runButtonImage = new ImageIcon("images/�������ٹ�ư.png").getImage();

	//�̹��� ��ưȭ
	private JButton fightButton = new JButton(new ImageIcon(fightButtonImage));
	private JButton changeButton = new JButton(new ImageIcon(changeButtonImage));
	private JButton invenButton = new JButton(new ImageIcon(invenButtonImage));
	private JButton runButton = new JButton(new ImageIcon(runButtonImage));
	
	//Graphics
	//���� ��� �̹���
	Image background = Toolkit.getDefaultToolkit().getImage("images/background1.PNG");
	//�� ���ϸ� �̹���
	Image mypokemon = Toolkit.getDefaultToolkit().getImage("images/pikachu.PNG");
	//�� ���ϸ� �̹���
	Image enpokemon =  Toolkit.getDefaultToolkit().getImage("images/kkobugi.PNG");


	public BattlePage(MainFrame mf, JPanel panel) {
		this.bp = this;
		this.mf = mf;
		this.m = (Map)panel;
		this.bsp = new BattleSkillPage(mf, this);
		
		//��ư�� ����� ��ġ�ϱ� ����
		bp.setLayout(null);
		//this.pip = new PInfoPage(mf, this);
		
		
		fightButton.setBounds(180, 500, 300, 80);
		this.add(fightButton);
		settingButton(fightButton);
		fightButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				bp.setVisible(false);
				bsp.setVisible(true);
				mf.add(bsp);
			}
		});
		this.add(fightButton);

		
		changeButton.setBounds(550, 500, 300, 80);
		settingButton(changeButton);
		changeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				JButton cb = new JButton("���ϸ� ���");
				bp.setVisible(false);
				mf.add(cb);
			}
		});
		this.add(changeButton);

		
		
		invenButton.setBounds(180, 600, 300, 80);
		settingButton(invenButton);
		invenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				JButton inven = new JButton("���� ���");
				bp.setVisible(false);
				mf.add(inven);
			}
		});
		this.add(invenButton);
		
		runButton.setBounds(550, 600, 300, 80);
		settingButton(runButton);
		runButton.setBorderPainted(false);
		runButton.setFocusPainted(false);
		runButton.setContentAreaFilled(false);
		runButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				mf.remove(bp);
				m.setVisible(true);
				mf.requestFocus();
				((Map) m).start();
			}
		});
		this.add(runButton);

		
	}

	//�� ��� ���, ���ϸ� �ҷ����� �׷��Ƚ�
	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, 1024, 768, this);
		g.drawImage(mypokemon, 210, 150, 250, 250, this);
		g.drawImage(enpokemon, 570, 150, 250, 250, this);
	}

	
	public void settingButton(JButton jb) {
		jb.setBorderPainted(false);
		jb.setFocusPainted(false);
		jb.setContentAreaFilled(false);
	}

	
}

