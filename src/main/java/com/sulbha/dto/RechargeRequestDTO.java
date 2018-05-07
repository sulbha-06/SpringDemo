package com.sulbha.dto;

public class RechargeRequestDTO {
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
	/*@Override
	public String toString() {
		return "RechargeRequestDTO [plan=" + plan + ", amount=" + amount + ", operator=" + operator + ", validity="
				+ validity + "]";
	}
	*/
	/*@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RechargeRequestDTO [plan=");
		builder.append(plan);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", operator=");
		builder.append(operator);
		builder.append(", validity=");
		builder.append(validity);
		builder.append("]");
		return builder.toString();
	}*/
	@Override
	public String toString() {
		return "RechargeRequestDTO {plan->" + plan + ", amount->" + amount + ", operator->" + operator + ", validity->"
				+ validity + "}";
	}
	
	

}
