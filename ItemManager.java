package controller;

import model.vo.User;

public class ItemManager {
   
   private MCManager mc = new MCManager();
   private User user;
   private int dG;
   
   public void decreaseGold(int check) {
      System.out.println("ItemMamager�� ��");
      //���� �Ѿ�, ���� ���� ���� �ݾ��� �����ͼ� �� ����ִ�
      System.out.println("�����Ѿ� : "+check);
      System.out.println("�� �� :"+User.getuGold());
      dG = User.getuGold() - check;
      System.out.println("���� �� : "+dG);
      User.setuGold(dG);

      
   }
   
   
   
   
   
   
   
   
   
   //��Ʋ���� �޾ƿ;� ��
   public void useStone() {
      
   }
   public void useBall() {
      
   }
   public void Recovery() {
      
   }
}