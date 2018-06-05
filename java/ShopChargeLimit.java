/**
  * Copyright 2018 Risingsun 
  */
package com.lvpeng.shop.bean;
import java.util.Date;

/**
 * Auto-generated: 2018-06-05 18:21:35
 *
 * @author Risingsun (Risingsun)
 * @website 
 */
public class ShopChargeLimit {

    private int shopId;
    private int couponLimit;
    private int memberLimit;
    private int orderLimit;
    private int mpLimit;
    private int smsLimit;
    private String chargeVersion;
    private Date createTime;
    private Date updateTime;
    public void setShopId(int shopId) {
         this.shopId = shopId;
     }
     public int getShopId() {
         return shopId;
     }

    public void setCouponLimit(int couponLimit) {
         this.couponLimit = couponLimit;
     }
     public int getCouponLimit() {
         return couponLimit;
     }

    public void setMemberLimit(int memberLimit) {
         this.memberLimit = memberLimit;
     }
     public int getMemberLimit() {
         return memberLimit;
     }

    public void setOrderLimit(int orderLimit) {
         this.orderLimit = orderLimit;
     }
     public int getOrderLimit() {
         return orderLimit;
     }

    public void setMpLimit(int mpLimit) {
         this.mpLimit = mpLimit;
     }
     public int getMpLimit() {
         return mpLimit;
     }

    public void setSmsLimit(int smsLimit) {
         this.smsLimit = smsLimit;
     }
     public int getSmsLimit() {
         return smsLimit;
     }

    public void setChargeVersion(String chargeVersion) {
         this.chargeVersion = chargeVersion;
     }
     public String getChargeVersion() {
         return chargeVersion;
     }

    public void setCreateTime(Date createTime) {
         this.createTime = createTime;
     }
     public Date getCreateTime() {
         return createTime;
     }

    public void setUpdateTime(Date updateTime) {
         this.updateTime = updateTime;
     }
     public Date getUpdateTime() {
         return updateTime;
     }

}