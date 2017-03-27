/**
 * generated by Xtext 2.10.0
 */
package com.arm.cmsis.pack.debugseq.debugSeq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.Sequence#getName <em>Name</em>}</li>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.Sequence#getDisable <em>Disable</em>}</li>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.Sequence#getPname <em>Pname</em>}</li>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.Sequence#getInfo <em>Info</em>}</li>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.Sequence#getCodeblocks <em>Codeblocks</em>}</li>
 * </ul>
 *
 * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends EObject
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
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getSequence_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.Sequence#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Disable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disable</em>' attribute.
   * @see #setDisable(long)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getSequence_Disable()
   * @model
   * @generated
   */
  long getDisable();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.Sequence#getDisable <em>Disable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Disable</em>' attribute.
   * @see #getDisable()
   * @generated
   */
  void setDisable(long value);

  /**
   * Returns the value of the '<em><b>Pname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pname</em>' attribute.
   * @see #setPname(String)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getSequence_Pname()
   * @model
   * @generated
   */
  String getPname();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.Sequence#getPname <em>Pname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pname</em>' attribute.
   * @see #getPname()
   * @generated
   */
  void setPname(String value);

  /**
   * Returns the value of the '<em><b>Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Info</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Info</em>' attribute.
   * @see #setInfo(String)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getSequence_Info()
   * @model
   * @generated
   */
  String getInfo();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.Sequence#getInfo <em>Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Info</em>' attribute.
   * @see #getInfo()
   * @generated
   */
  void setInfo(String value);

  /**
   * Returns the value of the '<em><b>Codeblocks</b></em>' containment reference list.
   * The list contents are of type {@link com.arm.cmsis.pack.debugseq.debugSeq.CodeBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Codeblocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Codeblocks</em>' containment reference list.
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getSequence_Codeblocks()
   * @model containment="true"
   * @generated
   */
  EList<CodeBlock> getCodeblocks();

} // Sequence
