/**
 */
package sosym;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.Channel#getChannelName <em>Channel Name</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends EObject {
	/**
	 * Returns the value of the '<em><b>Channel Name</b></em>' attribute.
	 * The literals are from the enumeration {@link sosym.Channels}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Name</em>' attribute.
	 * @see sosym.Channels
	 * @see #setChannelName(Channels)
	 * @see sosym.SosymPackage#getChannel_ChannelName()
	 * @model
	 * @generated
	 */
	Channels getChannelName();

	/**
	 * Sets the value of the '{@link sosym.Channel#getChannelName <em>Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Name</em>' attribute.
	 * @see sosym.Channels
	 * @see #getChannelName()
	 * @generated
	 */
	void setChannelName(Channels value);

} // Channel
