/**
  * Copyright 2018 Risingsun 
  */
package com.lvpeng.shop.bean;

/**
 * Auto-generated: 2018-06-05 18:19:47
 *
 * @author Risingsun (Risingsun)
 * @website 
 */
public class GoodsStocks {

    private int goodsId;
    private String sku;
    private int stock;
    public void setGoodsId(int goodsId) {
         this.goodsId = goodsId;
     }
     public int getGoodsId() {
         return goodsId;
     }

    public void setSku(String sku) {
         this.sku = sku;
     }
     public String getSku() {
         return sku;
     }

    public void setStock(int stock) {
         this.stock = stock;
     }
     public int getStock() {
         return stock;
     }

}