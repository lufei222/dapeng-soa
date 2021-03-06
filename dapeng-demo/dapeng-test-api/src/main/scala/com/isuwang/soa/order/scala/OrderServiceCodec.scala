package com.isuwang.soa.order.scala
        import com.isuwang.soa.user.scala.domain.serializer._;import com.isuwang.soa.price.scala.domain.serializer._;import com.isuwang.soa.order.scala.domain.serializer._;import com.github.dapeng.soa.scala.domain.serializer._;import com.isuwang.soa.settle.scala.domain.serializer._;

        import com.github.dapeng.core._
        import com.github.dapeng.org.apache.thrift._
        import com.github.dapeng.org.apache.thrift.protocol._
        import com.github.dapeng.core.definition._

        /**
        * Autogenerated by Dapeng-Code-Generator (2.0.0)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/
        object OrderServiceCodec {

        
            case class createOrder_args(order:com.isuwang.soa.order.scala.domain.Order)

            case class createOrder_result()

            class CreateOrder_argsSerializer extends BeanSerializer[createOrder_args]{
            
      @throws[TException]
      override def read(iprot: TProtocol): createOrder_args = {

        var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var order: com.isuwang.soa.order.scala.domain.Order = null
        

      while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT => order = 
          new com.isuwang.soa.order.scala.domain.serializer.OrderSerializer().read(iprot)
        
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = createOrder_args(order = order)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: createOrder_args, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("createOrder_args"))

      
            {
            val elem0 = bean.order 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("order", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, 1.asInstanceOf[Short]))
            
          new com.isuwang.soa.order.scala.domain.serializer.OrderSerializer().write(elem0, oprot)
        
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: createOrder_args): Unit = {
      
              if(bean.order == null)
              throw new SoaException(SoaCode.NotNull, "order字段不允许为空")
            
                if(bean.order != null)
                new com.isuwang.soa.order.scala.domain.serializer.OrderSerializer().validate(bean.order)
              
    }
    

            override def toString(bean: createOrder_args): String = if(bean == null)  "null" else bean.toString
            }

            class CreateOrder_resultSerializer extends BeanSerializer[createOrder_result]{

            @throws[TException]
            override def read(iprot: TProtocol): createOrder_result = {

              var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
              iprot.readStructBegin

              

              while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

                schemeField = iprot.readFieldBegin

                schemeField.id match {
                    case 0 =>
                       schemeField.`type` match {
                          case com.github.dapeng.org.apache.thrift.protocol.TType.VOID =>  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                  }
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }

                iprot.readFieldEnd
              }

              iprot.readStructEnd
              val bean = createOrder_result()
              validate(bean)

              bean
            }

            
      @throws[TException]
      override def write(bean: createOrder_result, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("createOrder_result"))

      
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
            
      @throws[TException]
      override def validate(bean: createOrder_result): Unit = {
      
    }
    

            override def toString(bean: createOrder_result): String = if(bean == null)  "null" else bean.toString
          }

            class createOrder extends SoaFunctionDefinition.Sync[com.isuwang.soa.order.scala.service.OrderService, createOrder_args, createOrder_result]("createOrder", new CreateOrder_argsSerializer(), new CreateOrder_resultSerializer()){

            @throws[TException]
            def apply(iface: com.isuwang.soa.order.scala.service.OrderService, args: createOrder_args):createOrder_result = {

              val _result = iface.createOrder(args.order)
              createOrder_result( )
            }
          }
          
            case class getOrderById_args(orderId:Int)

            case class getOrderById_result(success:com.isuwang.soa.order.scala.domain.Order)

            class GetOrderById_argsSerializer extends BeanSerializer[getOrderById_args]{
            
      @throws[TException]
      override def read(iprot: TProtocol): getOrderById_args = {

        var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var orderId: Int = 0
        

      while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.I32 => orderId = iprot.readI32
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = getOrderById_args(orderId = orderId)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: getOrderById_args, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getOrderById_args"))

      
            {
            val elem0 = bean.orderId 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("orderId", com.github.dapeng.org.apache.thrift.protocol.TType.I32, 1.asInstanceOf[Short]))
            oprot.writeI32(elem0)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: getOrderById_args): Unit = {
      
    }
    

            override def toString(bean: getOrderById_args): String = if(bean == null)  "null" else bean.toString
            }

            class GetOrderById_resultSerializer extends BeanSerializer[getOrderById_result]{

            @throws[TException]
            override def read(iprot: TProtocol): getOrderById_result = {

              var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
              iprot.readStructBegin

              var success : com.isuwang.soa.order.scala.domain.Order = null

              while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

                schemeField = iprot.readFieldBegin

                schemeField.id match {
                    case 0 =>
                       schemeField.`type` match {
                          case com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT =>  success = 
          new com.isuwang.soa.order.scala.domain.serializer.OrderSerializer().read(iprot)
        
                          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                  }
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }

                iprot.readFieldEnd
              }

              iprot.readStructEnd
              val bean = getOrderById_result(success)
              validate(bean)

              bean
            }

            
      @throws[TException]
      override def write(bean: getOrderById_result, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getOrderById_result"))

      
            {
            val elem0 = bean.success 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, 0.asInstanceOf[Short]))
            
          new com.isuwang.soa.order.scala.domain.serializer.OrderSerializer().write(elem0, oprot)
        
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
            
      @throws[TException]
      override def validate(bean: getOrderById_result): Unit = {
      
              if(bean.success == null)
              throw new SoaException(SoaCode.NotNull, "success字段不允许为空")
            
                if(bean.success != null)
                new com.isuwang.soa.order.scala.domain.serializer.OrderSerializer().validate(bean.success)
              
    }
    

            override def toString(bean: getOrderById_result): String = if(bean == null)  "null" else bean.toString
          }

            class getOrderById extends SoaFunctionDefinition.Sync[com.isuwang.soa.order.scala.service.OrderService, getOrderById_args, getOrderById_result]("getOrderById", new GetOrderById_argsSerializer(), new GetOrderById_resultSerializer()){

            @throws[TException]
            def apply(iface: com.isuwang.soa.order.scala.service.OrderService, args: getOrderById_args):getOrderById_result = {

              val _result = iface.getOrderById(args.orderId)
              getOrderById_result(_result )
            }
          }
          

        case class getServiceMetadata_args()

        case class getServiceMetadata_result(success: String)

        class GetServiceMetadata_argsSerializer extends BeanSerializer[getServiceMetadata_args] {

          @throws[TException]
          override def read(iprot: TProtocol): getServiceMetadata_args = {

            iprot.readStructBegin

            var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null

            while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
              schemeField = iprot.readFieldBegin
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
              iprot.readFieldEnd
            }

            iprot.readStructEnd

            val bean = getServiceMetadata_args()
            validate(bean)

            bean
          }

          @throws[TException]
          override def write(bean: getServiceMetadata_args, oproto: TProtocol): Unit = {
            validate(bean)
            oproto.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_args"))

            oproto.writeFieldStop
            oproto.writeStructEnd
          }

          @throws[TException]
          override def validate(bean: getServiceMetadata_args): Unit = {}

          override def toString(bean: getServiceMetadata_args): String = if (bean == null) "null" else bean.toString
        }



        class GetServiceMetadata_resultSerializer extends BeanSerializer[getServiceMetadata_result] {
          @throws[TException]
          override def read(iprot: TProtocol): getServiceMetadata_result = {
            iprot.readStructBegin

            var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null

            var success: String = null

            while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
              schemeField = iprot.readFieldBegin

              schemeField.id match {
                case 0 =>
                schemeField.`type` match {
                  case com.github.dapeng.org.apache.thrift.protocol.TType.STRING => success = iprot.readString
                  case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }
                case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
              }
              iprot.readFieldEnd
            }

            iprot.readStructEnd
            val bean = getServiceMetadata_result(success)
            validate(bean)

            bean
          }

          @throws[TException]
          override def write(bean: getServiceMetadata_result, oproto: TProtocol): Unit = {
            validate(bean)
            oproto.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_result"))

            oproto.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, 0.asInstanceOf[Short]))
            oproto.writeString(bean.success)
            oproto.writeFieldEnd

            oproto.writeFieldStop
            oproto.writeStructEnd
          }

          @throws[TException]
          override def validate(bean: getServiceMetadata_result): Unit = {
            if (bean.success == null)
            throw new SoaException(SoaCode.NotNull, "success字段不允许为空")
          }

          override def toString(bean: getServiceMetadata_result): String = if (bean == null) "null" else bean.toString

        }



  class getServiceMetadata extends SoaFunctionDefinition.Sync[com.isuwang.soa.order.scala.service.OrderService, getServiceMetadata_args, getServiceMetadata_result](
  "getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer()) {


      @throws[TException]
      override def apply(iface: com.isuwang.soa.order.scala.service.OrderService, args: getServiceMetadata_args): getServiceMetadata_result = {

              val source = scala.io.Source.fromInputStream(OrderServiceCodec.getClass.getClassLoader.getResourceAsStream("com.isuwang.soa.order.service.OrderService.xml"))
              val success = source.mkString
              source.close
              getServiceMetadata_result(success)

      }
      }

      class Processor(iface: com.isuwang.soa.order.scala.service.OrderService, ifaceClass: Class[com.isuwang.soa.order.scala.service.OrderService] ) extends
        SoaServiceDefinition(iface,classOf[com.isuwang.soa.order.scala.service.OrderService], Processor.getProcessMap)

        object Processor{

          type PF = SoaFunctionDefinition[com.isuwang.soa.order.scala.service.OrderService, _, _]

          def getProcessMap(): java.util.Map[String, PF] = {
             val map = new java.util.HashMap[String, PF]()
            map.put("createOrder", new createOrder)
              map.put("getOrderById", new getOrderById)
              
            map.put("getServiceMetadata", new getServiceMetadata)
            map
          }

        }
        }
      