package controller;

import java.util.Date;

import model.dao.ItemDao;
import model.vo.User;
public class MCManager {
   //����
   //���ż���üũ->�����ݾ�üũ->���Ű��ɿ��� üũ
   private String resultNo;
   private int check=0;//���� �ϰ� ���� ������ �ѷ��� ����
   
   public int getCheck() {
      return check;
   }
   public void setCheck(int check) {
      this.check = check;
   }
   public void useMarket(String itemName, int itemAmount) {
      ItemDao id = new ItemDao();
      id.outputItemList();
      //->MarketView���� �� ��
      //�ּҼ���, �ִ����
      
      ItemManager im = new ItemManager();
      resultNo=null;
      System.out.println(id.getItemList());
      System.out.println(id.getItemList().size());
      for(int i=0 ; i<id.getItemList().size() ; i++) {
         //������ �� ���� ���Ͽ� �����۸���Ʈ�� ���° �ε����� �ִ� �� Ȯ��
         if(id.getItemList().get(i).getiName().equals(itemName)) {
            //���� �ϰ� ���� �������� �� �ݾ�
            check=(id.getItemList().get(i).getiPrice())*itemAmount;
            //�����κ��� �ִ� �����ݾװ� �� ��   
            //�����ݾ�<check : �����ݾ��� ���� ���Ű� �Ұ��� �մϴ� ��� : MarketView���� �ٷ� �����
            if(User.getuGold()<check) {
               //���� �Ұ�
               resultNo="�� ����";
            }else {
               //���� ����
               //�ߺ� �������� ������ ������ �������Ѿ�
               //System.out.println("������ : "+itemName+", ���� : "+itemAmount);
               im.decreaseGold(check);
            }
            //�����ݾ�>check : ���� ���� : itemManager �� ���� ��ϰ� �����Ѿ��� ������
         }
      }
      
   }
   public String getResultNo() {
      return resultNo;
   }
   public void setResultNo(String resultNo) {
      this.resultNo = resultNo;
   }
   public void useCenter() {
      //ȸ�� �����ֱ�
      //�����̿�
      
      
   }

}