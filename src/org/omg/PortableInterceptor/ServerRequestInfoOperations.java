package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ServerRequestInfoOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u201/12322/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Sunday, December 16, 2018 12:15:06 AM MST
*/


/**
   * Request Information, accessible to server-side request interceptors.
   * <p>
   * Some attributes and operations on <code>ServerRequestInfo</code> are not 
   * valid at all interception points.  The following table shows the validity 
   * of each attribute or operation.  If it is not valid, attempting to access 
   * it will result in a <code>BAD_INV_ORDER</code> being thrown with a 
   * standard minor code of 14.
   * <p>
   *
   *
   * <table border=1 summary="Shows the validity of each attribute or operation">
   *   <thead>
   *     <tr>
   *       <th>&nbsp;</th>
   *       <th id="rec_req_ser_con" valign="bottom">receive_request_<br>service_contexts</th>
   *       <th id="rec_req"  valign="bottom">receive_request</th>
   *       <th id="send_rep" valign="bottom">send_reply</th>
   *       <th id="send_exc" valign="bottom">send_exception</th>
   *       <th id="send_oth" valign="bottom">send_other</th>
   *     </tr>
   *   </thead>
   *  <tbody>
   *
   *
   * <tr>
   *   <td id="ri" colspan=6><i>Inherited from RequestInfo:</i></td>
   * </tr>
   *
   * <tr><th id="req_id"><p align="left">request_id</p></th>
   * <td headers="ri req_id rec_req_ser_con">yes</td> 
   * <td headers="ri req_id rec_req">yes</td> 
   * <td headers="ri req_id send_rep">yes</td> 
   * <td headers="ri req_id send_exc">yes</td> 
   * <td headers="ri req_id send_oth">yes</td></tr>
   *
   * <tr><th id="op"><p align="left">operation</p></th>
   * <td headers="ri op rec_req_ser_con">yes</td> 
   * <td headers="ri op rec_req">yes</td> 
   * <td headers="ri op send_rep">yes</td> 
   * <td headers="ri op send_exc">yes</td> 
   * <td headers="ri op send_oth">yes</td></tr>
   *
   * <tr><th id="args"><p align="left">arguments</p></th>
   * <td headers="ri args rec_req_ser_con">no </td> 
   * <td headers="ri args rec_req">yes<sub>1</sub></td>
   * <td headers="ri args send_rep">yes</td> 
   * <td headers="ri args send_exc">no<sub>2</sub></td>
   * <td headers="ri args send_oth">no<sub>2</sub>
   * </td></tr>
   *
   * <tr><th id="exps"><p align="left">exceptions</p></th>
   * <td headers="ri exps rec_req_ser_con">no </td> 
   * <td headers="ri exps rec_req">yes</td> 
   * <td headers="ri exps send_rep">yes</td> 
   * <td headers="ri exps send_exc">yes</td> 
   * <td headers="ri exps send_oth">yes</td></tr>
   *
   * <tr><th id="contexts"><p align="left">contexts</p></th>
   * <td headers="ri contexts rec_req_ser_con">no </td> 
   * <td headers="ri contexts rec_req">yes</td> 
   * <td headers="ri contexts send_rep">yes</td> 
   * <td headers="ri contexts send_exc">yes</td> 
   * <td headers="ri contexts send_oth">yes</td></tr>
   *
   * <tr><th id="op_con"><p align="left">operation_context</p></th>
   * <td headers="ri op_con rec_req_ser_con">no </td> 
   * <td headers="ri op_con rec_req">yes</td> 
   * <td headers="ri op_con send_rep">yes</td> 
   * <td headers="ri op_con send_exc">no </td> 
   * <td headers="ri op_con send_oth">no </td>
   * </tr>
   * 
   * <tr><th id="result"><p align="left">result</p></th>
   * <td headers="ri result rec_req_ser_con">no </td> 
   * <td headers="ri result rec_req">no </td> 
   * <td headers="ri result send_rep">yes</td> 
   * <td headers="ri result send_exc">no </td> 
   * <td headers="ri result send_oth">no </td>
   * </tr>
   *
   * <tr><th id="res_ex"><p align="left">response_expected</p></th>
   * <td headers="ri res_ex rec_req_ser_con">yes</td> 
   * <td headers="ri res_ex rec_req">yes</td> 
   * <td headers="ri res_ex send_rep">yes</td> 
   * <td headers="ri res_ex send_exc">yes</td> 
   * <td headers="ri res_ex send_oth">yes</td></tr>
   *
   * <tr><th id="syn_scp"><p align="left">sync_scope</p></th>
   * <td headers="ri syn_scp rec_req_ser_con">yes</td> 
   * <td headers="ri syn_scp rec_req">yes</td> 
   * <td headers="ri syn_scp send_rep">yes</td> 
   * <td headers="ri syn_scp send_exc">yes</td> 
   * <td headers="ri syn_scp send_oth">yes</td></tr>
   * 
   *    <tr><td><b>request_id</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>operation</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>arguments</b></td>
   *    <td>no </td> <td>yes<sub>1</sub</td> 
   *                              <td>yes</td> <td>no<sub>2</sub></td> 
   *                                                        <td>no<sub>2</sub>
   *                                                        </td></tr>
   * 
   *    <tr><td><b>exceptions</b></td>
   *    <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>contexts</b></td>
   *    <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>operation_context</b></td>
   *    <td>no </td> <td>yes</td> <td>yes</td> <td>no </td> <td>no </td></tr>
   * 
   *    <tr><td><b>result</b></td>
   *    <td>no </td> <td>no </td> <td>yes</td> <td>no </td> <td>no </td></tr>
   * 
   *    <tr><td><b>response_expected</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>sync_scope</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>reply_status</b></td>
   *    <td>no </td> <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>forward_reference</b></td>
   *    <td>no </td> <td>no </td> <td>no </td> <td>no </td> <td>yes<sub>2</sub>
   * 								</td></tr>
   * 
   *    <tr><td><b>get_slot</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>get_request_service_context</b></td>
   *    <td>yes</td> <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>get_reply_service_context</b></td>
   *    <td>no </td> <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr>
   *      <td colspan=6><i>ServerRequestInfo-specific:</i></td>
   *    </tr>
   * 
   *    <tr><td><b>sending_exception</b></td>
   *    <td>no </td> <td>no </td> <td>no </td> <td>yes</td> <td>no </td></tr>
   * 
   *    <tr><td><b>object_id</b></td>
   *    <td>no </td> <td>yes</td> <td>yes</td> <td>yes<sub>3</sub></td> 
   * 						       <td>yes<sub>3</sub>
   * 						                </td></tr>
   * 
   *    <tr><td><b>adapter_id</b></td>
   *    <td>no </td> <td>yes</td> <td>yes</td> <td>yes<sub>3</sub></td> 
   * 						       <td>yes<sub>3</sub>
   * 								</td></tr>
   * 
   *    <tr><td><b>server_id</b></td>
   *    <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   *
   *    <tr><td><b>orb_id</b></td>
   *    <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   *
   *    <tr><td><b>adapter_name</b></td>
   *    <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   *
   *    <tr><td><b>target_most_derived_interface</b></td>
   *    <td>no </td> <td>yes</td> <td>no<sub>4</sub></td> 
   * 					  <td>no<sub>4</sub></td> 
   * 						       <td>no<sub>4</sub>
   * 							       </td></tr>
   * 
   *    <tr><td><b>get_server_policy</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>set_slot</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>target_is_a</b></td>
   *    <td>no </td> <td>yes</td> <td>no<sub>4</sub></td> 
   * 					  <td>no<sub>4</sub></td> 
   * 						       <td>no<sub>4</sub>
   * 							       </td></tr>
   * 
   *    <tr><td><b>add_reply_service_context</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   *   </tbody>
   * </table>
   *
   * <ol>
   *   <li>When <code>ServerRequestInfo</code> is passed to 
   *       <code>receive_request</code>, there is an entry in the list for 
   *       every argument, whether in, inout, or out. But only the in and 
   *       inout arguments will be available.</li>
   *   <li>If the <code>reply_status</code> attribute is not 
   *       <code>LOCATION_FORWARD</code>, accessing this attribute will throw
   *       <code>BAD_INV_ORDER</code> with a standard minor code of 14.</li>
   *   <li>If the servant locator caused a location forward, or thrown an 
   *       exception, this attribute/operation may not be available in this 
   *       interception point. <code>NO_RESOURCES</code> with a standard minor 
   *       code of 1 will be thrown if it is not available.</li>
   *   <li>The operation is not available in this interception point because 
   *       the necessary information requires access to the target object's 
   *       servant, which may no longer be available to the ORB. For example, 
   *       if the object's adapter is a POA that uses a 
   *       <code>ServantLocator</code>, then the ORB invokes the interception 
   *       point after it calls <code>ServantLocator.postinvoke()</code></li>.
   * </ol>
   *
   * @see ServerRequestInterceptor
   */
