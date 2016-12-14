package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();

	static double getRate(int GivenCreditScore) throws RateRateDomainModel		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		double returnRate = 0;
		boolean found = false;
		
		for (int i = 0; i < rates.size(); i++ ) {
			if(GivenCredScore >= rates.get(i).getiMinCreditScore() && found == false) {
				returnRate = rates.get(i).getdIntrestRate();
				found = true;
			}
		}
		
		if(returnRate == 0) {
			throw new RateException(rates.get(rates.size() - 1));
		}
		
		else {
			return returnRate;
		}
}

	public static double getPayment(double r, double n, double p, double f, boolean t) {
		return FinanceLib.pmt(r, n, p, f, t);
	}
} 
