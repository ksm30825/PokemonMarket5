package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.vo.User;

public class UserManager {
	
	public UserManager() {
		
	}
	
	public void userItemSet() {
		
	}
	
	public void firstSelectPokemon(User user) { 
		//ù ���ϸ� �����ϴ� �޼ҵ�
	}
	
	public int getUserGold() {
		//userDao�� �������մ� User��ü���� gold�� ���Ϲ���
		
		return User.getuGold();
	}
	public void setUser(User user) {

	}

	public void setUserGold(int gold) {
		User.setuGold(gold);
	}
	public String viewUserName() {
		return User.getuName();
	}
	public String viewUserTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("hh�� mm��");
		
		long diff = User.getuDate().getTime() - new Date().getTime();
		
		
		String time = sdf.format(diff);
		return time;
		
	}
	public String viewCreateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E���� hh�� mm��");
		String time = sdf.format(User.getuDate());
		return time;
	}
}
