package day10;

public class MoneyException extends RuntimeException {
	public MoneyException(){
		super("MoneyException 금액 확인 필요");
	}
	public MoneyException(String msg){
		super(msg);
	}
}