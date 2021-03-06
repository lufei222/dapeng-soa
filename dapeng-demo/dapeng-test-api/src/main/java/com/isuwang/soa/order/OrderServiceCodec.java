package com.isuwang.soa.order;
        import com.isuwang.soa.order.domain.serializer.*;import com.github.dapeng.soa.domain.serializer.*;import com.isuwang.soa.price.domain.serializer.*;import com.isuwang.soa.user.domain.serializer.*;import com.isuwang.soa.settle.domain.serializer.*;

        import com.github.dapeng.core.*;
        import com.github.dapeng.org.apache.thrift.*;
        import com.github.dapeng.org.apache.thrift.protocol.*;

        import com.github.dapeng.core.definition.SoaServiceDefinition;
        import com.github.dapeng.core.definition.SoaFunctionDefinition;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        /**
        * Autogenerated by Dapeng-Code-Generator (2.0.0)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/
        public class OrderServiceCodec {

        
            public static class createOrder_args {
            
                private com.isuwang.soa.order.domain.Order order;
                public com.isuwang.soa.order.domain.Order getOrder(){
                return this.order;
              }
                public void setOrder(com.isuwang.soa.order.domain.Order order){
                this.order = order;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("order").append("\":").append(this.order == null ? "null" : this.order.toString()).append(",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }

            public static class createOrder_result {

            
                  @Override
                  public String toString(){
                  return "{}";
                }
                
          }

            public static class CreateOrder_argsSerializer implements BeanSerializer<createOrder_args>{
            
      @Override
      public createOrder_args read(TProtocol iprot) throws TException{

      createOrder_args bean = new createOrder_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT){
              com.isuwang.soa.order.domain.Order elem0 = new com.isuwang.soa.order.domain.Order();
        elem0=new com.isuwang.soa.order.domain.serializer.OrderSerializer().read(iprot);
       bean.setOrder(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(createOrder_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("createOrder_args"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("order", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            com.isuwang.soa.order.domain.Order elem0 = bean.getOrder();
             new com.isuwang.soa.order.domain.serializer.OrderSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(createOrder_args bean) throws TException{
      
              if(bean.getOrder() == null)
              throw new SoaException(SoaCode.NotNull, "order字段不允许为空");
            
                if(bean.getOrder() != null)
                new com.isuwang.soa.order.domain.serializer.OrderSerializer().validate(bean.getOrder());
              
    }
    

            @Override
            public String toString(createOrder_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class CreateOrder_resultSerializer implements BeanSerializer<createOrder_result>{
            @Override
            public createOrder_result read(TProtocol iprot) throws TException{

              createOrder_result bean = new createOrder_result();
              com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.VOID){
                    
      com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }else{
                    com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(createOrder_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("createOrder_result"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(createOrder_result bean) throws TException{
      
    }
    

            @Override
            public String toString(createOrder_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class createOrder<I extends com.isuwang.soa.order.service.OrderService> extends SoaFunctionDefinition.Sync<I, createOrder_args, createOrder_result>
            {
              public createOrder()
              {
                super("createOrder", new CreateOrder_argsSerializer(),  new CreateOrder_resultSerializer());
              }

              @Override
              public createOrder_result apply(I iface, createOrder_args createOrder_args) throws SoaException
              {

                createOrder_result result = new createOrder_result();


                
                 iface.createOrder(createOrder_args.order);
                

                return result;

              }

            }
          
            public static class getOrderById_args {
            
                private Integer orderId;
                public Integer getOrderId(){
                return this.orderId;
              }
                public void setOrderId(Integer orderId){
                this.orderId = orderId;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("orderId").append("\":").append(orderId).append(",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }

            public static class getOrderById_result {

            
                  private com.isuwang.soa.order.domain.Order success;
                  public com.isuwang.soa.order.domain.Order getSuccess(){
                  return success;
                }

                  public void setSuccess(com.isuwang.soa.order.domain.Order success){
                  this.success = success;
                }


                  @Override
                  public String toString(){
                  StringBuilder stringBuilder = new StringBuilder("{");
                    
      stringBuilder.append("\"").append("success").append("\":").append(this.success == null ? "null" : this.success.toString()).append(",");
    
                    stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                    stringBuilder.append("}");

                  return stringBuilder.toString();
                }

                
          }

            public static class GetOrderById_argsSerializer implements BeanSerializer<getOrderById_args>{
            
      @Override
      public getOrderById_args read(TProtocol iprot) throws TException{

      getOrderById_args bean = new getOrderById_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setOrderId(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(getOrderById_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getOrderById_args"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("orderId", com.github.dapeng.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getOrderId();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(getOrderById_args bean) throws TException{
      
    }
    

            @Override
            public String toString(getOrderById_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class GetOrderById_resultSerializer implements BeanSerializer<getOrderById_result>{
            @Override
            public getOrderById_result read(TProtocol iprot) throws TException{

              getOrderById_result bean = new getOrderById_result();
              com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT){
                    com.isuwang.soa.order.domain.Order elem0 = new com.isuwang.soa.order.domain.Order();
        elem0=new com.isuwang.soa.order.domain.serializer.OrderSerializer().read(iprot);
       bean.setSuccess(elem0);
                  }else{
                    com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(getOrderById_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getOrderById_result"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, (short) 0));
            com.isuwang.soa.order.domain.Order elem0 = bean.getSuccess();
             new com.isuwang.soa.order.domain.serializer.OrderSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(getOrderById_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaCode.NotNull, "success字段不允许为空");
            
                if(bean.getSuccess() != null)
                new com.isuwang.soa.order.domain.serializer.OrderSerializer().validate(bean.getSuccess());
              
    }
    

            @Override
            public String toString(getOrderById_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class getOrderById<I extends com.isuwang.soa.order.service.OrderService> extends SoaFunctionDefinition.Sync<I, getOrderById_args, getOrderById_result>
            {
              public getOrderById()
              {
                super("getOrderById", new GetOrderById_argsSerializer(),  new GetOrderById_resultSerializer());
              }

              @Override
              public getOrderById_result apply(I iface, getOrderById_args getOrderById_args) throws SoaException
              {

                getOrderById_result result = new getOrderById_result();


                
                result.success = iface.getOrderById(getOrderById_args.orderId);
                

                return result;

              }

            }
          

        public static class getServiceMetadata_args {

          @Override
          public String toString() {
            return "{}";
          }
        }


        public static class getServiceMetadata_result {

          private String success;

          public String getSuccess() {
            return success;
          }

          public void setSuccess(String success) {
            this.success = success;
          }

          @Override
          public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");
              stringBuilder.append("\"").append("success").append("\":\"").append(this.success).append("\",");
              stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
              stringBuilder.append("}");

            return stringBuilder.toString();
          }
        }

        public static class GetServiceMetadata_argsSerializer implements BeanSerializer<getServiceMetadata_args> {

          @Override
          public getServiceMetadata_args read(TProtocol iprot) throws TException {

            getServiceMetadata_args bean =new getServiceMetadata_args();
            com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
                break;
              }
              switch (schemeField.id) {
                default:
                com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);

              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }


          @Override
          public void write(getServiceMetadata_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_args"));
            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_args bean) throws TException {}

          @Override
          public String toString(getServiceMetadata_args bean) {
            return bean == null ? "null" : bean.toString();
          }

        }

        public static class GetServiceMetadata_resultSerializer implements BeanSerializer<getServiceMetadata_result> {
          @Override
          public getServiceMetadata_result read(TProtocol iprot) throws TException {

            getServiceMetadata_result bean = new getServiceMetadata_result();
            com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
                break;
              }

              switch (schemeField.id) {
                case 0:  //SUCCESS
                if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING) {
                  bean.setSuccess(iprot.readString());
                } else {
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
                default:
                com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }

          @Override
          public void write(getServiceMetadata_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_result"));

            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 0));
            oprot.writeString(bean.getSuccess());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_result bean) throws TException {

            if (bean.getSuccess() == null)
            throw new SoaException(SoaCode.NotNull, "success字段不允许为空");
          }

          @Override
          public String toString(getServiceMetadata_result bean) {
            return bean == null ? "null" : bean.toString();
          }
        }

        public static class getServiceMetadata<I extends com.isuwang.soa.order.service.OrderService> extends SoaFunctionDefinition.Sync<I, getServiceMetadata_args, getServiceMetadata_result> {
          public getServiceMetadata() {
            super("getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
          }

          @Override
          public getServiceMetadata_result apply(I iface, getServiceMetadata_args args) {
            getServiceMetadata_result result = new getServiceMetadata_result();

            try (InputStreamReader isr = new InputStreamReader(OrderServiceCodec.class.getClassLoader().getResourceAsStream("com.isuwang.soa.order.service.OrderService.xml"));
            BufferedReader in = new BufferedReader(isr)) {
              int len = 0;
              StringBuilder str = new StringBuilder("");
              String line;
              while ((line = in.readLine()) != null) {

                if (len != 0) {
                  str.append("\r\n").append(line);
                } else {
                  str.append(line);
                }
                len++;
              }
              result.success = str.toString();

            } catch (Exception e) {
              e.printStackTrace();
              result.success = "";
            }

            return result;
          }

        }

        @SuppressWarnings("unchecked")
        public static class Processor<I extends com.isuwang.soa.order.service.OrderService> extends SoaServiceDefinition<com.isuwang.soa.order.service.OrderService>
        {

          public Processor(com.isuwang.soa.order.service.OrderService iface, Class<com.isuwang.soa.order.service.OrderService> ifaceClass)
          {
            super(iface, ifaceClass, buildMap(new java.util.HashMap<>()));
          }

          @SuppressWarnings("unchecked")
          private static <I extends com.isuwang.soa.order.service.OrderService> java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> buildMap(java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> processMap)
          {
            
                processMap.put("createOrder", new createOrder());
              
                processMap.put("getOrderById", new getOrderById());
              
            processMap.put("getServiceMetadata", new getServiceMetadata());
            return processMap;
          }
        }

      }
      