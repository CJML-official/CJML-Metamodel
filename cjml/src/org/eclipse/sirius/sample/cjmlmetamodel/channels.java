/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>channels</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getchannels()
 * @model
 * @generated
 */
public enum channels implements Enumerator {
	/**
	 * The '<em><b>Telephone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELEPHONE_VALUE
	 * @generated
	 * @ordered
	 */
	TELEPHONE(0, "telephone", "telephone"),

	/**
	 * The '<em><b>Sms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMS_VALUE
	 * @generated
	 * @ordered
	 */
	SMS(1, "sms", "sms"),

	/**
	 * The '<em><b>Email</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL(2, "email", "email"),

	/**
	 * The '<em><b>Social Media Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_MEDIA_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SOCIAL_MEDIA_MESSAGE(3, "socialMediaMessage", "socialMediaMessage"), /**
	 * The '<em><b>Message Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_SERVICE(4, "messageService", "messageService"), /**
	 * The '<em><b>Chat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAT_VALUE
	 * @generated
	 * @ordered
	 */
	CHAT(5, "chat", "chat"), /**
	 * The '<em><b>Face To Face</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACE_TO_FACE_VALUE
	 * @generated
	 * @ordered
	 */
	FACE_TO_FACE(6, "faceToFace", "faceToFace"), /**
	 * The '<em><b>Internet Via PC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET_VIA_PC_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNET_VIA_PC(7, "internetViaPC", "internetViaPC"), /**
	 * The '<em><b>Internet Via Smart Phone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET_VIA_SMART_PHONE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNET_VIA_SMART_PHONE(8, "internetViaSmartPhone", "internetViaSmartPhone"), /**
	 * The '<em><b>Internet Via Tablet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET_VIA_TABLET_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNET_VIA_TABLET(9, "internetViaTablet", "internetViaTablet"), /**
	 * The '<em><b>App On PC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP_ON_PC_VALUE
	 * @generated
	 * @ordered
	 */
	APP_ON_PC(10, "appOnPC", "appOnPC"), /**
	 * The '<em><b>App On Smart Phone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP_ON_SMART_PHONE_VALUE
	 * @generated
	 * @ordered
	 */
	APP_ON_SMART_PHONE(11, "appOnSmartPhone", "appOnSmartPhone"), /**
	 * The '<em><b>App On Tablet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP_ON_TABLET_VALUE
	 * @generated
	 * @ordered
	 */
	APP_ON_TABLET(12, "appOnTablet", "appOnTablet"), /**
	 * The '<em><b>Internet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNET(13, "internet", "internet"), /**
	 * The '<em><b>Self Service Machine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF_SERVICE_MACHINE_VALUE
	 * @generated
	 * @ordered
	 */
	SELF_SERVICE_MACHINE(14, "selfServiceMachine", "selfServiceMachine"), /**
	 * The '<em><b>Letter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LETTER_VALUE
	 * @generated
	 * @ordered
	 */
	LETTER(15, "letter", "letter"), /**
	 * The '<em><b>Package Delivery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_DELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE_DELIVERY(16, "packageDelivery", "packageDelivery"), /**
	 * The '<em><b>Fax Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAX_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	FAX_MESSAGE(17, "faxMessage", "faxMessage"), /**
	 * The '<em><b>Shop Counter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOP_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	SHOP_COUNTER(18, "shopCounter", "shopCounter"), /**
	 * The '<em><b>Service Desk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_DESK_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_DESK(19, "serviceDesk", "serviceDesk"), /**
	 * The '<em><b>Payment Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_CHANNEL(20, "paymentChannel", "paymentChannel"), /**
	 * The '<em><b>Unknown Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN_CHANNEL(21, "unknownChannel", "unknownChannel");

	/**
	 * The '<em><b>Telephone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELEPHONE
	 * @model name="telephone"
	 * @generated
	 * @ordered
	 */
	public static final int TELEPHONE_VALUE = 0;

	/**
	 * The '<em><b>Sms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMS
	 * @model name="sms"
	 * @generated
	 * @ordered
	 */
	public static final int SMS_VALUE = 1;

	/**
	 * The '<em><b>Email</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL
	 * @model name="email"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_VALUE = 2;

	/**
	 * The '<em><b>Social Media Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_MEDIA_MESSAGE
	 * @model name="socialMediaMessage"
	 * @generated
	 * @ordered
	 */
	public static final int SOCIAL_MEDIA_MESSAGE_VALUE = 3;

	/**
	 * The '<em><b>Message Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_SERVICE
	 * @model name="messageService"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_SERVICE_VALUE = 4;

	/**
	 * The '<em><b>Chat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAT
	 * @model name="chat"
	 * @generated
	 * @ordered
	 */
	public static final int CHAT_VALUE = 5;

	/**
	 * The '<em><b>Face To Face</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACE_TO_FACE
	 * @model name="faceToFace"
	 * @generated
	 * @ordered
	 */
	public static final int FACE_TO_FACE_VALUE = 6;

