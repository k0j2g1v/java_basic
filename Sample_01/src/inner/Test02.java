package inner;

import javax.swing.JOptionPane;

import day09.Command;


public class Test02 {
	public static void main(String[] args) {
		
		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println("delete 수행");
			}
		};	
		
		
		Command update = new Command() {
		@Override
		public void exec() {
			System.out.println("update 수행");
		}
		};
		
		
		Command list = new Command() {
			@Override
			public void exec() {
				System.out.println("list 수행");
			}
		};
		
		
		Command create = new Command() {
			@Override
			public void exec() {
				System.out.println("create 수행");
			}

	};
	String msg = JOptionPane.showInputDialog("수행할 며령을 입력하세요..create.list,delte,update");
	switch(msg.trim().toLowerCase()) {
	case "delete":
		delete.exec();
		break;
	case "update":
		update.exec();
		break;
	case "create":
		create.exec();
		break;
	case "list":
		list.exec();
		break;
	default:
		System.out.println("다시 입력하세요");
	}
	}
}
