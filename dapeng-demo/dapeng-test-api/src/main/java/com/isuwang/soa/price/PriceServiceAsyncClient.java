package com.isuwang.soa.price;

      import com.github.dapeng.core.*;
      import com.github.dapeng.org.apache.thrift.*;
      import java.util.concurrent.CompletableFuture;
      import java.util.concurrent.Future;
      import java.util.ServiceLoader;
      import com.isuwang.soa.price.PriceServiceAsyncCodec.*;
      import com.isuwang.soa.price.service.PriceServiceAsync;

      /**
       * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

      **/
      public class PriceServiceAsyncClient implements PriceServiceAsync{
      private final String serviceName;
      private final String version;

      private SoaConnectionPool pool;

      public PriceServiceAsyncClient() {
        this.serviceName = "com.isuwang.soa.price.service.PriceService";
        this.version = "1.0.0";

        ServiceLoader<SoaConnectionPoolFactory> factories = ServiceLoader.load(SoaConnectionPoolFactory.class);
        for (SoaConnectionPoolFactory factory: factories) {
          this.pool = factory.getPool();
          break;
        }
        this.pool.registerClientInfo(serviceName,version);
      }

      
          
            /**
            * 
            **/
            
              public CompletableFuture<Void> insertPrice(com.isuwang.soa.price.domain.Price price) throws SoaException{

              String methodName = "insertPrice";
              insertPrice_args insertPrice_args = new insertPrice_args();
              insertPrice_args.setPrice(price);
                

              CompletableFuture<insertPrice_result> response = (CompletableFuture<insertPrice_result>) pool.sendAsync(serviceName,version,"insertPrice",insertPrice_args, new InsertPrice_argsSerializer(), new InsertPrice_resultSerializer());

              
                  return response.thenApply((insertPrice_result result )->  null);
                
            }
            
          

        
          
            /**
            * 
            **/
            
              public CompletableFuture<java.util.List<com.isuwang.soa.price.domain.Price>> getPrices() throws SoaException{

              String methodName = "getPrices";
              getPrices_args getPrices_args = new getPrices_args();
              

              CompletableFuture<getPrices_result> response = (CompletableFuture<getPrices_result>) pool.sendAsync(serviceName,version,"getPrices",getPrices_args, new GetPrices_argsSerializer(), new GetPrices_resultSerializer());

              
                  
                      return response.thenApply((getPrices_result result )->  result.getSuccess());
                    
                
            }
            
          

        

      /**
      * getServiceMetadata
      **/
      public String getServiceMetadata() throws SoaException {
        String methodName = "getServiceMetadata";
        getServiceMetadata_args getServiceMetadata_args = new getServiceMetadata_args();
        getServiceMetadata_result response = pool.send(serviceName,version,methodName,getServiceMetadata_args, new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
        return response.getSuccess();
      }

    }
    