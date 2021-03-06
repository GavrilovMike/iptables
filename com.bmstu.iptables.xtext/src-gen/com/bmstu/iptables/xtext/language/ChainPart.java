/**
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext.language;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.bmstu.iptables.xtext.language.ChainPart#getTarget <em>Target</em>}</li>
 *   <li>{@link com.bmstu.iptables.xtext.language.ChainPart#getProt <em>Prot</em>}</li>
 *   <li>{@link com.bmstu.iptables.xtext.language.ChainPart#getOpt <em>Opt</em>}</li>
 *   <li>{@link com.bmstu.iptables.xtext.language.ChainPart#getSource <em>Source</em>}</li>
 *   <li>{@link com.bmstu.iptables.xtext.language.ChainPart#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see com.bmstu.iptables.xtext.language.LanguagePackage#getChainPart()
 * @model
 * @generated
 */
public interface ChainPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * The literals are from the enumeration {@link com.bmstu.iptables.xtext.language.PolicyType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see com.bmstu.iptables.xtext.language.PolicyType
   * @see #setTarget(PolicyType)
   * @see com.bmstu.iptables.xtext.language.LanguagePackage#getChainPart_Target()
   * @model
   * @generated
   */
  PolicyType getTarget();

  /**
   * Sets the value of the '{@link com.bmstu.iptables.xtext.language.ChainPart#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see com.bmstu.iptables.xtext.language.PolicyType
   * @see #getTarget()
   * @generated
   */
  void setTarget(PolicyType value);

  /**
   * Returns the value of the '<em><b>Prot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prot</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prot</em>' attribute.
   * @see #setProt(String)
   * @see com.bmstu.iptables.xtext.language.LanguagePackage#getChainPart_Prot()
   * @model
   * @generated
   */
  String getProt();

  /**
   * Sets the value of the '{@link com.bmstu.iptables.xtext.language.ChainPart#getProt <em>Prot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prot</em>' attribute.
   * @see #getProt()
   * @generated
   */
  void setProt(String value);

  /**
   * Returns the value of the '<em><b>Opt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt</em>' attribute.
   * @see #setOpt(String)
   * @see com.bmstu.iptables.xtext.language.LanguagePackage#getChainPart_Opt()
   * @model
   * @generated
   */
  String getOpt();

  /**
   * Sets the value of the '{@link com.bmstu.iptables.xtext.language.ChainPart#getOpt <em>Opt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt</em>' attribute.
   * @see #getOpt()
   * @generated
   */
  void setOpt(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see com.bmstu.iptables.xtext.language.LanguagePackage#getChainPart_Source()
   * @model
   * @generated
   */
  String getSource();

  /**
   * Sets the value of the '{@link com.bmstu.iptables.xtext.language.ChainPart#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(String value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' attribute.
   * @see #setDestination(String)
   * @see com.bmstu.iptables.xtext.language.LanguagePackage#getChainPart_Destination()
   * @model
   * @generated
   */
  String getDestination();

  /**
   * Sets the value of the '{@link com.bmstu.iptables.xtext.language.ChainPart#getDestination <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' attribute.
   * @see #getDestination()
   * @generated
   */
  void setDestination(String value);

} // ChainPart
