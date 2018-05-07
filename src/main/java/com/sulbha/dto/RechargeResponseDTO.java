package com.sulbha.dto;

public class RechargeResponseDTO {
	private String plan;
	private int amount;
	private String operator;
	private String validity;
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	@Override
	public String toString() {
		return "RechargeResponseDTO {plan->" + plan + ", amount->" + amount + ", operator->" + operator + ", validity->"
				+ validity + "}";
	}
	
	
	
}
