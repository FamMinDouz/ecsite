package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class MstGoods {
    private int id;
    
    private String goodsName;
    
    private int price;
    
    private Timestamp createName;
    
    private Timestamp updatedAt;
    
    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id = id;
    }
    public String getGoodsName() {
    	return goodsName;
    }
    public void setGoodsName(String goodsName) {
    	this.goodsName = goodsName;
    }
    public int getPrice() {
    	return price;
    }
    public void setPrice(int price) {
    	this.price = price;
    }
    public Timestamp getCreateName() {
    	return createName;
    }
    public void setCreateName(Timestamp createName) {
    	this.createName = createName;
    }
    public Timestamp getUpdatedAt() {
    	return updatedAt;
    }
    public void setUpdatedAt(Timestamp updatedAt) {
    	this.updatedAt = updatedAt;
    }
 }
