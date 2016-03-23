package ejb;

import javax.ejb.Remote;
import java.io.Serializable;

@Remote
public interface Greeting{
	String sayHello();
}
