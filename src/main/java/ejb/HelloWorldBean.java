package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ejb.HelloWorldBean
 */
@Stateless
@LocalBean
public class HelloWorldBean {

    /**
     * Default constructor. 
     */
    public HelloWorldBean() {
        // TODO Auto-generated constructor stub
    }
    
    public String sayHello(){
        return "Hello World!";
    }

}
