/**
  * Copyright 2018 Risingsun 
  */
package com.lvpeng.shop.bean;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2018-06-05 18:26:24
 *
 * @author Risingsun (Risingsun)
 * @website 
 */
public class DiscountRules {

    private int cardId;
    private int level;
    private String levelName;
    private int discount;
    private int upgradeFee;
    private Date createTime;
    private List<String> discountCategoryLists;
    private List<String> discountGoodsLists;
    public void setCardId(int cardId) {
         this.cardId = cardId;
     }
     public int getCardId() {
         return cardId;
     }

    public void setLevel(int level) {
         this.level = level;
     }
     public int getLevel() {
         return level;
     }

    public void setLevelName(String levelName) {
         this.levelName = levelName;
     }
     public String getLevelName() {
         return levelName;
     }

    public void setDiscount(int discount) {
         this.discount = discount;
     }
     public int getDiscount() {
         return discount;
     }

    public void setUpgradeFee(int upgradeFee) {
         this.upgradeFee = upgradeFee;
     }
     public int getUpgradeFee() {
         return upgradeFee;
     }

    public void setCreateTime(Date createTime) {
         this.createTime = createTime;
     }
     public Date getCreateTime() {
         return createTime;
     }

    public void setDiscountCategoryLists(List<String> discountCategoryLists) {
         this.discountCategoryLists = discountCategoryLists;
     }
     public List<String> getDiscountCategoryLists() {
         return discountCategoryLists;
     }

    public void setDiscountGoodsLists(List<String> discountGoodsLists) {
         this.discountGoodsLists = discountGoodsLists;
     }
     public List<String> getDiscountGoodsLists() {
         return discountGoodsLists;
     }

}