public interface ServerRequestInfoOperations  extends org.omg.PortableInterceptor.RequestInfoOperations
{

  /**
     * Returns an any which contains the exception to be returned to 
     * the client. 
     * <p>
     * If the exception is a user exception which cannot be inserted into 
     * an any (e.g., it is unknown or the bindings don't provide the 
     * <code>TypeCode</code>), then this attribute will be an any 
     * containing the system exception <code>UNKNOWN</code> with a 
     * standard minor code of 1.
     *
     * @see <a href="package-summary.html#unimpl">
     *     <code>PortableInterceptor</code> package comments for 
     *     limitations / unimplemented features</a>
     */
  org.omg.CORBA.Any sending_exception ();

  /**
     * Returns the opaque <code>object_id</code> describing the target of 
     * the operation invocation.
     */
  byte[] object_id ();

  /** 
     * Returns the opaque identifier for the object adapter.
     */
  byte[] adapter_id ();

  /**
     * Returns the server ID that was specified on ORB::init using the -ORBServerId
     * argument.
     */
  String server_id ();

  /** 
     * Returns the ID that was used to create the ORB.
     */
  String orb_id ();

  /** 
     * Returns the sequence of strings that identifies the object
     * adapter instance that is handling this request.
     */
  String[] adapter_name ();

