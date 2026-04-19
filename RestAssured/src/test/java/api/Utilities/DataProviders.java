package api.Utilities;

import java.io.IOException;
import org.testng.annotations.*;

public class DataProviders {

	@DataProvider(name="Data")
	public String[][] getAllData() throws IOException {
		
		String path = System.getProperty("user.dir") + "//TestData//Rest_TestData.xlsx";
		UtilityClass xl = new UtilityClass(path);

		int rowNum = xl.getRowCount("TestData");
		int colCount = xl.getCellCount("TestData", 1);

		String apidata[][] = new String[rowNum][colCount];

		for (int i = 1; i <= rowNum; i++) {
			for (int j = 0; j < colCount; j++) {
				apidata[i - 1][j] = xl.getCellData("TestData", i, j);
			}
		}

		return apidata;
	}

	@DataProvider(name="UserName")
	public String [] getUserNames() throws IOException 
	{
		String path = System.getProperty("user.dir")+"//TestData//Rest_TestData.xlsx";
		
		UtilityClass xl= new UtilityClass(path);
		
		int rowNum = xl.getRowCount("TestData");
		
		String apidata [] = new String [rowNum];
		
		for(int i=1;i<=rowNum;i++) 
		{
			apidata[i-1]= xl.getCellData("TestData", i, 1);
		}
 		
		return apidata;
	}
	
	
}
