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
		System.out.printf("?????? ?????? ?????? : %d??????\n", moneyUSD);
		System.out.println("100?????? : " + dollar100 + "???");
		System.out.println("50?????? : " + dollar50 + "???");
		System.out.println("20?????? : " + dollar20 + "???");
		System.out.println("10?????? : " + dollar10 + "???");
		System.out.println("5?????? : " + dollar5 + "???");
		System.out.println("2?????? : " + dollar2 + "???");
		System.out.println("1?????? : " + dollar1 + "???");		
	}
	
	private void printEUR(int moneyEUR, int euro500, int euro200, int euro100, 
			int euro50,	int euro20, int euro10, int euro5) {
		System.out.printf("?????? ?????? ?????? : %d??????\n", moneyEUR);
		System.out.println("500?????? : " + euro500 + "???");
		System.out.println("200?????? : " + euro200 + "???");
		System.out.println("100?????? : " + euro100 + "???");
		System.out.println("50?????? : " + euro50 + "???");
		System.out.println("20?????? : " + euro20 + "???");
		System.out.println("10?????? : " + euro10 + "???");
		System.out.println("5?????? : " + euro5 + "???");
	}
	
	private void printJPY(int moneyJPY, int yen10000, int yen5000, int yen2000, int yen1000) {
		System.out.printf("?????? ?????? ??? : %d???\n", moneyJPY);
		System.out.println("10000??? : " + yen10000 + "???");
		System.out.println("5000??? : " + yen5000 + "???");
		System.out.println("2000??? : " + yen2000 + "???");
		System.out.println("1000??? : " + yen1000 + "???");
	}
		
	private void printKRW(int change, int won10000, int won5000, int won1000, 
			int won500,	int won100, int won50, int won10) {
		System.out.println("\n???????????? : " + change + "???");
		System.out.println("10000??? : " + won10000 + "???");
		System.out.println("5000??? : " + won5000 + "???");
		System.out.println("1000??? : " + won1000 + "???");
		System.out.println("500??? : " + won500 + "???");
		System.out.println("100??? : " + won100 + "???");
		System.out.println("50??? : " + won50 + "???");
		System.out.println("10??? : " + won10 + "???");
		System.out.println("------------------------------");
	}
	
	public void printErrorMessage(int errorCode) {
		switch(errorCode) {
			case ConstantValue.ERR_BALANCE_USD:
				System.out.print("?????? ");
				break;
			case ConstantValue.ERR_BALANCE_EUR:
				System.out.print("?????? ");
				break;
			case ConstantValue.ERR_BALANCE_JPY:
				System.out.print("?????? ");
				break;
		}
		System.out.println("?????? ????????? ???????????????.");
	}
	
	public void printRemainUSD(int remainUSD) {
		System.out.println("?????? ?????? : " + remainUSD + " ??????");
	}
	
	public void printRemainEUR(int remainEUR) {
		System.out.println("?????? ?????? : " + remainEUR + " ??????");
	}
	
	public void printRemainJPY(int remainJPY) {
		System.out.println("?????? ?????? : " + remainJPY + " ???");
	}
}