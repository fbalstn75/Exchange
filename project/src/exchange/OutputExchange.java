package exchange;

import java.io.IOException;

public class OutputExchange {
	private WriteClass runPrint = null;
	
	public OutputExchange() {
		runPrint = new WriteClass();
	}
	
	public void outputUSD(int moneyKRW, int moneyUSD) throws IOException {
		int dollar100 = moneyUSD / ConstantValue.bill100;
		int dollar50 = moneyUSD % ConstantValue.bill100 / ConstantValue.bill50;
		int dollar20 = moneyUSD % ConstantValue.bill50 / ConstantValue.bill20;
		int dollar10 = (moneyUSD % ConstantValue.bill50 - 
				(ConstantValue.bill20*(moneyUSD % ConstantValue.bill50 / ConstantValue.bill20))) / ConstantValue.bill10;
		int dollar5 = moneyUSD % ConstantValue.bill10 / ConstantValue.bill5;
		int dollar2 = moneyUSD % ConstantValue.bill5 / ConstantValue.bill2;
		int dollar1	= (moneyUSD % ConstantValue.bill5 - 
				(2*(moneyUSD % ConstantValue.bill5 / ConstantValue.bill2))) / ConstantValue.bill1;
		
		printUSD(moneyUSD, dollar100, dollar50, dollar20, dollar10, dollar5, dollar2, dollar1);
		runPrint.writeUSD(moneyKRW, moneyUSD, dollar100, dollar50, dollar20, dollar10, dollar5, dollar2, dollar1);
	}
	
	public void outputEUR(int moneyKRW, int moneyEUR) throws IOException {
		int euro500 = moneyEUR / ConstantValue.bill500;
		int euro200 = moneyEUR % ConstantValue.bill500 / ConstantValue.bill200;
		int euro100 = (moneyEUR % ConstantValue.bill500 - 
				(ConstantValue.bill200*(moneyEUR % ConstantValue.bill500 / ConstantValue.bill200))) / ConstantValue.bill100;
		int euro50 = moneyEUR % ConstantValue.bill100 / ConstantValue.bill50;
		int euro20 = moneyEUR % ConstantValue.bill50 / ConstantValue.bill20;
		int euro10 = (moneyEUR % ConstantValue.bill50 - 
				(ConstantValue.bill20*(moneyEUR % ConstantValue.bill50 / ConstantValue.bill20))) / ConstantValue.bill10;
		int euro5	= moneyEUR % ConstantValue.bill10 / ConstantValue.bill5;
		
		printEUR(moneyEUR, euro500, euro200, euro100, euro50, euro20, euro10, euro5);
		runPrint.writeEUR(moneyKRW, moneyEUR, euro500, euro200, euro100, euro50, euro20, euro10, euro5);
	}
	
	public void outputJPY(int moneyKRW, int moneyJPY) throws IOException {
		int yen10000 = moneyJPY / ConstantValue.bill10000;
		int yen5000 = moneyJPY % ConstantValue.bill10000 / ConstantValue.bill5000;
		int yen2000 = moneyJPY % ConstantValue.bill5000 / ConstantValue.bill2000;
		int yen1000 = (moneyJPY % ConstantValue.bill5000 - 
				(ConstantValue.bill2000*(moneyJPY % ConstantValue.bill5000 / ConstantValue.bill2000))) / ConstantValue.bill1000;
		
		printJPY(moneyJPY, yen10000, yen5000, yen2000, yen1000);
		runPrint.writeJPY(moneyKRW, moneyJPY, yen10000, yen5000, yen2000, yen1000);
	}
	
	public void outputKRW(int change) throws IOException {
		int won10000 = change / ConstantValue.bill10000;
		int won5000 = change % ConstantValue.bill10000 / ConstantValue.bill5000;
		int won1000 = change % ConstantValue.bill5000 / ConstantValue.bill1000;
		int won500 = change % ConstantValue.bill1000 / ConstantValue.bill500;
		int won100 = change % ConstantValue.bill500 / ConstantValue.bill100;
		int won50 = change % ConstantValue.bill100 / ConstantValue.bill50;
		int won10 = change % ConstantValue.bill50 / ConstantValue.bill10;
		
		printKRW(change, won10000, won5000, won1000, won500, won100, won50, won10);
		runPrint.writeKRW(change, won10000, won5000, won1000, won500, won100, won50, won10);
	}
	
	private void printUSD(int moneyUSD, int dollar100, int dollar50, int dollar20, 
			int dollar10, int dollar5, int dollar2, int dollar1) {		
		System.out.printf("실제 환전 달러 : %d달러\n", moneyUSD);
		System.out.println("100달러 : " + dollar100 + "장");
		System.out.println("50달러 : " + dollar50 + "장");
		System.out.println("20달러 : " + dollar20 + "장");
		System.out.println("10달러 : " + dollar10 + "장");
		System.out.println("5달러 : " + dollar5 + "장");
		System.out.println("2달러 : " + dollar2 + "장");
		System.out.println("1달러 : " + dollar1 + "장");		
	}
	
	private void printEUR(int moneyEUR, int euro500, int euro200, int euro100, 
			int euro50,	int euro20, int euro10, int euro5) {
		System.out.printf("실제 환전 유로 : %d유로\n", moneyEUR);
		System.out.println("500유로 : " + euro500 + "장");
		System.out.println("200유로 : " + euro200 + "장");
		System.out.println("100유로 : " + euro100 + "장");
		System.out.println("50유로 : " + euro50 + "장");
		System.out.println("20유로 : " + euro20 + "장");
		System.out.println("10유로 : " + euro10 + "장");
		System.out.println("5유로 : " + euro5 + "장");
	}
	
	private void printJPY(int moneyJPY, int yen10000, int yen5000, int yen2000, int yen1000) {
		System.out.printf("실제 환전 엔 : %d엔\n", moneyJPY);
		System.out.println("10000엔 : " + yen10000 + "장");
		System.out.println("5000엔 : " + yen5000 + "장");
		System.out.println("2000엔 : " + yen2000 + "장");
		System.out.println("1000엔 : " + yen1000 + "장");
	}
		
	private void printKRW(int change, int won10000, int won5000, int won1000, 
			int won500,	int won100, int won50, int won10) {
		System.out.println("\n거스름돈 : " + change + "원");
		System.out.println("10000원 : " + won10000 + "장");
		System.out.println("5000원 : " + won5000 + "장");
		System.out.println("1000원 : " + won1000 + "장");
		System.out.println("500원 : " + won500 + "개");
		System.out.println("100원 : " + won100 + "개");
		System.out.println("50원 : " + won50 + "개");
		System.out.println("10원 : " + won10 + "개");
		System.out.println("------------------------------");
	}
	
	public void printErrorMessage(int errorCode) {
		switch(errorCode) {
			case ConstantValue.ERR_BALANCE_USD:
				System.out.print("달러 ");
				break;
			case ConstantValue.ERR_BALANCE_EUR:
				System.out.print("유로 ");
				break;
			case ConstantValue.ERR_BALANCE_JPY:
				System.out.print("엔화 ");
				break;
		}
		System.out.println("보유 금액이 부족합니다.");
	}
	
	public void printRemainUSD(int remainUSD) {
		System.out.println("달러 잔액 : " + remainUSD + " 달러");
	}
	
	public void printRemainEUR(int remainEUR) {
		System.out.println("유로 잔액 : " + remainEUR + " 유로");
	}
	
	public void printRemainJPY(int remainJPY) {
		System.out.println("엔화 잔액 : " + remainJPY + " 엔");
	}
}