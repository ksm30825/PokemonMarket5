package model.vo;

import java.awt.Image;

public class Ball extends Item {
   
   private int cProb;   //���ϸ� ��� Ȯ��
   private int cType;   //�� ���� -> 0 : �����ͺ� / 1 : ���ۺ� / 2 : ���ͺ�
   
   
   public Ball() {}
   
   public Ball(String iName, int iNo, int iPrice, int iType, int iAmount, 
         int cProb, int cType) {
      super(iName, iNo, iPrice, iType, iAmount);
      this.cProb = cProb;
      this.cType = cType;
   }

   public int getcProb() {
      return cProb;
   }

   public int getcType() {
      return cType;
   }

   public void setcProb(int cProb) {
      this.cProb = cProb;
   }

   public void setcType(int cType) {
      this.cType = cType;
   }
   
   

}