/**
  * Copyright 2018 Risingsun 
  */
package com.lvpeng.shop.bean;
import java.util.List;

/**
 * Auto-generated: 2018-06-05 18:21:35
 *
 * @author Risingsun (Risingsun)
 * @website 
 */
public class Data {

    private Shop shop;
    private ShopStatusInfo shopStatusInfo;
    private List<Notices> notices;
    private List<String> reduceRules;
    private ShopChargeLimit shopChargeLimit;
    private MemberCard memberCard;
    private Member member;
    private List<GoodsInnerCategories> goodsInnerCategories;
    private String homePageConfig;
    private int homePageId;
    private int customPageId;
    private String campaignCoupon;
    public void setShop(Shop shop) {
         this.shop = shop;
     }
     public Shop getShop() {
         return shop;
     }

    public void setShopStatusInfo(ShopStatusInfo shopStatusInfo) {
         this.shopStatusInfo = shopStatusInfo;
     }
     public ShopStatusInfo getShopStatusInfo() {
         return shopStatusInfo;
     }

    public void setNotices(List<Notices> notices) {
         this.notices = notices;
     }
     public List<Notices> getNotices() {
         return notices;
     }

    public void setReduceRules(List<String> reduceRules) {
         this.reduceRules = reduceRules;
     }
     public List<String> getReduceRules() {
         return reduceRules;
     }

    public void setShopChargeLimit(ShopChargeLimit shopChargeLimit) {
         this.shopChargeLimit = shopChargeLimit;
     }
     public ShopChargeLimit getShopChargeLimit() {
         return shopChargeLimit;
     }

    public void setMemberCard(MemberCard memberCard) {
         this.memberCard = memberCard;
     }
     public MemberCard getMemberCard() {
         return memberCard;
     }

    public void setMember(Member member) {
         this.member = member;
     }
     public Member getMember() {
         return member;
     }

    public void setGoodsInnerCategories(List<GoodsInnerCategories> goodsInnerCategories) {
         this.goodsInnerCategories = goodsInnerCategories;
     }
     public List<GoodsInnerCategories> getGoodsInnerCategories() {
         return goodsInnerCategories;
     }

    public void setHomePageConfig(String homePageConfig) {
         this.homePageConfig = homePageConfig;
     }
     public String getHomePageConfig() {
         return homePageConfig;
     }

    public void setHomePageId(int homePageId) {
         this.homePageId = homePageId;
     }
     public int getHomePageId() {
         return homePageId;
     }

    public void setCustomPageId(int customPageId) {
         this.customPageId = customPageId;
     }
     public int getCustomPageId() {
         return customPageId;
     }

    public void setCampaignCoupon(String campaignCoupon) {
         this.campaignCoupon = campaignCoupon;
     }
     public String getCampaignCoupon() {
         return campaignCoupon;
     }

}