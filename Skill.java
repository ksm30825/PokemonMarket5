package model.vo;

public class Skill {

	private int sType;		//��ųŸ��
	private int sLevel;		//��ų�� ������ �� �ִ� ����
	private int sAtt;		//��ų ���ݷ�
	
	public Skill() {}
	
	public Skill(int sType, int sLevel, int sAtt) {
		this.sType = sType;
		this.sLevel = sLevel;
		this.sAtt = sAtt;
	}

	public int getsType() {
		return sType;
	}

	public int getsLevel() {
		return sLevel;
	}

	public int getsAtt() {
		return sAtt;
	}

	public void setsType(int sType) {
		this.sType = sType;
	}

	public void setsLevel(int sLevel) {
		this.sLevel = sLevel;
	}

	public void setsAtt(int sAtt) {
		this.sAtt = sAtt;
	}
	
}
