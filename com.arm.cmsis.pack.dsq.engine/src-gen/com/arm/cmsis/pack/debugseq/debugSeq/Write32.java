/**
 * generated by Xtext 2.10.0
 */
package com.arm.cmsis.pack.debugseq.debugSeq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write32</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.Write32#getAddr <em>Addr</em>}</li>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.Write32#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getWrite32()
 * @model
 * @generated
 */
public interface Write32 extends Expression
{
  /**
   * Returns the value of the '<em><b>Addr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Addr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addr</em>' containment reference.
   * @see #setAddr(Expression)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getWrite32_Addr()
   * @model containment="true"
   * @generated
   */
  Expression getAddr();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.Write32#getAddr <em>Addr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Addr</em>' containment reference.
   * @see #getAddr()
   * @generated
   */
  void setAddr(Expression value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(Expression)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getWrite32_Val()
   * @model containment="true"
   * @generated
   */
  Expression getVal();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.Write32#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(Expression value);

} // Write32
