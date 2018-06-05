/**
  * Copyright 2018 Risingsun 
  */
package com.lvpeng.shop.bean;

/**
 * Auto-generated: 2018-06-05 18:20:58
 *
 * @author Risingsun (Risingsun)
 * @website 
 */
public class OrderGoodsInfos {

    private int goodsId;
    private String imageUrl;
    private String goodsName;
    private String goodsSku;
    private double goodsPrice;
    private double goodsSellPrice;
    private int count;
    private int innerCid;
    public void setGoodsId(int goodsId) {
         this.goodsId = goodsId;
     }
     public int getGoodsId() {
         return goodsId;
     }

    public void setImageUrl(String imageUrl) {
         this.imageUrl = imageUrl;
     }
     public String getImageUrl() {
         return imageUrl;
     }

    public void setGoodsName(String goodsName) {
         this.goodsName = goodsName;
     }
     public String getGoodsName() {
         return goodsName;
     }

    public void setGoodsSku(String goodsSku) {
         this.goodsSku = goodsSku;
     }
     public String getGoodsSku() {
         return goodsSku;
     }

    public void setGoodsPrice(double goodsPrice) {
         this.goodsPrice = goodsPrice;
     }
     public double getGoodsPrice() {
         return goodsPrice;
     }

    public void setGoodsSellPrice(double goodsSellPrice) {
         this.goodsSellPrice = goodsSellPrice;
     }
     public double getGoodsSellPrice() {
         return goodsSellPrice;
     }

    public void setCount(int count) {
         this.count = count;
     }
     public int getCount() {
         return count;
     }

    public void setInnerCid(int innerCid) {
         this.innerCid = innerCid;
     }
     public int getInnerCid() {
         return innerCid;
     }

}