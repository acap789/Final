package exceptions; 

public class RateException extends Exception {
	RateDomainModel rate;

	public RateException(RateDomainModel r) {
		this.rate = r;
	}

	public RateDomainModel getRateDomainMdoel() {
		return this.rate;
	}
}
