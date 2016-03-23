package ejb;

import javax.ejb.Stateless;

@Stateless
public class HelloWorldLocalRemote implements Authorizable, Greeting {

     public String authorize(){
    	    return "The user is authorized!";
     }

/***
    The clients find remote beans by performing JNDI lookups. Because the remote client
    runs in different JVMs, all arguments of the remote methods must be serializable.*/
     public String sayHello(){
         return "Hello World!";
     }
}
