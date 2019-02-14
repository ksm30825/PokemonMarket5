package controller;

import java.util.Date;

import model.dao.ItemDao;
import model.vo.User;
public class MCManager {
   //마켓
   //구매수량체크->소유금액체크->구매가능여부 체크
   private String resultNo;
   private int check=0;//구매 하고 싶은 아이템 총량의 수량
   
   public int getCheck() {
      return check;
   }
   public void setCheck(int check) {
      this.check = check;
   }
   public void useMarket(String itemName, int itemAmount) {
      ItemDao id = new ItemDao();
      id.outputItemList();
      //->MarketView에서 쓸 것
      //최소수량, 최대수량
      
      ItemManager im = new ItemManager();
      resultNo=null;
      System.out.println(id.getItemList());
      System.out.println(id.getItemList().size());
      for(int i=0 ; i<id.getItemList().size() ; i++) {
         //아이템 고른 것을 비교하여 아이템리스트의 몇번째 인덱스에 있는 지 확인
         if(id.getItemList().get(i).getiName().equals(itemName)) {
            //구매 하고 싶은 아이템의 총 금액
            check=(id.getItemList().get(i).getiPrice())*itemAmount;
            //유저인벤에 있는 소지금액과 비교 후   
            //소지금액<check : 소지금액이 적어 구매가 불가능 합니다 출력 : MarketView에서 바로 출력함
            if(User.getuGold()<check) {
               //구매 불가
               resultNo="응 못사";
            }else {
               //구매 가능
               //중복 아이템이 있으면 수량을 증가시켜야
               //System.out.println("아이템 : "+itemName+", 수량 : "+itemAmount);
               im.decreaseGold(check);
            }
            //소지금액>check : 구매 가능 : itemManager 로 구매 목록과 구매총액을 보내줌
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
      //회복 시켜주기
      //센터이용
      
      
   }

}