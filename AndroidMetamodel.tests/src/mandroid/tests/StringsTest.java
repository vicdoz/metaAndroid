/**
 */
package mandroid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mandroid.MandroidFactory;
import mandroid.Strings;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Strings</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringsTest extends TestCase {

	/**
	 * The fixture for this Strings test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Strings fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringsTest.class);
	}

	/**
	 * Constructs a new Strings test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Strings test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Strings fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Strings test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Strings getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MandroidFactory.eINSTANCE.createStrings());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StringsTest
