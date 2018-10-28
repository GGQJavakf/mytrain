package com.ggq.bean;

import java.util.Date;

import javax.xml.crypto.Data;

public class DailyBill {
	//早餐钱
	private float breakFast;
	//午餐钱
	private float lunch;
	//晚餐钱
	private float dinner;
	//吃饭描述
	private String eatDes;
	//其他支出
	private float otherExpenses;
	//支出描述
	private String otherDes;
	//消费总额
	private float total;
	
	private Date date;
	public DailyBill() {
		super();
	}
	public DailyBill(float[] money,String eatDes,String otherDes,Date date) {
		if(money.length>2) {
			this.breakFast =money[0];
			this.lunch = money[1];
			this.dinner =money[2];
			float x=0;
			for(int i=3;i< money.length;i++) {
				x+=money[i];
			}
			this.otherExpenses=x;
			this.total = money[0]+money[1]+money[2]+x;
		}
		
		
		this.eatDes=eatDes;
		this.otherDes=otherDes;
		this.date=date;
	}
	public DailyBill(float breakFast, float lunch, float dinner, String eatDes, float otherExpenses, String otherDes,Date date) {
		super();
		this.breakFast = breakFast;
		this.lunch = lunch;
		this.dinner = dinner;
		this.eatDes = eatDes;
		this.otherExpenses = otherExpenses;
		this.otherDes = otherDes;
		this.total = breakFast+lunch+dinner+otherExpenses;
		this.date=date;
	}
	public float getBreakFast() {
		return breakFast;
	}
	public void setBreakFast(float breakFast) {
		this.breakFast = breakFast;
	}
	public float getLunch() {
		return lunch;
	}
	public void setLunch(float lunch) {
		this.lunch = lunch;
	}
	public float getDinner() {
		return dinner;
	}
	public void setDinner(float dinner) {
		this.dinner = dinner;
	}
	public String getEatDes() {
		return eatDes;
	}
	public void setEatDes(String eatDes) {
		this.eatDes = eatDes;
	}
	public float getOtherExpenses() {
		return otherExpenses;
	}
	public void setOtherExpenses(float otherExpenses) {
		this.otherExpenses = otherExpenses;
	}
	public String getOtherDes() {
		return otherDes;
	}
	public void setOtherDes(String otherDes) {
		this.otherDes = otherDes;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "DailyBill [breakFast=" + breakFast + ", lunch=" + lunch + ", dinner=" + dinner + ", eatDes=" + eatDes
				+ ", otherExpenses=" + otherExpenses + ", otherDes=" + otherDes + ", total=" + total + ", data=" + date
				+ "]";
	}
	
	

}
