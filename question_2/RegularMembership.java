package question_2;

public class RegularMembership {
	public int membershipFee = 0, enrollmentFee = 0, golfservicesFee = 20000, noofMonths;
	
	public int calculateBill() {
		int totalFee = membershipFee + enrollmentFee + (golfservicesFee*noofMonths);
		return totalFee;
		
	}
}

class GoldMember extends RegularMembership {
	public GoldMember(int noofMonths) {
		super.membershipFee = 90000;
		super.enrollmentFee = 10000;
		super.golfservicesFee = 10000;
		if (noofMonths-6<=0)
			super.noofMonths = 0;
		else
			super.noofMonths = noofMonths-6;
	}
}

class SilverMember extends RegularMembership{
	public SilverMember(int noofMonths) {
		super.membershipFee = 15000;
		super.enrollmentFee = 5000;
		super.golfservicesFee = 20000;
		if (noofMonths-6<=0)
			super.noofMonths = 0;
		else
			super.noofMonths = noofMonths-6;
	}
}

