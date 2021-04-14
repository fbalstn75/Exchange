package exchange;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WriteClass {
	DecimalFormat df = new DecimalFormat ( "###,###,###,###,###" );
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
	
	public void writeUSD (int moneyKRW, int moneyUSD, int dollar100, int dollar50, int dollar20, 
			int dollar10, int dollar5, int dollar2, int dollar1) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\RYU\\Desktop\\Exchange.txt", true);
		String data = sdt.format(cal.getTime()) + "," + moneyKRW + ",USD," + moneyUSD + ",0,0,0,0,0,0," + dollar100 + "," 
				+ dollar50 + ","	+ dollar20	+ "," + dollar10 + "," + dollar5 + "," + dollar2 + "," + dollar1 + ",";
		fw.write(data);
		fw.close();
	}
	
	public void writeEUR(int moneyKRW, int moneyEUR, int euro500, int euro200, int euro100, 
			int euro50,	int euro20, int euro10, int euro5) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\RYU\\Desktop\\Exchange.txt", true);
		String data = sdt.format(cal.getTime()) + "," + moneyKRW + ",EUR," + moneyEUR + ",0,0,0,0," + euro500 + "," 
				+ euro200 + "," + euro100 + "," + euro50 + "," + euro20 + "," + euro10 + "," + euro5 +",0,0,";
		fw.write(data);
		fw.close();
	}
	
	public void writeJPY(int moneyKRW, int moneyJPY, int yen10000, int yen5000, int yen2000, int yen1000) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\RYU\\Desktop\\Exchange.txt", true);
		String data = sdt.format(cal.getTime()) + "," + moneyKRW + ",JPY," + moneyJPY + "," + yen10000 + "," 
				+ yen5000 + "," + yen2000 + "," + yen1000 + ",0,0,0,0,0,0,0,0,0,";
		fw.write(data);
		fw.close();
	}
	
	public void writeKRW(int change, int won10000, int won5000, int won1000, 
			int won500,	int won100, int won50, int won10) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\RYU\\Desktop\\Exchange.txt", true);
		String data = change + "," + won10000 + "," + won5000 + "," + won1000 
				+ "," + won500 + "," + won100 + "," + won50 + "," + won10 + "\n";
		fw.write(data);
		fw.close();
	}
}