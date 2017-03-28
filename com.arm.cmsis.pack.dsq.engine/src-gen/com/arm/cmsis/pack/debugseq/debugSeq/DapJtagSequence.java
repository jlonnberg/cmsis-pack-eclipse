/**
 * generated by Xtext 2.10.0
 */
package com.arm.cmsis.pack.debugseq.debugSeq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dap Jtag Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.DapJtagSequence#getCnt <em>Cnt</em>}</li>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.DapJtagSequence#getTms <em>Tms</em>}</li>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.DapJtagSequence#getTdi <em>Tdi</em>}</li>
 * </ul>
 *
 * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getDapJtagSequence()
 * @model
 * @generated
 */
public interface DapJtagSequence extends Expression
{
  /**
   * Returns the value of the '<em><b>Cnt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cnt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cnt</em>' containment reference.
   * @see #setCnt(Expression)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getDapJtagSequence_Cnt()
   * @model containment="true"
   * @generated
   */
  Expression getCnt();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.DapJtagSequence#getCnt <em>Cnt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cnt</em>' containment reference.
   * @see #getCnt()
   * @generated
   */
  void setCnt(Expression value);

  /**
   * Returns the value of the '<em><b>Tms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tms</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tms</em>' containment reference.
   * @see #setTms(Expression)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getDapJtagSequence_Tms()
   * @model containment="true"
   * @generated
   */
  Expression getTms();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.DapJtagSequence#getTms <em>Tms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tms</em>' containment reference.
   * @see #getTms()
   * @generated
   */
  void setTms(Expression value);

  /**
   * Returns the value of the '<em><b>Tdi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tdi</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tdi</em>' containment reference.
   * @see #setTdi(Expression)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getDapJtagSequence_Tdi()
   * @model containment="true"
   * @generated
   */
  Expression getTdi();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.DapJtagSequence#getTdi <em>Tdi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tdi</em>' containment reference.
   * @see #getTdi()
   * @generated
   */
  void setTdi(Expression value);

} // DapJtagSequence