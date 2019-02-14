package controller;

import java.util.Random;

import javax.swing.JTextArea;

import model.dao.PokemonDao;
import model.vo.Pokemon;
import model.vo.User;
import view.PInfoPage;

public class BattleManager {


	private static PokemonDao pd = new PokemonDao();
	private static PInfoPage pip;


	//���� ���ϸ� �����ִ� �κ�
	public static void showP(PInfoPage pip) {
		BattleManager.pip = pip;

		JTextArea[] jta = new JTextArea[4];

		for(int i=0; i<User.getUp_list().size(); i++) {
			jta[i] = new JTextArea();
			jta[i].setText("\t���ϸ� �̸� : "+ User.getUp_list().get(i).getpName() + "\n"
					+"\t��    �� : " + User.getUp_list().get(i).getpLevel() + "\n"
					+"\t�� �� �� : " + User.getUp_list().get(i).getGrade() + "\n"
					+"\t�� �� �� : " + User.getUp_list().get(i).getpSpeed() + "\n"
					+"\tü    ��  : " +User.getUp_list().get(i).getpHp() + "\n");
			jta[i].setEditable(false);
		}

		pip.setpInfoText(jta);


	}

	//���ϸ� ���� ���
	public static void randomP() {


		int randomIndex = new Random().nextInt(4)+1;
		int randomLevel = new Random().nextInt(10)+1;
		Pokemon poke = pd.getpList().get(randomIndex);


		//���ϸ� �Ӽ� ����
		poke.setpLevel(randomLevel);
		poke.setExp(randomLevel);
		poke.setpHp(randomLevel);
		poke.setpSpeed(randomLevel);
		poke.setExp(randomLevel);

		for(int i=0; i<4; i++) {
		}

	}







	//���ϸ� ĳġ ���
	public static void catchP() {

		for(int i=0; i<User.getUi_list().size(); i++) {
			if(User.getUi_list().get(i).getiType() == 0) {

			}
		}
	}

	public static void selectS() {

	}



}