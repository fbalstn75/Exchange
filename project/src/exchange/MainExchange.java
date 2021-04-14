package exchange;

import java.io.IOException;

public class MainExchange {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		int menu;
		int moneyKRW;		
			
		while(true) {
			MenuClass runMenu = new MenuClass();
			RunExchange runClass = new RunExchange();
			menu = runMenu.InputMenu();
			moneyKRW = runMenu.InputMoney();			
			if (menu == ConstantValue.exit) {
				break;				
			} else if (menu == ConstantValue.exchangeUSD) {				
				runClass.changeToUSD(moneyKRW);				
			} else if (menu == ConstantValue.exchangeEUR) {				
				runClass.changeToEUR(moneyKRW);				
			} else if (menu == ConstantValue.exchangeJPY) {				
				runClass.changeToJPY(moneyKRW);
			}
		}
	}
}