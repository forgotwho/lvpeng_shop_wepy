/**
  * Copyright 2018 Risingsun 
  */
package com.lvpeng.shop.bean;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2018-06-05 18:21:35
 *
 * @author Risingsun (Risingsun)
 * @website 
 */
public class Shop {

    private int id;
    private String name;
    private int categoryId;
    private String categoryName;
    private String describe;
    private String address;
    private String phone;
    private String expiredTime;
    private Date createTime;
    private Date updateTime;
    private String longitude;
    private String latitude;
    private String avatar;
    private int autoOrder;
    private long leArea;
    private int offPay;
    private String detailAddress;
    private int inShop;
    private int supportMember;
    private int isDelete;
    private List<String> images;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setCategoryId(int categoryId) {
         this.categoryId = categoryId;
     }
     public int getCategoryId() {
         return categoryId;
     }

    public void setCategoryName(String categoryName) {
         this.categoryName = categoryName;
     }
     public String getCategoryName() {
         return categoryName;
     }

    public void setDescribe(String describe) {
         this.describe = describe;
     }
     public String getDescribe() {
         return describe;
     }

    public void setAddress(String address) {
         this.address = address;
     }
     public String getAddress() {
         return address;
     }

    public void setPhone(String phone) {
         this.phone = phone;
     }
     public String getPhone() {
         return phone;
     }

    public void setExpiredTime(String expiredTime) {
         this.expiredTime = expiredTime;
     }
     public String getExpiredTime() {
         return expiredTime;
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

    public void setLongitude(String longitude) {
         this.longitude = longitude;
     }
     public String getLongitude() {
         return longitude;
     }

    public void setLatitude(String latitude) {
         this.latitude = latitude;
     }
     public String getLatitude() {
         return latitude;
     }

    public void setAvatar(String avatar) {
         this.avatar = avatar;
     }
     public String getAvatar() {
         return avatar;
     }

    public void setAutoOrder(int autoOrder) {
         this.autoOrder = autoOrder;
     }
     public int getAutoOrder() {
         return autoOrder;
     }

    public void setLeArea(long leArea) {
         this.leArea = leArea;
     }
     public long getLeArea() {
         return leArea;
     }

    public void setOffPay(int offPay) {
         this.offPay = offPay;
     }
     public int getOffPay() {
         return offPay;
     }

    public void setDetailAddress(String detailAddress) {
         this.detailAddress = detailAddress;
     }
     public String getDetailAddress() {
         return detailAddress;
     }

    public void setInShop(int inShop) {
         this.inShop = inShop;
     }
     public int getInShop() {
         return inShop;
     }

    public void setSupportMember(int supportMember) {
         this.supportMember = supportMember;
     }
     public int getSupportMember() {
         return supportMember;
     }

    public void setIsDelete(int isDelete) {
         this.isDelete = isDelete;
     }
     public int getIsDelete() {
         return isDelete;
     }

    public void setImages(List<String> images) {
         this.images = images;
     }
     public List<String> getImages() {
         return images;
     }

}