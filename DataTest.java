package packge2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest 
{
  @DataProvider 
  public Object[][] getData()
  {
	  Object[][] obj =new Object[3][2];
	  //1st row
	  obj[0][0]="Rahul";
	  obj[0][1]="Rohit";
	  //2nd row
	  obj[1][0]="virat";
	  obj[1][1]="Umesh";
	  //3rd row
	  obj[2][0]="Kaf";
	  obj[2][1]="Sachin";
	return obj;
			 
	 }
  @Test(dataProvider="getData")
  
  public void testData(String firstData , String secondData) {
	  
	  System.out.println(firstData + " , " + secondData);
	  
	  
	  
  }
  
}

