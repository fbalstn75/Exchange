package exchange;

import java.io.IOException;

public class RunExchange {
	private OutputExchange runOutput = null;
	
	public RunExchange() {
		runOutput = new OutputExchange();
	}
	
	private boolean checkBalanceUSD(int requestUSD) {
		if(requestUSD <= ConstantValue.BALANCE_USD) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean checkBalanceEUR(int requestEUR) {
		if(requestEUR <= ConstantValue.BALANCE_EUR) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean checkBalanceJPY(int requestJPY) {
		if(requestJPY <= ConstantValue.BALANCE_JPY) {
			return true;
		} else {
			return false;
		}
	}
	
	public void changeToUSD(int moneyKRW) throws IOException {
		double realUSD = moneyKRW/ConstantValue.currencyUSD;
		int moneyUSD = (int)realUSD;		
		if(checkBalanceUSD(moneyUSD)) {
			runOutput.outputUSD(moneyKRW, moneyUSD);			
			int change = (int)(((moneyKRW/ConstantValue.currencyUSD) % 1) * ConstantValue.currencyUSD) - 
					((int)(((moneyKRW/ConstantValue.currencyUSD) % 1) * ConstantValue.currencyUSD) % 10);			
			runOutput.outputKRW(change);
			ConstantValue.BALANCE_USD -= moneyUSD;
			int remainUSD = ConstantValue.BALANCE_USD;
			runOutput.printRemainUSD(remainUSD);
		} else {
			runOutput.printErrorMessage(ConstantValue.ERR_BALANCE_USD);
		}		
	}
	
	public void changeToEUR(int moneyKRW) throws IOException {		
		double realEUR = moneyKRW/ConstantValue.currencyEUR;
		int moneyEUR = (int)(realEUR) - (int)((realEUR) % 5);		
		if(checkBalanceEUR(moneyEUR)) {
			runOutput.outputEUR(moneyKRW, moneyEUR);			
		int change = (int)(((moneyKRW/ConstantValue.currencyEUR) % 5) * ConstantValue.currencyEUR) - 
				((int)(((moneyKRW/ConstantValue.currencyEUR) % 5) * ConstantValue.currencyEUR) % 10);	
		runOutput.outputKRW(change);
		ConstantValue.BALANCE_EUR -= moneyEUR;
		int remainEUR = ConstantValue.BALANCE_EUR;
		runOutput.printRemainEUR(remainEUR);
		} else {
			runOutput.printErrorMessage(ConstantValue.ERR_BALANCE_USD);
		}	
	}
	
	public void changeToJPY(int moneyKRW) throws IOException {	
		double realJPY = moneyKRW/ConstantValue.currencyJPY;
		int moneyJPY = (int)(realJPY) - (int)((realJPY) % 1000);			
		if(checkBalanceJPY(moneyJPY)) {
			runOutput.outputJPY(moneyKRW, moneyJPY);		
		int change = (int)(((moneyKRW/ConstantValue.currencyJPY) % 1000) * ConstantValue.currencyJPY) - 
				((int)(((moneyKRW/ConstantValue.currencyJPY) % 1000) * ConstantValue.currencyJPY) % 10);	
		runOutput.outputKRW(change);	
		ConstantValue.BALANCE_JPY -= moneyJPY;
		int remainJPY = ConstantValue.BALANCE_JPY;
		runOutput.printRemainJPY(remainJPY);
		} else {
			runOutput.printErrorMessage(ConstantValue.ERR_BALANCE_JPY);
		}	
	}
}