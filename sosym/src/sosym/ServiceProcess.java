/**
 */
package sosym;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.ServiceProcess#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getServiceProcess()
 * @model
 * @generated
 */
public interface ServiceProcess extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link sosym.JourneyGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see sosym.SosymPackage#getServiceProcess_Groups()
	 * @model required="true"
	 * @generated
	 */
	EList<JourneyGroup> getGroups();

} // ServiceProcess
