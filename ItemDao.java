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
	   /*itemList.add(new Ball("������ ��",0,50,0,0,70,0));
	   itemList.add(new Ball("���� ��",1,30,0,0,50,1));
	   itemList.add(new Ball("���� ��",2,10,0,0,20,2));
      //recovery
	   itemList.add(new Recovery("��� ��ó��",3,30,1,0,0,100));
	   itemList.add(new Recovery("�߱� ��ó��",4,20,1,0,1,50));
	   itemList.add(new Recovery("�ʱ� ��ó��",5,10,1,0,2,30));
      //stone
	   itemList.add(new Stone("ȭ���� ��",6,200,2,0));
	   itemList.add(new Stone("�ٴ��� ��",7,200,2,0));
	   itemList.add(new Stone("������ ��",8,200,2,0));*/
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