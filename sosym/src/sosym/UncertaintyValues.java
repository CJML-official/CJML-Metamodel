/**
 */
package sosym;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Uncertainty Values</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sosym.SosymPackage#getUncertaintyValues()
 * @model
 * @generated
 */
public enum UncertaintyValues implements Enumerator {
	/**
	 * The '<em><b>Uncertain Occurrence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCERTAIN_OCCURRENCE_VALUE
	 * @generated
	 * @ordered
	 */
	UNCERTAIN_OCCURRENCE(0, "uncertainOccurrence", "uncertainOccurrence"),

	/**
	 * The '<em><b>Uncertain No Of Occurrence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCERTAIN_NO_OF_OCCURRENCE_VALUE
	 * @generated
	 * @ordered
	 */
	UNCERTAIN_NO_OF_OCCURRENCE(1, "uncertainNoOfOccurrence", "uncertainNoOfOccurrence"),

	/**
	 * The '<em><b>Uncertain Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCERTAIN_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	UNCERTAIN_CHANNEL(2, "uncertainChannel", "uncertainChannel"),

	/**
	 * The '<em><b>Uncertain Initiator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCERTAIN_INITIATOR_VALUE
	 * @generated
	 * @ordered
	 */
	UNCERTAIN_INITIATOR(3, "uncertainInitiator", "uncertainInitiator");

	/**
	 * The '<em><b>Uncertain Occurrence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCERTAIN_OCCURRENCE
	 * @model name="uncertainOccurrence"
	 * @generated
	 * @ordered
	 */
	public static final int UNCERTAIN_OCCURRENCE_VALUE = 0;

	/**
	 * The '<em><b>Uncertain No Of Occurrence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCERTAIN_NO_OF_OCCURRENCE
	 * @model name="uncertainNoOfOccurrence"
	 * @generated
	 * @ordered
	 */
	public static final int UNCERTAIN_NO_OF_OCCURRENCE_VALUE = 1;

	/**
	 * The '<em><b>Uncertain Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCERTAIN_CHANNEL
	 * @model name="uncertainChannel"
	 * @generated
	 * @ordered
	 */
	public static final int UNCERTAIN_CHANNEL_VALUE = 2;

	/**
	 * The '<em><b>Uncertain Initiator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCERTAIN_INITIATOR
	 * @model name="uncertainInitiator"
	 * @generated
	 * @ordered
	 */
	public static final int UNCERTAIN_INITIATOR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Uncertainty Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UncertaintyValues[] VALUES_ARRAY =
		new UncertaintyValues[] {
			UNCERTAIN_OCCURRENCE,
			UNCERTAIN_NO_OF_OCCURRENCE,
			UNCERTAIN_CHANNEL,
			UNCERTAIN_INITIATOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Uncertainty Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UncertaintyValues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Uncertainty Values</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UncertaintyValues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UncertaintyValues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Uncertainty Values</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UncertaintyValues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UncertaintyValues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Uncertainty Values</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UncertaintyValues get(int value) {
		switch (value) {
			case UNCERTAIN_OCCURRENCE_VALUE: return UNCERTAIN_OCCURRENCE;
			case UNCERTAIN_NO_OF_OCCURRENCE_VALUE: return UNCERTAIN_NO_OF_OCCURRENCE;
			case UNCERTAIN_CHANNEL_VALUE: return UNCERTAIN_CHANNEL;
			case UNCERTAIN_INITIATOR_VALUE: return UNCERTAIN_INITIATOR;
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
	private UncertaintyValues(int value, String name, String literal) {
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
	
} //UncertaintyValues
