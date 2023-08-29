package com.skill.hibernate.SecondLevelCache;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="Store")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Shop {
	@Id
private int num;
private String product;
private String quantity;
private int cost;


public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Shop [num=" + num + ", product=" + product + ", quantity=" + quantity + ", cost=" + cost + "]";
}


}
