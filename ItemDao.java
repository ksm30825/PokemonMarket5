package model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import model.vo.Ball;
import model.vo.Item;
import model.vo.Recovery;
import model.vo.Stone;

public class ItemDao {
   
   ArrayList<Item> itemList = new ArrayList<Item>();
   
   public ItemDao() {
      //ball
	   /*itemList.add(new Ball("마스터 볼",0,50,0,0,70,0));
	   itemList.add(new Ball("슈퍼 볼",1,30,0,0,50,1));
	   itemList.add(new Ball("몬스터 볼",2,10,0,0,20,2));
      //recovery
	   itemList.add(new Recovery("고급 상처약",3,30,1,0,0,100));
	   itemList.add(new Recovery("중급 상처약",4,20,1,0,1,50));
	   itemList.add(new Recovery("초급 상처약",5,10,1,0,2,30));
      //stone
	   itemList.add(new Stone("화염의 돌",6,200,2,0));
	   itemList.add(new Stone("바다의 돌",7,200,2,0));
	   itemList.add(new Stone("나무의 돌",8,200,2,0));*/
	}
   public void inputItemList() {
	   try {
		ObjectOutputStream itemOutput = new ObjectOutputStream(new FileOutputStream("itemList.dat",true));
		itemOutput.writeObject(itemList);
	   } catch (IOException e) {
		   e.printStackTrace();
	   }
   }
   public void outputItemList() {
	   try {
		   ObjectInputStream itemInput = new ObjectInputStream(new FileInputStream("itemList.dat"));
			itemList = (ArrayList<Item>) itemInput.readObject();
	   } catch (IOException e) {
		   e.printStackTrace();
	   } catch(ClassNotFoundException e) {
		   e.printStackTrace();
	   }
   }
   public ArrayList<Item> getItemList() {
      return itemList;
   }
   public void setItemList(ArrayList<Item> itemList) {
	   this.itemList=itemList;
   }
}