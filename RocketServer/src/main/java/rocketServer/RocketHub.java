package rocketServer;

import java.io.IOException;

import exceptions.RateException;
import netgame.common.Hub;
import rocketBase.RateBLL;
import rocketData.LoanRequest;

public class RocketHub extends Hub {

	private RateBLL _RateBLL = new RateBLL();

	public RocketHub(int port) throws IOException {
		super(port);
	}

	@Override
	protected void messageReceived(int ClientID, Object message) {
		System.out.println("Message Received by Hub");
		
		if (message instanceof LoanRequest) {
			resetOutput();
			
			LoanRequest lq = (LoanRequest) message;
			
			double rate = 0;
			try {
				lq.setdRate)RateBLL.getRate(lq.getiCreditScore())/100/12);
			}
			
			catch (RateException e) {
			e.printStackTrace();
			}
			
			double payment = RateBLL.getPayment(rate,  lq.getiTerm(), lq.getdAmount() - lq.getiDownPayment(), 0,  true);
			lq.setdPayment(payment);
			
			sendToAll(lq);
		}
	} 
}
