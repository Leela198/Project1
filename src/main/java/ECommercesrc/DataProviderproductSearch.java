package ECommercesrc;

import org.testng.annotations.DataProvider;

public class DataProviderproductSearch 
{
@DataProvider(name="productssearch")

public Object[][] m1()
{
	return new Object[][] {{"books"},{"shoes"},{"ricecooker"},{"jewellery"},{"handbags"},{"toys"},{"beauty"},{"nutrition"}};
}
}