	/**
	 * The '<em><b>Internet Via PC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET_VIA_PC
	 * @model name="internetViaPC"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNET_VIA_PC_VALUE = 7;

	/**
	 * The '<em><b>Internet Via Smart Phone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET_VIA_SMART_PHONE
	 * @model name="internetViaSmartPhone"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNET_VIA_SMART_PHONE_VALUE = 8;

	/**
	 * The '<em><b>Internet Via Tablet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET_VIA_TABLET
	 * @model name="internetViaTablet"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNET_VIA_TABLET_VALUE = 9;

	/**
	 * The '<em><b>App On PC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP_ON_PC
	 * @model name="appOnPC"
	 * @generated
	 * @ordered
	 */
	public static final int APP_ON_PC_VALUE = 10;

	/**
	 * The '<em><b>App On Smart Phone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP_ON_SMART_PHONE
	 * @model name="appOnSmartPhone"
	 * @generated
	 * @ordered
	 */
	public static final int APP_ON_SMART_PHONE_VALUE = 11;

	/**
	 * The '<em><b>App On Tablet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP_ON_TABLET
	 * @model name="appOnTablet"
	 * @generated
	 * @ordered
	 */
	public static final int APP_ON_TABLET_VALUE = 12;

	/**
	 * The '<em><b>Internet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET
	 * @model name="internet"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNET_VALUE = 13;

	/**
	 * The '<em><b>Self Service Machine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF_SERVICE_MACHINE
	 * @model name="selfServiceMachine"
	 * @generated
	 * @ordered
	 */
	public static final int SELF_SERVICE_MACHINE_VALUE = 14;

	/**
	 * The '<em><b>Letter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LETTER
	 * @model name="letter"
	 * @generated
	 * @ordered
	 */
	public static final int LETTER_VALUE = 15;

	/**
	 * The '<em><b>Package Delivery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_DELIVERY
	 * @model name="packageDelivery"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_DELIVERY_VALUE = 16;

	/**
	 * The '<em><b>Fax Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAX_MESSAGE
	 * @model name="faxMessage"
	 * @generated
	 * @ordered
	 */
	public static final int FAX_MESSAGE_VALUE = 17;

	/**
	 * The '<em><b>Shop Counter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOP_COUNTER
	 * @model name="shopCounter"
	 * @generated
	 * @ordered
	 */
	public static final int SHOP_COUNTER_VALUE = 18;

	/**
	 * The '<em><b>Service Desk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_DESK
	 * @model name="serviceDesk"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DESK_VALUE = 19;

	/**
	 * The '<em><b>Payment Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_CHANNEL
	 * @model name="paymentChannel"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_CHANNEL_VALUE = 20;

	/**
	 * The '<em><b>Unknown Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_CHANNEL
	 * @model name="unknownChannel"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_CHANNEL_VALUE = 21;

	/**
	 * An array of all the '<em><b>channels</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final channels[] VALUES_ARRAY =
		new channels[] {
			TELEPHONE,
			SMS,
			EMAIL,
			SOCIAL_MEDIA_MESSAGE,
			MESSAGE_SERVICE,
			CHAT,
			FACE_TO_FACE,
			INTERNET_VIA_PC,
			INTERNET_VIA_SMART_PHONE,
			INTERNET_VIA_TABLET,
			APP_ON_PC,
			APP_ON_SMART_PHONE,
			APP_ON_TABLET,
			INTERNET,
			SELF_SERVICE_MACHINE,
			LETTER,
			PACKAGE_DELIVERY,
			FAX_MESSAGE,
			SHOP_COUNTER,
			SERVICE_DESK,
			PAYMENT_CHANNEL,
			UNKNOWN_CHANNEL,
		};

	/**
	 * A public read-only list of all the '<em><b>channels</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<channels> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>channels</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static channels get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			channels result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>channels</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static channels getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			channels result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>channels</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static channels get(int value) {
		switch (value) {
			case TELEPHONE_VALUE: return TELEPHONE;
			case SMS_VALUE: return SMS;
			case EMAIL_VALUE: return EMAIL;
			case SOCIAL_MEDIA_MESSAGE_VALUE: return SOCIAL_MEDIA_MESSAGE;
			case MESSAGE_SERVICE_VALUE: return MESSAGE_SERVICE;
			case CHAT_VALUE: return CHAT;
			case FACE_TO_FACE_VALUE: return FACE_TO_FACE;
			case INTERNET_VIA_PC_VALUE: return INTERNET_VIA_PC;
			case INTERNET_VIA_SMART_PHONE_VALUE: return INTERNET_VIA_SMART_PHONE;
			case INTERNET_VIA_TABLET_VALUE: return INTERNET_VIA_TABLET;
			case APP_ON_PC_VALUE: return APP_ON_PC;
			case APP_ON_SMART_PHONE_VALUE: return APP_ON_SMART_PHONE;
			case APP_ON_TABLET_VALUE: return APP_ON_TABLET;
			case INTERNET_VALUE: return INTERNET;
			case SELF_SERVICE_MACHINE_VALUE: return SELF_SERVICE_MACHINE;
			case LETTER_VALUE: return LETTER;
			case PACKAGE_DELIVERY_VALUE: return PACKAGE_DELIVERY;
			case FAX_MESSAGE_VALUE: return FAX_MESSAGE;
			case SHOP_COUNTER_VALUE: return SHOP_COUNTER;
			case SERVICE_DESK_VALUE: return SERVICE_DESK;
			case PAYMENT_CHANNEL_VALUE: return PAYMENT_CHANNEL;
			case UNKNOWN_CHANNEL_VALUE: return UNKNOWN_CHANNEL;
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
	private channels(int value, String name, String literal) {
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
	
} //channels
