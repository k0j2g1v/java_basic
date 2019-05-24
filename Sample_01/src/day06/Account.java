package day06;
/**
 * 
 * @author  student
 * @since   2019.04.30
 * @version 1.0
 *
 */
public class Account {
	private String number;
	private int money;


	public Account()  {
		this("000",0);
	}
	//System.out.println("Account() 생성자 수행");
	public Account(String number,int money) {
		this.setNumber( number);
		this.setMoney(  money);
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

	public void setMoney(int money) {
		if (money > 0)
			this.money = money;
	}

	public void input(int money) {
		if(money>0) {
			this.money += money; 
		}
	}
	public int ouput(int money) {
		if(this.money >= money) {
			this.money -= money;
			return money;
		}
		System.out.println("잔고 부족");
		return 0;
	}
	//계좌이체
	/**
	 * 
	 * @param from  출금통장
	 * @param to    입금통장
	 * @param money 이체금액
	 */
	public static void transfer(Account from,Account to,int money) {
		int t = from.ouput(money);
		to.input(t);
		//to.input(from.outpout(money));
	}
	
	//통장 잔고
	public void print() {
		System.out.printf("Account[통장잔고:%20s ,잔고: %d 원 ]%n",number,money);
	}
	
}
