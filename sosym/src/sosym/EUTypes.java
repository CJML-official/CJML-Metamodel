/**
 */
package sosym;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EU Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sosym.SosymPackage#getEUTypes()
 * @model
 * @generated
 */
public enum EUTypes implements Enumerator {
	/**
	 * The '<em><b>Customer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOMER(0, "customer", "customer"),

	/**
	 * The '<em><b>User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_VALUE
	 * @generated
	 * @ordered
	 */
	USER(1, "user", "user"),

	/**
	 * The '<em><b>Citizen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITIZEN_VALUE
	 * @generated
	 * @ordered
	 */
	CITIZEN(2, "citizen", "citizen"),

	/**
	 * The '<em><b>Patient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT(3, "patient", "patient"),

	/**
	 * The '<em><b>Employee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPLOYEE_VALUE
	 * @generated
	 * @ordered
	 */
	EMPLOYEE(4, "employee", "employee");

	/**
	 * The '<em><b>Customer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER
	 * @model name="customer"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOMER_VALUE = 0;

	/**
	 * The '<em><b>User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER
	 * @model name="user"
	 * @generated
	 * @ordered
	 */
	public static final int USER_VALUE = 1;

	/**
	 * The '<em><b>Citizen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITIZEN
	 * @model name="citizen"
	 * @generated
	 * @ordered
	 */
	public static final int CITIZEN_VALUE = 2;

	/**
	 * The '<em><b>Patient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT
	 * @model name="patient"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_VALUE = 3;

	/**
	 * The '<em><b>Employee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPLOYEE
	 * @model name="employee"
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE_VALUE = 4;

	/**
	 * An array of all the '<em><b>EU Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EUTypes[] VALUES_ARRAY =
		new EUTypes[] {
			CUSTOMER,
			USER,
			CITIZEN,
			PATIENT,
			EMPLOYEE,
		};

	/**
	 * A public read-only list of all the '<em><b>EU Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EUTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EU Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EUTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EUTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EU Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EUTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EUTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EU Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EUTypes get(int value) {
		switch (value) {
			case CUSTOMER_VALUE: return CUSTOMER;
			case USER_VALUE: return USER;
			case CITIZEN_VALUE: return CITIZEN;
			case PATIENT_VALUE: return PATIENT;
			case EMPLOYEE_VALUE: return EMPLOYEE;
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
	private EUTypes(int value, String name, String literal) {
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
	
} //EUTypes
