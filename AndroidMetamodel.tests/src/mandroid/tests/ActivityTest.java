/**
 */
package mandroid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mandroid.Activity;
import mandroid.MandroidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityTest extends TestCase {

	/**
	 * The fixture for this Activity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activity fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActivityTest.class);
	}

	/**
	 * Constructs a new Activity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Activity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Activity fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Activity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activity getFixture() {
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
		setFixture(MandroidFactory.eINSTANCE.createActivity());
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

} //ActivityTest
