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
public class MemberCard {

    private int id;
    private int shopId;
    private String backgroundPicUrl;
    private String color;
    private String brandName;
    private String title;
    private String prerogative;
    private int autoActivate;
    private int supplyBonus;
    private int supplyBalance;
    private int supplyDiscount;
    private int supplyPresent;
    private String notice;
    private String description;
    private int quantity;
    private int date_type;
    private int beginTimestamp;
    private int endTimestamp;
    private int fixedTerm;
    private int fixedBeginTerm;
    private String servicePhone;
    private Date createTime;
    private Date updateTime;
    private BonusRule bonusRule;
    private List<DiscountRules> discountRules;
    private List<String> memberPresentRules;
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

    public void setBackgroundPicUrl(String backgroundPicUrl) {
         this.backgroundPicUrl = backgroundPicUrl;
     }
     public String getBackgroundPicUrl() {
         return backgroundPicUrl;
     }

    public void setColor(String color) {
         this.color = color;
     }
     public String getColor() {
         return color;
     }

    public void setBrandName(String brandName) {
         this.brandName = brandName;
     }
     public String getBrandName() {
         return brandName;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setPrerogative(String prerogative) {
         this.prerogative = prerogative;
     }
     public String getPrerogative() {
         return prerogative;
     }

    public void setAutoActivate(int autoActivate) {
         this.autoActivate = autoActivate;
     }
     public int getAutoActivate() {
         return autoActivate;
     }

    public void setSupplyBonus(int supplyBonus) {
         this.supplyBonus = supplyBonus;
     }
     public int getSupplyBonus() {
         return supplyBonus;
     }

    public void setSupplyBalance(int supplyBalance) {
         this.supplyBalance = supplyBalance;
     }
     public int getSupplyBalance() {
         return supplyBalance;
     }

    public void setSupplyDiscount(int supplyDiscount) {
         this.supplyDiscount = supplyDiscount;
     }
     public int getSupplyDiscount() {
         return supplyDiscount;
     }

    public void setSupplyPresent(int supplyPresent) {
         this.supplyPresent = supplyPresent;
     }
     public int getSupplyPresent() {
         return supplyPresent;
     }

    public void setNotice(String notice) {
         this.notice = notice;
     }
     public String getNotice() {
         return notice;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setQuantity(int quantity) {
         this.quantity = quantity;
     }
     public int getQuantity() {
         return quantity;
     }

    public void setDate_type(int date_type) {
         this.date_type = date_type;
     }
     public int getDate_type() {
         return date_type;
     }

    public void setBeginTimestamp(int beginTimestamp) {
         this.beginTimestamp = beginTimestamp;
     }
     public int getBeginTimestamp() {
         return beginTimestamp;
     }

    public void setEndTimestamp(int endTimestamp) {
         this.endTimestamp = endTimestamp;
     }
     public int getEndTimestamp() {
         return endTimestamp;
     }

    public void setFixedTerm(int fixedTerm) {
         this.fixedTerm = fixedTerm;
     }
     public int getFixedTerm() {
         return fixedTerm;
     }

    public void setFixedBeginTerm(int fixedBeginTerm) {
         this.fixedBeginTerm = fixedBeginTerm;
     }
     public int getFixedBeginTerm() {
         return fixedBeginTerm;
     }

    public void setServicePhone(String servicePhone) {
         this.servicePhone = servicePhone;
     }
     public String getServicePhone() {
         return servicePhone;
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

    public void setBonusRule(BonusRule bonusRule) {
         this.bonusRule = bonusRule;
     }
     public BonusRule getBonusRule() {
         return bonusRule;
     }

    public void setDiscountRules(List<DiscountRules> discountRules) {
         this.discountRules = discountRules;
     }
     public List<DiscountRules> getDiscountRules() {
         return discountRules;
     }

    public void setMemberPresentRules(List<String> memberPresentRules) {
         this.memberPresentRules = memberPresentRules;
     }
     public List<String> getMemberPresentRules() {
         return memberPresentRules;
     }

}