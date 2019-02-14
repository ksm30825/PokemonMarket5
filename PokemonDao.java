package model.dao;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import model.vo.Pokemon;

public class PokemonDao {
	private List<Pokemon> pList = new ArrayList<Pokemon>();
	private Image img = new ImageIcon(" ").getImage();
	private int num;

	public PokemonDao() {

		pList.add(new Pokemon("탕구리",104,0,false,img,1));   //이름,포켓몬넘버,속성,진화여부,이미지,등급
		pList.add(new Pokemon("파이리",4,1,false,img,2));
		pList.add(new Pokemon("꼬부기",7,2,true,img,1));
		pList.add(new Pokemon("어니부기",8,2,false,img,0));
		
		for(int i=0; i<pList.size(); i++) {
			num = pList.get(i).getpNo();
			pList.get(i).setpImg(new ImageIcon("images/userMenuImages/pBook/"+ num +".png").getImage());
		
	}
	}
	public List<Pokemon> getpList() {
		return pList;
	}

	public void setpList(List<Pokemon> pList) {
		this.pList = pList;
	}

}
