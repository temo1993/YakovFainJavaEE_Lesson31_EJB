package ejb;

import javax.ejb.Remote;

@Remote
public interface Greeting{
	String sayHello();
}
