package client;

import asynchronousBean.AsynchBean;

import javax.ejb.EJB;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsynchClient {
    @EJB
    AsynchBean asynchBean;

    public AsynchClient() throws ExecutionException, InterruptedException {
/***
        The client would make a call to modelStockPrices() then execute some other code without
        waiting for modelStockPrices() to complete. At some point it would request Future by
        making a blocking call, get(), as in the following code snippet:*/
        // Asynchronous call
        Future<String> myFutureStockToBuy = asynchBean.modelStockPrices();
        // Some other cde that is executed immediately without
        // waiting for modelStockPrices() to complete goes here
        // Sometime later the client's code makes a blocking call and starts
        // waiting for the result of modelStockPrices()
        String stockRecommendations = myFutureStockToBuy.get();
    }
}
