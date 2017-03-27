/**
 * generated by Xtext 2.10.0
 */
package com.arm.cmsis.pack.debugseq.debugSeq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.VariableDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.VariableDeclaration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends Statement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getVariableDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.VariableDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getVariableDeclaration_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.VariableDeclaration#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // VariableDeclaration
