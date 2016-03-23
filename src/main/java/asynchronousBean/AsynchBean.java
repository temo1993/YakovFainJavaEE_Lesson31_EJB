package asynchronousBean;

import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.concurrent.Future;
@Local
@Stateless
public class AsynchBean{
/***
    Prior to Java EE 7, it was not safe to create and start threads from the Java EE
    container, which was taking care of all multithreading issues for you. So asynchronous
    methods were introduced to start a parallel process and free the EJB for handling other
    clients’ requests.
    Just mark the bean’s method with the @Asynchronous annotation and have it return an
    object of type javax.ejb.AsyncResult, which is an implementation of the Future interface:*/
@Asynchronous
    public Future<String> modelStockPrices(){
        // Some lengthy calculations go here
        // ...
        return new AsyncResult<>("The best stock to buy is...");
    }

/*
    The Java EE 7 specification includes JSR 236 (Concurrency Utilities) that allows you to
    create threads from the application code. These threads are controlled by the Java EE
    container, so your application remains thread safe. In Java EE code, you can
    use javax.enterprise.concurrent.ManagedExecutorService, which is a peer of the Java
    SE ExecutorService. You can obtain the reference to the ManagedExecutorService using
    standard resource injection:
    @Resource(lookup="java:comp/DefaultManagedExecutorService")
    ManagedExecutorService myExecutor;
    The JNDI lookup is supported as well. After obtaining the reference to the instance of
    ManagedExecutorService, you can execute a task—the class that implements either
            Runnable or Callable interface; for example:
            myExecutor.execute(new Runnable(...));
    Future future = meExecutor.submit(new Callable(...));*/
}
