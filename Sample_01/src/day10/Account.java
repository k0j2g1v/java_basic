package day10;

import java.io.Serializable;

/**
 * 
 * @author student
 * @since 2019.05.08
 * @version 1.0
 *
 */
public class Account extends Object implements Serializable {
	private String number;
	private int money;

	public Account() {
		//this("000", 0);
	}

	// System.out.println("Account() 생성자 수행");
	public Account(String number, int money) throws MoneyException {
		this.setNumber(number);
		//try {
		this.setMoney(money);
		//} catch(MoneyException e) {
		//	System.out.println(e.getMessage());
		//}
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) throws MoneyException {
		if (money < 0)
			throw new MoneyException();
		this.money = money;
	}

	public void input(int money) {
		if (money > 0) {
			this.money += money;
		}
	}

	public int ouput(int money) {
		if (this.money >= money) {
			this.money -= money;
			return money;
		}
		System.out.println("잔고 부족");
		return 0;
	}
	// 계좌이체

	public static void transfer(Account from, Account to, int money) {
		int t = from.ouput(money);
		to.input(t);
		// to.input(from.outpout(money));
	}

	// 통장 잔고
	public void print() {
		System.out.printf("Account[통장잔고:%20s ,잔고: %d 원 ]%n", number, money);
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", money=" + money + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

}
