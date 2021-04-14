package exchange;

import java.util.Scanner;

public class MenuClass {
	Scanner sc = new Scanner(System.in);
	
	public int InputMenu() {
		System.out.print("어떤 돈으로 환전하시겠습니까?\n"
				+ "(1:USD, 2:EUR, 3:JPY, 0:종료)\n→ ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public int InputMoney() {
		System.out.print("원화 입력 : ");			
		int moneyKRW = sc.nextInt();
		return moneyKRW;
	}
}