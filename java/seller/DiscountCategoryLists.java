/**
  * Copyright 2018 Risingsun 
  */
package com.lvpeng.shop.bean;
import java.util.Date;

/**
 * Auto-generated: 2018-06-05 18:36:1
 *
 * @author Risingsun (Risingsun)
 * @website 
 */
public class DiscountCategoryLists {

    private int cardId;
    private int level;
    private int categoryId;
    private Date createTime;
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

    public void setCategoryId(int categoryId) {
         this.categoryId = categoryId;
     }
     public int getCategoryId() {
         return categoryId;
     }

    public void setCreateTime(Date createTime) {
         this.createTime = createTime;
     }
     public Date getCreateTime() {
         return createTime;
     }

}