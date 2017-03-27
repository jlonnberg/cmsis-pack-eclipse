/**
 * generated by Xtext 2.10.0
 */
package com.arm.cmsis.pack.debugseq.debugSeq.impl;

import com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage;
import com.arm.cmsis.pack.debugseq.debugSeq.Expression;
import com.arm.cmsis.pack.debugseq.debugSeq.Write8;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write8</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.impl.Write8Impl#getAddr <em>Addr</em>}</li>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.impl.Write8Impl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Write8Impl extends ExpressionImpl implements Write8
{
  /**
   * The cached value of the '{@link #getAddr() <em>Addr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddr()
   * @generated
   * @ordered
   */
  protected Expression addr;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected Expression val;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Write8Impl()
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
    return DebugSeqPackage.Literals.WRITE8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getAddr()
  {
    return addr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAddr(Expression newAddr, NotificationChain msgs)
  {
    Expression oldAddr = addr;
    addr = newAddr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DebugSeqPackage.WRITE8__ADDR, oldAddr, newAddr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddr(Expression newAddr)
  {
    if (newAddr != addr)
    {
      NotificationChain msgs = null;
      if (addr != null)
        msgs = ((InternalEObject)addr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DebugSeqPackage.WRITE8__ADDR, null, msgs);
      if (newAddr != null)
        msgs = ((InternalEObject)newAddr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DebugSeqPackage.WRITE8__ADDR, null, msgs);
      msgs = basicSetAddr(newAddr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DebugSeqPackage.WRITE8__ADDR, newAddr, newAddr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal(Expression newVal, NotificationChain msgs)
  {
    Expression oldVal = val;
    val = newVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DebugSeqPackage.WRITE8__VAL, oldVal, newVal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(Expression newVal)
  {
    if (newVal != val)
    {
      NotificationChain msgs = null;
      if (val != null)
        msgs = ((InternalEObject)val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DebugSeqPackage.WRITE8__VAL, null, msgs);
      if (newVal != null)
        msgs = ((InternalEObject)newVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DebugSeqPackage.WRITE8__VAL, null, msgs);
      msgs = basicSetVal(newVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DebugSeqPackage.WRITE8__VAL, newVal, newVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DebugSeqPackage.WRITE8__ADDR:
        return basicSetAddr(null, msgs);
      case DebugSeqPackage.WRITE8__VAL:
        return basicSetVal(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DebugSeqPackage.WRITE8__ADDR:
        return getAddr();
      case DebugSeqPackage.WRITE8__VAL:
        return getVal();
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
      case DebugSeqPackage.WRITE8__ADDR:
        setAddr((Expression)newValue);
        return;
      case DebugSeqPackage.WRITE8__VAL:
        setVal((Expression)newValue);
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
      case DebugSeqPackage.WRITE8__ADDR:
        setAddr((Expression)null);
        return;
      case DebugSeqPackage.WRITE8__VAL:
        setVal((Expression)null);
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
      case DebugSeqPackage.WRITE8__ADDR:
        return addr != null;
      case DebugSeqPackage.WRITE8__VAL:
        return val != null;
    }
    return super.eIsSet(featureID);
  }

} //Write8Impl
