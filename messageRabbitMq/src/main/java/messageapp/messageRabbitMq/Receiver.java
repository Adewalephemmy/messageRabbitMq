package messageapp.messageRabbitMq;

import java.util.concurrent.CountDownLatch;

public class Receiver {
	
	private CountDownLatch latch = new CountDownLatch(1);
	
	public void receiverMessage(String message)
	{
		System.out.println("Received <" + message + ">");
	    latch.countDown();
	}
	
	public CountDownLatch getLatch() {
	    return latch;
	  }
	
}
