/**
  * Copyright 2018 Risingsun 
  */
package com.lvpeng.shop.bean;
import java.util.Date;

/**
 * Auto-generated: 2018-06-05 18:26:24
 *
 * @author Risingsun (Risingsun)
 * @website 
 */
public class Notices {

    private int id;
    private int shopId;
    private String content;
    private int isShow;
    private int isHome;
    private Date createTime;
    private Date updateTime;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setShopId(int shopId) {
         this.shopId = shopId;
     }
     public int getShopId() {
         return shopId;
     }

    public void setContent(String content) {
         this.content = content;
     }
     public String getContent() {
         return content;
     }

    public void setIsShow(int isShow) {
         this.isShow = isShow;
     }
     public int getIsShow() {
         return isShow;
     }

    public void setIsHome(int isHome) {
         this.isHome = isHome;
     }
     public int getIsHome() {
         return isHome;
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