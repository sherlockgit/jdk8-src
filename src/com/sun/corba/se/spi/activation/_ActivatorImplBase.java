package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/_ActivatorImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u201/12322/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Sunday, December 16, 2018 12:15:03 AM MST
*/

public abstract class _ActivatorImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements com.sun.corba.se.spi.activation.Activator, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _ActivatorImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("active", new java.lang.Integer (0));
    _methods.put ("registerEndpoints", new java.lang.Integer (1));
    _methods.put ("getActiveServers", new java.lang.Integer (2));
    _methods.put ("activate", new java.lang.Integer (3));
    _methods.put ("shutdown", new java.lang.Integer (4));
    _methods.put ("install", new java.lang.Integer (5));
    _methods.put ("getORBNames", new java.lang.Integer (6));
    _methods.put ("uninstall", new java.lang.Integer (7));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  // A new ORB started server registers itself with the Activator
       case 0:  // activation/Activator/active
       {
         try {
           int serverId = com.sun.corba.se.spi.activation.ServerIdHelper.read (in);
           com.sun.corba.se.spi.activation.Server serverObj = com.sun.corba.se.spi.activation.ServerHelper.read (in);
           this.active (serverId, serverObj);
           out = $rh.createReply();
         } catch (com.sun.corba.se.spi.activation.ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.write (out, $ex);
         }
         break;
       }


  // Install a particular kind of endpoint
       case 1:  // activation/Activator/registerEndpoints
       {
         try {
           int serverId = com.sun.corba.se.spi.activation.ServerIdHelper.read (in);
           String orbId = com.sun.corba.se.spi.activation.ORBidHelper.read (in);
           com.sun.corba.se.spi.activation.EndPointInfo endPointInfo[] = com.sun.corba.se.spi.activation.EndpointInfoListHelper.read (in);
           this.registerEndpoints (serverId, orbId, endPointInfo);
           out = $rh.createReply();
         } catch (com.sun.corba.se.spi.activation.ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.write (out, $ex);
         } catch (com.sun.corba.se.spi.activation.NoSuchEndPoint $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.NoSuchEndPointHelper.write (out, $ex);
         } catch (com.sun.corba.se.spi.activation.ORBAlreadyRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ORBAlreadyRegisteredHelper.write (out, $ex);
         }
         break;
       }


  // list active servers
       case 2:  // activation/Activator/getActiveServers
       {
         int $result[] = null;
         $result = this.getActiveServers ();
         out = $rh.createReply();
         com.sun.corba.se.spi.activation.ServerIdsHelper.write (out, $result);
         break;
       }


  // If the server is not running, start it up.
       case 3:  // activation/Activator/activate
       {
         try {
           int serverId = com.sun.corba.se.spi.activation.ServerIdHelper.read (in);
           this.activate (serverId);
           out = $rh.createReply();
         } catch (com.sun.corba.se.spi.activation.ServerAlreadyActive $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerAlreadyActiveHelper.write (out, $ex);
         } catch (com.sun.corba.se.spi.activation.ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.write (out, $ex);
         } catch (com.sun.corba.se.spi.activation.ServerHeldDown $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerHeldDownHelper.write (out, $ex);
         }
         break;
       }


  // If the server is running, shut it down
       case 4:  // activation/Activator/shutdown
       {
         try {
           int serverId = com.sun.corba.se.spi.activation.ServerIdHelper.read (in);
           this.shutdown (serverId);
           out = $rh.createReply();
         } catch (com.sun.corba.se.spi.activation.ServerNotActive $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerNotActiveHelper.write (out, $ex);
         } catch (com.sun.corba.se.spi.activation.ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.write (out, $ex);
         }
         break;
       }


  // currently running, this method will activate it.
       case 5:  // activation/Activator/install
       {
         try {
           int serverId = com.sun.corba.se.spi.activation.ServerIdHelper.read (in);
           this.install (serverId);
           out = $rh.createReply();
         } catch (com.sun.corba.se.spi.activation.ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.write (out, $ex);
         } catch (com.sun.corba.se.spi.activation.ServerHeldDown $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerHeldDownHelper.write (out, $ex);
         } catch (com.sun.corba.se.spi.activation.ServerAlreadyInstalled $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerAlreadyInstalledHelper.write (out, $ex);
         }
         break;
       }


  // list all registered ORBs for a server
       case 6:  // activation/Activator/getORBNames
       {
         try {
           int serverId = com.sun.corba.se.spi.activation.ServerIdHelper.read (in);
           String $result[] = null;
           $result = this.getORBNames (serverId);
           out = $rh.createReply();
           com.sun.corba.se.spi.activation.ORBidListHelper.write (out, $result);
         } catch (com.sun.corba.se.spi.activation.ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.write (out, $ex);
         }
         break;
       }


  // After this hook completes, the server may still be running.
       case 7:  // activation/Activator/uninstall
       {
         try {
           int serverId = com.sun.corba.se.spi.activation.ServerIdHelper.read (in);
           this.uninstall (serverId);
           out = $rh.createReply();
         } catch (com.sun.corba.se.spi.activation.ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.write (out, $ex);
         } catch (com.sun.corba.se.spi.activation.ServerHeldDown $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerHeldDownHelper.write (out, $ex);
         } catch (com.sun.corba.se.spi.activation.ServerAlreadyUninstalled $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.spi.activation.ServerAlreadyUninstalledHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:activation/Activator:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _ActivatorImplBase
