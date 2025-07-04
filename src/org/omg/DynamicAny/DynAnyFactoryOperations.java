package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynAnyFactoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u201/12322/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Sunday, December 16, 2018 12:15:04 AM MST
*/


/**
    * DynAny objects can be created by invoking operations on the DynAnyFactory object.
    * Generally there are only two ways to create a DynAny object:
    * <UL>
    * <LI>invoking an operation on an existing DynAny object
    * <LI>invoking an operation on a DynAnyFactory object
    * </UL>
    * A constructed DynAny object supports operations that enable the creation of new DynAny
    * objects encapsulating access to the value of some constituent.
    * DynAny objects also support the copy operation for creating new DynAny objects.
    * A reference to the DynAnyFactory object is obtained by calling ORB.resolve_initial_references()
    * with the identifier parameter set to the string constant "DynAnyFactory".
    * <P>Dynamic interpretation of an any usually involves creating a DynAny object using create_dyn_any()
    * as the first step. Depending on the type of the any, the resulting DynAny object reference can be narrowed
    * to a DynFixed, DynStruct, DynSequence, DynArray, DynUnion, DynEnum, or DynValue object reference.
    * <P>Dynamic creation of an any involves creating a DynAny object using create_dyn_any_from_type_code(),
    * passing the TypeCode associated with the value to be created. The returned reference is narrowed to one of
    * the complex types, such as DynStruct, if appropriate. Then, the value can be initialized by means of
    * invoking operations on the resulting object. Finally, the to_any operation can be invoked
    * to create an any value from the constructed DynAny.
    */
public interface DynAnyFactoryOperations 
{

  /**
        * Creates a new DynAny object from an any value.
        * A copy of the TypeCode associated with the any value is assigned to the resulting DynAny object.
        * The value associated with the DynAny object is a copy of the value in the original any.
        * The current position of the created DynAny is set to zero if the passed value has components,
        * to -1 otherwise
        *
        * @exception InconsistentTypeCode if value has a TypeCode with a TCKind of tk_Principal,
        * tk_native, or tk_abstract_interface
        */
  org.omg.DynamicAny.DynAny create_dyn_any (org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode;

  /**
        * Creates a DynAny from a TypeCode. Depending on the TypeCode, the created object may be of type DynAny,
        * or one of its derived types, such as DynStruct. The returned reference can be narrowed to the derived type.
        * In all cases, a DynAny constructed from a TypeCode has an initial default value.
        * The default values of basic types are:
        * <UL>
        * <LI>false for boolean
        * <LI>zero for numeric types
        * <LI>zero for types octet, char, and wchar
        * <LI>the empty string for string and wstring
        * <LI>null for object references
        * <LI>a type code with a TCKind value of tk_null for type codes
        * <LI>for any values, an any containing a type code with a TCKind value of tk_null type and no value
        * </UL>
        * For complex types, creation of the corresponding DynAny assigns a default value as follows:
        * <UL>
        * <LI>For DynSequence it sets the current position to -1 and creates an empty sequence.
        * <LI>For DynEnum it sets the current position to -1 and sets the value of the enumerator
        *     to the first enumerator value indicated by the TypeCode.
        * <LI>For DynFixed it sets the current position to -1 and sets the value zero.
        * <LI>For DynStruct it sets the current position to -1 for empty exceptions
        *     and to zero for all other TypeCodes. The members (if any) are (recursively) initialized
        *     to their default values.
        * <LI>For DynArray sets the current position to zero and (recursively) initializes elements
        *     to their default value.
        * <LI>For DynUnion sets the current position to zero. The discriminator value is set
        *     to a value consistent with the first named member of the union. That member is activated and (recursively)
        *     initialized to its default value.
        * <LI>For DynValue and DynValueBox it initializes to a null value.
        * </UL>
        */
  org.omg.DynamicAny.DynAny create_dyn_any_from_type_code (org.omg.CORBA.TypeCode type) throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode;
} // interface DynAnyFactoryOperations
