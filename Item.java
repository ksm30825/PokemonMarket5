package model.vo;

import java.awt.Image;
import java.io.Serializable;

import javax.swing.ImageIcon;

import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

public class Item implements Serializable{
   
   private String iName;   //������ �̸�
   private int iNo;      //������ ��ȣ
   private int iPrice;      //������ ����
   private int iType;      //������ Ÿ�� -> 0 : ball(���ͺ�) / 1 : recovery(ȸ����) / 2 : stone(��ȭ�� ��)
   private int iAmount = 0;   //������ �������
   
   public Item() {}
   
   public Item(String iName, int iNo, int iPrice, int iType, int iAmount) {
      this.iName = iName;
      this.iNo = iNo;
      this.iPrice = iPrice;
      this.iType = iType;
      this.iAmount = iAmount;
   }
   
   
   
   public int getiAmount() {
      return iAmount;
   }

   public void setiAmount(int iAmount) {
      this.iAmount = iAmount;
   }

   public String getiName() {
      return iName;
   }


   public int getiNo() {
      return iNo;
   }


   public int getiPrice() {
      return iPrice;
   }


   public int getiType() {
      return iType;
   }


   public void setiName(String iName) {
      this.iName = iName;
   }


   public void setiNo(int iNo) {
      this.iNo = iNo;
   }


   public void setiPrice(int iPrice) {
      this.iPrice = iPrice;
   }


   public void setiType(int iType) {
      this.iType = iType;
   }
}