package org.omg.IOP;


/**
* org/omg/IOP/TAG_ORB_TYPE.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u201/12322/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Sunday, December 16, 2018 12:15:06 AM MST
*/

public interface TAG_ORB_TYPE
{

  /**
     * It is often useful in the real world to be able to identify the 
     * particular kind of ORB an object reference is coming from, to work 
     * around problems with that particular ORB, or exploit shared 
     * efficiencies. 
     * <p>
     * The <code>TAG_ORB_TYPE</code> component has an associated value of 
     * type unsigned long (Java long), encoded as a CDR encapsulation, 
     * designating an ORB type ID allocated by the OMG for the ORB type of the 
     * originating ORB. Anyone may register any ORB types by submitting 
     * a short (one-paragraph) description of the ORB type to the OMG, 
     * and will receive a new ORB type ID in return. A list of ORB type 
     * descriptions and values will be made available on the OMG web server. 
     * <p>
     * The <code>TAG_ORB_TYPE</code> component can appear at most once in 
     * any IOR profile. For profiles supporting IIOP 1.1 or greater, it 
     * is optionally present.
     */
  public static final int value = (int)(0L);
}
