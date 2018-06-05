/**
  * Copyright 2018 Risingsun 
  */
package com.lvpeng.shop.bean;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2018-06-05 18:36:1
 *
 * @author Risingsun (Risingsun)
 * @website 
 */
public class MemberPresentRules {

    private int id;
    private String ruleName;
    private int cardId;
    private int limitCount;
    private int presentCouponId;
    private int shopId;
    private String unit;
    private Date createTime;
    private List<String> categoryList;
    private List<GoodsList> goodsList;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setRuleName(String ruleName) {
         this.ruleName = ruleName;
     }
     public String getRuleName() {
         return ruleName;
     }

    public void setCardId(int cardId) {
         this.cardId = cardId;
     }
     public int getCardId() {
         return cardId;
     }

    public void setLimitCount(int limitCount) {
         this.limitCount = limitCount;
     }
     public int getLimitCount() {
         return limitCount;
     }

    public void setPresentCouponId(int presentCouponId) {
         this.presentCouponId = presentCouponId;
     }
     public int getPresentCouponId() {
         return presentCouponId;
     }

    public void setShopId(int shopId) {
         this.shopId = shopId;
     }
     public int getShopId() {
         return shopId;
     }

    public void setUnit(String unit) {
         this.unit = unit;
     }
     public String getUnit() {
         return unit;
     }

    public void setCreateTime(Date createTime) {
         this.createTime = createTime;
     }
     public Date getCreateTime() {
         return createTime;
     }

    public void setCategoryList(List<String> categoryList) {
         this.categoryList = categoryList;
     }
     public List<String> getCategoryList() {
         return categoryList;
     }

    public void setGoodsList(List<GoodsList> goodsList) {
         this.goodsList = goodsList;
     }
     public List<GoodsList> getGoodsList() {
         return goodsList;
     }

}