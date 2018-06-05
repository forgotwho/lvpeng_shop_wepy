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
public class GoodsList {

    private int ruleId;
    private int goodsId;
    private Date createTime;
    public void setRuleId(int ruleId) {
         this.ruleId = ruleId;
     }
     public int getRuleId() {
         return ruleId;
     }

    public void setGoodsId(int goodsId) {
         this.goodsId = goodsId;
     }
     public int getGoodsId() {
         return goodsId;
     }

    public void setCreateTime(Date createTime) {
         this.createTime = createTime;
     }
     public Date getCreateTime() {
         return createTime;
     }

}