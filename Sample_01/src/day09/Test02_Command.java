package day09;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Test02_Command {
	public static void main(String[] args) {
		Command cmd = null;
		String msg = JOptionPane.showInputDialog("수행할 며령을 입력하세요..create.list,delte,update");
		switch(msg.trim().toLowerCase()) {
		case "delete":
			cmd = new DeleteCommand();
			break;
		case "update":
			cmd = new DeleteCommand();
			break;
		case "create":
			cmd = new DeleteCommand();
			break;
		case "list":
			cmd = new DeleteCommand();
			break;
		default:
			System.out.println("다시 입력하세요");
		}
	
		if(cmd != null)cmd.exec(); cmd.process();
	}
		Calendar c =  Calendar.getInstance();
}
