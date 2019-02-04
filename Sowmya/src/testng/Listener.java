package testng;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+ " method started!");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The method "+ result.getName()+ " is successfully executed!");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The method "+ result.getName()+ " failed!");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
