/**
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext.language.impl;

import com.bmstu.iptables.xtext.language.ChainPart;
import com.bmstu.iptables.xtext.language.LanguagePackage;
import com.bmstu.iptables.xtext.language.PolicyType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.bmstu.iptables.xtext.language.impl.ChainPartImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link com.bmstu.iptables.xtext.language.impl.ChainPartImpl#getProt <em>Prot</em>}</li>
 *   <li>{@link com.bmstu.iptables.xtext.language.impl.ChainPartImpl#getOpt <em>Opt</em>}</li>
 *   <li>{@link com.bmstu.iptables.xtext.language.impl.ChainPartImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.bmstu.iptables.xtext.language.impl.ChainPartImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChainPartImpl extends MinimalEObjectImpl.Container implements ChainPart
{
  /**
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final PolicyType TARGET_EDEFAULT = PolicyType.DROP;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected PolicyType target = TARGET_EDEFAULT;

  /**
   * The default value of the '{@link #getProt() <em>Prot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProt()
   * @generated
   * @ordered
   */
  protected static final String PROT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProt() <em>Prot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProt()
   * @generated
   * @ordered
   */
  protected String prot = PROT_EDEFAULT;

  /**
   * The default value of the '{@link #getOpt() <em>Opt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpt()
   * @generated
   * @ordered
   */
  protected static final String OPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpt() <em>Opt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpt()
   * @generated
   * @ordered
   */
  protected String opt = OPT_EDEFAULT;

  /**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected String source = SOURCE_EDEFAULT;

  /**
   * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected static final String DESTINATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected String destination = DESTINATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChainPartImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LanguagePackage.Literals.CHAIN_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PolicyType getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(PolicyType newTarget)
  {
    PolicyType oldTarget = target;
    target = newTarget == null ? TARGET_EDEFAULT : newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.CHAIN_PART__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProt()
  {
    return prot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProt(String newProt)
  {
    String oldProt = prot;
    prot = newProt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.CHAIN_PART__PROT, oldProt, prot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpt()
  {
    return opt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpt(String newOpt)
  {
    String oldOpt = opt;
    opt = newOpt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.CHAIN_PART__OPT, oldOpt, opt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(String newSource)
  {
    String oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.CHAIN_PART__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(String newDestination)
  {
    String oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.CHAIN_PART__DESTINATION, oldDestination, destination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LanguagePackage.CHAIN_PART__TARGET:
        return getTarget();
      case LanguagePackage.CHAIN_PART__PROT:
        return getProt();
      case LanguagePackage.CHAIN_PART__OPT:
        return getOpt();
      case LanguagePackage.CHAIN_PART__SOURCE:
        return getSource();
      case LanguagePackage.CHAIN_PART__DESTINATION:
        return getDestination();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LanguagePackage.CHAIN_PART__TARGET:
        setTarget((PolicyType)newValue);
        return;
      case LanguagePackage.CHAIN_PART__PROT:
        setProt((String)newValue);
        return;
      case LanguagePackage.CHAIN_PART__OPT:
        setOpt((String)newValue);
        return;
      case LanguagePackage.CHAIN_PART__SOURCE:
        setSource((String)newValue);
        return;
      case LanguagePackage.CHAIN_PART__DESTINATION:
        setDestination((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LanguagePackage.CHAIN_PART__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case LanguagePackage.CHAIN_PART__PROT:
        setProt(PROT_EDEFAULT);
        return;
      case LanguagePackage.CHAIN_PART__OPT:
        setOpt(OPT_EDEFAULT);
        return;
      case LanguagePackage.CHAIN_PART__SOURCE:
        setSource(SOURCE_EDEFAULT);
        return;
      case LanguagePackage.CHAIN_PART__DESTINATION:
        setDestination(DESTINATION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LanguagePackage.CHAIN_PART__TARGET:
        return target != TARGET_EDEFAULT;
      case LanguagePackage.CHAIN_PART__PROT:
        return PROT_EDEFAULT == null ? prot != null : !PROT_EDEFAULT.equals(prot);
      case LanguagePackage.CHAIN_PART__OPT:
        return OPT_EDEFAULT == null ? opt != null : !OPT_EDEFAULT.equals(opt);
      case LanguagePackage.CHAIN_PART__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
      case LanguagePackage.CHAIN_PART__DESTINATION:
        return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (target: ");
    result.append(target);
    result.append(", prot: ");
    result.append(prot);
    result.append(", opt: ");
    result.append(opt);
    result.append(", source: ");
    result.append(source);
    result.append(", destination: ");
    result.append(destination);
    result.append(')');
    return result.toString();
  }

} //ChainPartImpl
