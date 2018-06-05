/**
  * Copyright 2018 Risingsun 
  */
package com.lvpeng.shop.bean;

/**
 * Auto-generated: 2018-06-05 18:21:35
 *
 * @author Risingsun (Risingsun)
 * @website 
 */
public class ShopStatusInfo {

    private String status;
    private String beginTime;
    private String endTime;
    private boolean open;
    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setBeginTime(String beginTime) {
         this.beginTime = beginTime;
     }
     public String getBeginTime() {
         return beginTime;
     }

    public void setEndTime(String endTime) {
         this.endTime = endTime;
     }
     public String getEndTime() {
         return endTime;
     }

    public void setOpen(boolean open) {
         this.open = open;
     }
     public boolean getOpen() {
         return open;
     }

}