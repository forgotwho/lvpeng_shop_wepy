/**
  * Copyright 2018 Risingsun 
  */
package com.lvpeng.shop.bean;
import java.util.Date;

/**
 * Auto-generated: 2018-06-05 18:20:58
 *
 * @author Risingsun (Risingsun)
 * @website 
 */
public class OrderPriceHistory {

    private int orderId;
    private double currentPrice;
    private double modifyPrice;
    private int currentPost;
    private int modifyPost;
    private String currentUUID;
    private String modifyUUID;
    private double finalPrice;
    private Date modifyTime;
    private String remark;
    public void setOrderId(int orderId) {
         this.orderId = orderId;
     }
     public int getOrderId() {
         return orderId;
     }

    public void setCurrentPrice(double currentPrice) {
         this.currentPrice = currentPrice;
     }
     public double getCurrentPrice() {
         return currentPrice;
     }

    public void setModifyPrice(double modifyPrice) {
         this.modifyPrice = modifyPrice;
     }
     public double getModifyPrice() {
         return modifyPrice;
     }

    public void setCurrentPost(int currentPost) {
         this.currentPost = currentPost;
     }
     public int getCurrentPost() {
         return currentPost;
     }

    public void setModifyPost(int modifyPost) {
         this.modifyPost = modifyPost;
     }
     public int getModifyPost() {
         return modifyPost;
     }

    public void setCurrentUUID(String currentUUID) {
         this.currentUUID = currentUUID;
     }
     public String getCurrentUUID() {
         return currentUUID;
     }

    public void setModifyUUID(String modifyUUID) {
         this.modifyUUID = modifyUUID;
     }
     public String getModifyUUID() {
         return modifyUUID;
     }

    public void setFinalPrice(double finalPrice) {
         this.finalPrice = finalPrice;
     }
     public double getFinalPrice() {
         return finalPrice;
     }

    public void setModifyTime(Date modifyTime) {
         this.modifyTime = modifyTime;
     }
     public Date getModifyTime() {
         return modifyTime;
     }

    public void setRemark(String remark) {
         this.remark = remark;
     }
     public String getRemark() {
         return remark;
     }

}