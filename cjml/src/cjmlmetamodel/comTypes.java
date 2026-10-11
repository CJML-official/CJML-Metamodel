/**
 */
package cjmlmetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>com Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cjmlmetamodel.CjmlmetamodelPackage#getcomTypes()
 * @model
 * @generated
 */
public enum comTypes implements Enumerator {
	/**
	 * The '<em><b>Unicast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNICAST_VALUE
	 * @generated
	 * @ordered
	 */
	UNICAST(0, "unicast", "unicast"),

	/**
	 * The '<em><b>Multicast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTICAST_VALUE
	 * @generated
	 * @ordered
	 */
	MULTICAST(1, "multicast", "multicast"),

	/**
	 * The '<em><b>Broadcast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROADCAST_VALUE
	 * @generated
	 * @ordered
	 */
	BROADCAST(2, "broadcast", "broadcast");

	/**
	 * The '<em><b>Unicast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNICAST
	 * @model name="unicast"
	 * @generated
	 * @ordered
	 */
	public static final int UNICAST_VALUE = 0;

	/**
	 * The '<em><b>Multicast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTICAST
	 * @model name="multicast"
	 * @generated
	 * @ordered
	 */
	public static final int MULTICAST_VALUE = 1;

	/**
	 * The '<em><b>Broadcast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROADCAST
	 * @model name="broadcast"
	 * @generated
	 * @ordered
	 */
	public static final int BROADCAST_VALUE = 2;

	/**
	 * An array of all the '<em><b>com Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final comTypes[] VALUES_ARRAY =
		new comTypes[] {
			UNICAST,
			MULTICAST,
			BROADCAST,
		};

	/**
	 * A public read-only list of all the '<em><b>com Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<comTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>com Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static comTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			comTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>com Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static comTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			comTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>com Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static comTypes get(int value) {
		switch (value) {
			case UNICAST_VALUE: return UNICAST;
			case MULTICAST_VALUE: return MULTICAST;
			case BROADCAST_VALUE: return BROADCAST;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private comTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //comTypes
