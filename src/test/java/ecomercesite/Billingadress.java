package ecomercesite;



public class Billingadress {

	public static void main(String[] args) {

		Billingadress b = new Billingadress();

		b.adress();
		b.name();
		b.city();
		b.pincode();
		b.location();

	}

	public void name() {
		System.out.println("name");
	}

	public void location() {
		System.out.println("location");
	}

	public void pincode() {
		System.out.println("picode");
	}

	public void city() {
		System.out.println("city");
	}

	public void adress() {
		System.out.println("adress");
	}

}
