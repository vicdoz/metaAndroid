/**
 */
package android;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Permissions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see android.AndroidPackage#getPermissions()
 * @model
 * @generated
 */
public enum Permissions implements Enumerator {
	/**
	 * The '<em><b>INTERNET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNET(0, "INTERNET", "INTERNET"),

	/**
	 * The '<em><b>FINE LOCATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINE_LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	FINE_LOCATION(1, "FINE_LOCATION", "FINE_LOCATION"),

	/**
	 * The '<em><b>COARSE LOCATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COARSE_LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	COARSE_LOCATION(2, "COARSE_LOCATION", "COARSE_LOCATION"),

	/**
	 * The '<em><b>CAMERA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAMERA_VALUE
	 * @generated
	 * @ordered
	 */
	CAMERA(3, "CAMERA", "CAMERA"),

	/**
	 * The '<em><b>READ SMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_SMS_VALUE
	 * @generated
	 * @ordered
	 */
	READ_SMS(4, "READ_SMS", "READ_SMS");

	/**
	 * The '<em><b>INTERNET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERNET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERNET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERNET_VALUE = 0;

	/**
	 * The '<em><b>FINE LOCATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FINE LOCATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINE_LOCATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINE_LOCATION_VALUE = 1;

	/**
	 * The '<em><b>COARSE LOCATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COARSE LOCATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COARSE_LOCATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COARSE_LOCATION_VALUE = 2;

	/**
	 * The '<em><b>CAMERA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAMERA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAMERA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAMERA_VALUE = 3;

	/**
	 * The '<em><b>READ SMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READ SMS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_SMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READ_SMS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Permissions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Permissions[] VALUES_ARRAY =
		new Permissions[] {
			INTERNET,
			FINE_LOCATION,
			COARSE_LOCATION,
			CAMERA,
			READ_SMS,
		};

	/**
	 * A public read-only list of all the '<em><b>Permissions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Permissions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Permissions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Permissions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Permissions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Permissions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Permissions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Permissions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Permissions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Permissions get(int value) {
		switch (value) {
			case INTERNET_VALUE: return INTERNET;
			case FINE_LOCATION_VALUE: return FINE_LOCATION;
			case COARSE_LOCATION_VALUE: return COARSE_LOCATION;
			case CAMERA_VALUE: return CAMERA;
			case READ_SMS_VALUE: return READ_SMS;
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
	private Permissions(int value, String name, String literal) {
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
	
} //Permissions
