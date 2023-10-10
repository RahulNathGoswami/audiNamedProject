package ecomercesite;

public class Paymentgateway {

	public static void main(String[] args) {

		

		Billingadress b = new Billingadress();

		b.adress();
		b.name();
		b.city();
		b.pincode();
		b.location();

		Paymentgateway p = new Paymentgateway();
		p.paymentWithCard();
		p.cashOnDelevery();
		p.upi();
		p.payPal();
		p.bankTransfer();
	}

	public void paymentWithCard() {
		System.out.println("payment with card");
	}

	public void cashOnDelevery() {
		System.out.println("cash on delivery");
	}

	public void upi() {
		System.out.println("upi");
	}

	public void payPal() {
		System.out.println("paypal");
	}

	public void bankTransfer() {
		System.out.println("bank transfer");
	}

	public void free() {
		System.out.println("free");
	}

}