  /**
     * Returns the repository id for the most derived interface of the 
     * servant.
     */
  String target_most_derived_interface ();

  /**
     * Returns the policy in effect for this operation for the given 
     * policy type. The returned <code>CORBA.Policy</code> object shall 
     * only be a policy whose type was registered via 
     * <code>register_policy_factory</code>. 
     * 
     * @param type The <code>CORBA.PolicyType</code> which specifies the 
     *     policy to be returned. 
     * @return The <code>CORBA.Policy</code> obtained with the given 
     *     policy type.
     * @exception INV_POLICY thrown, with a standard minor code of 2, if
     *     a policy for the given type was not registered via 
     *     <code>register_policy_factory</code>.
     * @see ORBInitInfo#register_policy_factory
     */
  org.omg.CORBA.Policy get_server_policy (int type);

  /**
     * Allows an Interceptor to set a slot in the 
     * <code>PortableInterceptor.Current</code> that is in the scope of 
     * the request. If data already exists in that slot, it will be 
     * overwritten. 
     * 
     * @param id The id of the slot. 
     * @param data The data, in the form of an any, to store in that slot.
     * @exception InvalidSlot thrown if the ID does not define an allocated 
     *     slot. 
     * @see Current
     */
  void set_slot (int id, org.omg.CORBA.Any data) throws org.omg.PortableInterceptor.InvalidSlot;

  /**
     * Returns true if the servant is the given repository id, 
     * false if it is not. 
     *
     * @param id The caller wants to know if the servant is this 
     *     repository id. 
     * @return Is the servant the given RepositoryId?
     */
  boolean target_is_a (String id);

  /**
     * Allows Interceptors to add service contexts to the request. 
     * <p>
     * There is no declaration of the order of the service contexts. 
     * They may or may not appear in the order that they are added. 
     *
     * @param service_context The <code>IOP.ServiceContext</code> to add to 
     *     the reply. 
     * @param replace Indicates the behavior of this operation when a 
     *     service context already exists with the given ID. If false, 
     *     then <code>BAD_INV_ORDER</code> with a standard minor code of 15 
     *     is thrown. If true, then the existing service context is 
     *     replaced by the new one.
     * @exception BAD_INV_ORDER thrown, with a standard minor code of 15, if
     *     replace is false and a service context already exists with the
     *     given ID.
     */
  void add_reply_service_context (org.omg.IOP.ServiceContext service_context, boolean replace);
} // interface ServerRequestInfoOperations
