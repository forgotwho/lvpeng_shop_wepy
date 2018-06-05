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
public class GoodsInnerCategories {

    private int id;
    private int pid;
    private String name;
    private int shopId;
    private int seq;
    private Date createTime;
    private Date updateTime;
    private int isDelete;
    private int isShow;
    private String type;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setPid(int pid) {
         this.pid = pid;
     }
     public int getPid() {
         return pid;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setShopId(int shopId) {
         this.shopId = shopId;
     }
     public int getShopId() {
         return shopId;
     }

    public void setSeq(int seq) {
         this.seq = seq;
     }
     public int getSeq() {
         return seq;
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

    public void setIsDelete(int isDelete) {
         this.isDelete = isDelete;
     }
     public int getIsDelete() {
         return isDelete;
     }

    public void setIsShow(int isShow) {
         this.isShow = isShow;
     }
     public int getIsShow() {
         return isShow;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

}