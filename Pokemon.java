package model.vo;

import java.awt.Image;
import java.util.ArrayList;

public class Pokemon {
	
	private String pName;	//���ϸ� �̸�
	private int pNo;		//���ϸ� ��ȣ
	private int pLevel;		//���ϸ� ����
	private int pType;		//���ϸ� Ÿ�� -> 0 : �븻 / 1 : �� / 2 : �� / 3 : Ǯ
	private int pHp;		//���ϸ� HP
	private int pSpeed;		//���ϸ� ���ǵ�
	private Item pItem;		//���ϸ� ������
	private boolean pEvoType;	//���ϸ� ��ȭ ��� -> true : ��ȭ�� �� / false : ������
	private Image pImg;		//���ϸ� �̹���
	private int grade;		//���ϸ� ��� -> 0 : �� / 1 : �� / 2 : ��
	
	private int exp;		//���� ����ġ
	private int pMaxExp;	//�ִ� ����ġ, �ƽ��� �����ϸ� ������
	private int setExp;		//������ ��� �Ǵ� ����ġ
	
	private ArrayList<Skill> pSkill;		//���ϸ� ��ų
	
	
	public Pokemon() {}
	
	public Pokemon(String pName, int pNo, int pType, boolean pEvoType, Image pImg, int grade) {
		this.pName =pName;
		this.pNo =pNo;
		this.pType = pType;
		this.pEvoType = pEvoType;
		this.pImg = pImg;
		this.grade = grade;
		
		
	}
	
	public Pokemon(String pName, int pNo, int pLevel, int pType, int pHp, int pSpeed, Item pItem,
			boolean pEvoType, Image pImg, int grade, int exp, int pMaxExp, int setExp) {
		this.pName = pName;  //1
		this.pNo = pNo;      //2
		this.pLevel = pLevel;
		this.pType = pType;  //3
		this.pHp = pHp;
		this.pSpeed = pSpeed;
		this.pItem = pItem;
		this.pEvoType = pEvoType;  //4
		this.pImg = pImg;          //5
		this.grade = grade;        //6
		this.exp = exp;
		this.pMaxExp = pMaxExp;
		this.setExp = setExp;
	}


	public String getpName() {
		return pName;
	}


	public int getpNo() {
		return pNo;
	}


	public int getpLevel() {
		return pLevel;
	}


	public int getpType() {
		return pType;
	}


	public int getpHp() {
		return pHp;
	}


	public int getpSpeed() {
		return pSpeed;
	}


	public Item getpItem() {
		return pItem;
	}


	public boolean ispEvoType() {
		return pEvoType;
	}


	public Image getpImg() {
		return pImg;
	}


	public int getGrade() {
		return grade;
	}


	public int getExp() {
		return exp;
	}


	public int getpMaxExp() {
		return pMaxExp;
	}


	public int getSetExp() {
		return setExp;
	}


	public ArrayList getpSkill() {
		return pSkill;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public void setpNo(int pNo) {
		this.pNo = pNo;
	}


	public void setpLevel(int pLevel) {
		this.pLevel = pLevel;
	}


	public void setpType(int pType) {
		this.pType = pType;
	}


	public void setpHp(int pHp) {
		this.pHp = pHp;
	}


	public void setpSpeed(int pSpeed) {
		this.pSpeed = pSpeed;
	}


	public void setpItem(Item pItem) {
		this.pItem = pItem;
	}


	public void setpEvoType(boolean pEvoType) {
		this.pEvoType = pEvoType;
	}


	public void setpImg(Image pImg) {
		this.pImg = pImg;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public void setpMaxExp(int pMaxExp) {
		this.pMaxExp = pMaxExp;
	}


	public void setSetExp(int setExp) {
		this.setExp = setExp;
	}


	public void setpSkill(ArrayList pSkill) {
		this.pSkill = pSkill;
	}
}
