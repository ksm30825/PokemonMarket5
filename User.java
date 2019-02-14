package model.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
	
	private static String uName;
	private static Date uDate;
	private static int uGold;
	private static List<Pokemon> up_list;
	private static List<Item> ui_list;
	private static List<Pokemon> tp_list;
	
	public User(String name) {
		User.uName = name;
		User.uDate = new Date();
		User.uGold = 3000;
		User.ui_list = new ArrayList<Item>();
		User.up_list = new ArrayList<Pokemon>(4);
		User.tp_list = new ArrayList<Pokemon>();
	}
	
	public static String getuName() {
		return uName;
	}
	public static void setuName(String uName) {
		User.uName = uName;
	}
	public static Date getuDate() {
		return uDate;
	}
	public static void setuDate(Date uDate) {
		User.uDate = uDate;
	}
	public static int getuGold() {
		return uGold;
	}
	public static void setuGold(int uGold) {
		User.uGold = uGold;
	}
	public static List<Pokemon> getUp_list() {
		return up_list;
	}
	public static void setUp_list(List<Pokemon> up_list) {
		User.up_list = up_list;
	}
	public static List<Item> getUi_list() {
		return ui_list;
	}
	public static void setUi_list(List<Item> ui_list) {
		User.ui_list = ui_list;
	}
	public static List<Pokemon> getTp_list() {
		return tp_list;
	}
	public static void setTp_list(List<Pokemon> tp_list) {
		User.tp_list = tp_list;
	}
	
	
	

}
