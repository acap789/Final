package rocketData;

import java.io.Serializable;

public class LoanRequest implements Serializable {

	private int iTerm;
	private double dRate;
	private double dAmount;
	private int iCreditScore;
	private int iDownPayment;
	private double dPayment;

	public double getdincome() {
		return dincome;
	}

	public void setdincome(double dincome) {
		this.dincome = dincome;
	}

	public double getdexpenses() {
		return dexpenses;
	}

	public void setdexpenses(double dexpenses) {
		this.dexpenses = dexpenses;
	}

	public LoanRequest() {
		super();
	}

	public int getiTerm() {
		return iTerm;
	}

	public void setiTerm(int iTerm) {
		this.iTerm = iTerm;
	}

	public double getdRate() {
		return dRate;
	}

	public void setdRate(double dRate) {
		this.dRate = dRate;
	}

	public double getdAmount() {
		return dAmount;
	}

	public void setdAmount(double dAmount) {
		this.dAmount = dAmount;
	}

	public int getiCreditScore() {
		return iCreditScore;
	}

	public void setiCreditScore(int iCreditScore) {
		this.iCreditScore = iCreditScore;
	}

	public int getiDownPayment() {
		return iDownPayment;
	}

	public void setiDownPayment(int iDownPayment) {
		this.iDownPayment = iDownPayment;
	}

	public double getdPayment() {
		return dPayment;
	}

	public void setdPayment(double dPayment) {
		this.dPayment = dPayment;
	}

} 
