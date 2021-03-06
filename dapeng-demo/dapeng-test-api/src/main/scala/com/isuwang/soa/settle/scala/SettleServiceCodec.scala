package com.isuwang.soa.settle.scala
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
        object SettleServiceCodec {

        
            case class createSettle_args(settle:com.isuwang.soa.settle.scala.domain.Settle)

            case class createSettle_result()

            class CreateSettle_argsSerializer extends BeanSerializer[createSettle_args]{
            
      @throws[TException]
      override def read(iprot: TProtocol): createSettle_args = {

        var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var settle: com.isuwang.soa.settle.scala.domain.Settle = null
        

      while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT => settle = 
          new com.isuwang.soa.settle.scala.domain.serializer.SettleSerializer().read(iprot)
        
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = createSettle_args(settle = settle)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: createSettle_args, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("createSettle_args"))

      
            {
            val elem0 = bean.settle 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("settle", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, 1.asInstanceOf[Short]))
            
          new com.isuwang.soa.settle.scala.domain.serializer.SettleSerializer().write(elem0, oprot)
        
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: createSettle_args): Unit = {
      
              if(bean.settle == null)
              throw new SoaException(SoaCode.NotNull, "settle字段不允许为空")
            
                if(bean.settle != null)
                new com.isuwang.soa.settle.scala.domain.serializer.SettleSerializer().validate(bean.settle)
              
    }
    

            override def toString(bean: createSettle_args): String = if(bean == null)  "null" else bean.toString
            }

            class CreateSettle_resultSerializer extends BeanSerializer[createSettle_result]{

            @throws[TException]
            override def read(iprot: TProtocol): createSettle_result = {

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
              val bean = createSettle_result()
              validate(bean)

              bean
            }

            
      @throws[TException]
      override def write(bean: createSettle_result, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("createSettle_result"))

      
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
            
      @throws[TException]
      override def validate(bean: createSettle_result): Unit = {
      
    }
    

            override def toString(bean: createSettle_result): String = if(bean == null)  "null" else bean.toString
          }

            class createSettle extends SoaFunctionDefinition.Sync[com.isuwang.soa.settle.scala.service.SettleService, createSettle_args, createSettle_result]("createSettle", new CreateSettle_argsSerializer(), new CreateSettle_resultSerializer()){

            @throws[TException]
            def apply(iface: com.isuwang.soa.settle.scala.service.SettleService, args: createSettle_args):createSettle_result = {

              val _result = iface.createSettle(args.settle)
              createSettle_result( )
            }
          }
          
            case class getSettleById_args(settleId:Int)

            case class getSettleById_result(success:com.isuwang.soa.settle.scala.domain.Settle)

            class GetSettleById_argsSerializer extends BeanSerializer[getSettleById_args]{
            
      @throws[TException]
      override def read(iprot: TProtocol): getSettleById_args = {

        var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var settleId: Int = 0
        

      while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.I32 => settleId = iprot.readI32
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = getSettleById_args(settleId = settleId)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: getSettleById_args, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getSettleById_args"))

      
            {
            val elem0 = bean.settleId 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("settleId", com.github.dapeng.org.apache.thrift.protocol.TType.I32, 1.asInstanceOf[Short]))
            oprot.writeI32(elem0)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: getSettleById_args): Unit = {
      
    }
    

            override def toString(bean: getSettleById_args): String = if(bean == null)  "null" else bean.toString
            }

            class GetSettleById_resultSerializer extends BeanSerializer[getSettleById_result]{

            @throws[TException]
            override def read(iprot: TProtocol): getSettleById_result = {

              var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
              iprot.readStructBegin

              var success : com.isuwang.soa.settle.scala.domain.Settle = null

              while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

                schemeField = iprot.readFieldBegin

                schemeField.id match {
                    case 0 =>
                       schemeField.`type` match {
                          case com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT =>  success = 
          new com.isuwang.soa.settle.scala.domain.serializer.SettleSerializer().read(iprot)
        
                          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                  }
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }

                iprot.readFieldEnd
              }

              iprot.readStructEnd
              val bean = getSettleById_result(success)
              validate(bean)

              bean
            }

            
      @throws[TException]
      override def write(bean: getSettleById_result, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getSettleById_result"))

      
            {
            val elem0 = bean.success 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, 0.asInstanceOf[Short]))
            
          new com.isuwang.soa.settle.scala.domain.serializer.SettleSerializer().write(elem0, oprot)
        
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
            
      @throws[TException]
      override def validate(bean: getSettleById_result): Unit = {
      
              if(bean.success == null)
              throw new SoaException(SoaCode.NotNull, "success字段不允许为空")
            
                if(bean.success != null)
                new com.isuwang.soa.settle.scala.domain.serializer.SettleSerializer().validate(bean.success)
              
    }
    

            override def toString(bean: getSettleById_result): String = if(bean == null)  "null" else bean.toString
          }

            class getSettleById extends SoaFunctionDefinition.Sync[com.isuwang.soa.settle.scala.service.SettleService, getSettleById_args, getSettleById_result]("getSettleById", new GetSettleById_argsSerializer(), new GetSettleById_resultSerializer()){

            @throws[TException]
            def apply(iface: com.isuwang.soa.settle.scala.service.SettleService, args: getSettleById_args):getSettleById_result = {

              val _result = iface.getSettleById(args.settleId)
              getSettleById_result(_result )
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



  class getServiceMetadata extends SoaFunctionDefinition.Sync[com.isuwang.soa.settle.scala.service.SettleService, getServiceMetadata_args, getServiceMetadata_result](
  "getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer()) {


      @throws[TException]
      override def apply(iface: com.isuwang.soa.settle.scala.service.SettleService, args: getServiceMetadata_args): getServiceMetadata_result = {

              val source = scala.io.Source.fromInputStream(SettleServiceCodec.getClass.getClassLoader.getResourceAsStream("com.isuwang.soa.settle.service.SettleService.xml"))
              val success = source.mkString
              source.close
              getServiceMetadata_result(success)

      }
      }

      class Processor(iface: com.isuwang.soa.settle.scala.service.SettleService, ifaceClass: Class[com.isuwang.soa.settle.scala.service.SettleService] ) extends
        SoaServiceDefinition(iface,classOf[com.isuwang.soa.settle.scala.service.SettleService], Processor.getProcessMap)

        object Processor{

          type PF = SoaFunctionDefinition[com.isuwang.soa.settle.scala.service.SettleService, _, _]

          def getProcessMap(): java.util.Map[String, PF] = {
             val map = new java.util.HashMap[String, PF]()
            map.put("createSettle", new createSettle)
              map.put("getSettleById", new getSettleById)
              
            map.put("getServiceMetadata", new getServiceMetadata)
            map
          }

        }
        }
      