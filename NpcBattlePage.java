package view;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NpcBattlePage extends JPanel {
	private JPanel nbp;
	private MainFrame mf;
	private Map m;
	private BattleSkillPage bsp;
	private PInfoPage pip;
	
	//��ư �̹��� �ø���
	private Image fightButtonImage = new ImageIcon("images/�ο�ٹ�ư.png").getImage();
	private Image changeButtonImage = new ImageIcon("images/���ϸ��ư.png").getImage();
	
	private Image runButtonImage = new ImageIcon("images/�������ٹ�ư.png").getImage();

	//�̹��� ��ưȭ
	private JButton fightButton = new JButton(new ImageIcon(fightButtonImage));
	private JButton changeButton = new JButton(new ImageIcon(changeButtonImage));
	
	private JButton runButton = new JButton(new ImageIcon(runButtonImage));
	
	//Graphics
	//���� ��� �̹���
	Image background = Toolkit.getDefaultToolkit().getImage("images/background1.PNG");
	//�� ���ϸ� �̹���
	Image mypokemon = Toolkit.getDefaultToolkit().getImage("images/pikachu.PNG");
	
	
	//�� ���ϸ� �̹���
	Image enpokemon =  Toolkit.getDefaultToolkit().getImage("images/kkobugi.PNG");


	public NpcBattlePage(MainFrame mf, JPanel panel) {
		this.nbp = this;
		this.mf = mf;
		this.m = (Map)panel;
		this.bsp = new BattleSkillPage(mf, this);
		
		//��ư�� ����� ��ġ�ϱ� ����
		nbp.setLayout(null);
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
				nbp.setVisible(false);
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
				nbp.setVisible(false);
				mf.add(cb);
			}
		});
		this.add(changeButton);


		
		//���߿� ���� �� run ��ư
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
				mf.remove(nbp);
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

