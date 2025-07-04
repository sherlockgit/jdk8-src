package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ORBPortInfoListHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u201/12322/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Sunday, December 16, 2018 12:15:03 AM MST
*/


/** A list of ORB and port information for a particular endpoint type.
    */
abstract public class ORBPortInfoListHelper
{
  private static String  _id = "IDL:PortableActivationIDL/ORBPortInfoList:1.0";

  public static void insert (org.omg.CORBA.Any a, com.sun.corba.se.PortableActivationIDL.ORBPortInfo[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.sun.corba.se.PortableActivationIDL.ORBPortInfo[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = com.sun.corba.se.PortableActivationIDL.ORBPortInfoHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (com.sun.corba.se.PortableActivationIDL.ORBPortInfoListHelper.id (), "ORBPortInfoList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.sun.corba.se.PortableActivationIDL.ORBPortInfo[] read (org.omg.CORBA.portable.InputStream istream)
  {
    com.sun.corba.se.PortableActivationIDL.ORBPortInfo value[] = null;
    int _len0 = istream.read_long ();
    value = new com.sun.corba.se.PortableActivationIDL.ORBPortInfo[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = com.sun.corba.se.PortableActivationIDL.ORBPortInfoHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.sun.corba.se.PortableActivationIDL.ORBPortInfo[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      com.sun.corba.se.PortableActivationIDL.ORBPortInfoHelper.write (ostream, value[_i0]);
  }

}
