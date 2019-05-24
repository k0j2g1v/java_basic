package Prob;

public class Prob5_2 {

	public static void main(String[] args) {

	}
}

class Account {
	private String accountNum; // 계좌번호 : 계좌번호 , 예금주 , 비밀번호, 남은금액
	private String accountOwner; // 예금주
	private String accountPassword;// 비밀번호
	private int accountRest; // 잔고

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public void deposit(int deposit) {
		if (deposit <= 0) {
			System.out.println("금액을 정확시 입력하세요");
			return;
		}
		accountRest += deposit;
	}

	public int getAcountRest() {
		return accountRest;
	}

	public void setAcountRest(int acouuntRest) {
		this.accountRest = acouuntRest;
	}

	public void withdraw(int withdraw) {
		if (withdraw > accountRest) {
			System.out.println("금액이 부족합니다");
			return;
		}
		if (withdraw <= 0) {
			System.out.println("0이하로는 출금하실수 없습니다.");
			return;
		}
		accountRest -= withdraw;
	}

}
