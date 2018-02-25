/**
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext.language;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.bmstu.iptables.xtext.language.LanguagePackage
 * @generated
 */
public interface LanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LanguageFactory eINSTANCE = com.bmstu.iptables.xtext.language.impl.LanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Chain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chain</em>'.
   * @generated
   */
  Chain createChain();

  /**
   * Returns a new object of class '<em>Chain Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chain Part</em>'.
   * @generated
   */
  ChainPart createChainPart();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LanguagePackage getLanguagePackage();

} //LanguageFactory
