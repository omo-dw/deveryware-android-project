package deveryware.deveryware_android_project.business;

import junit.framework.TestCase;

/**
 * ModelTest
 * Created by omo-dw on 02/12/15.
 */
public class ModelTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    public void testActive() {
        Model model = new Model();
        assertTrue(model.isActive());
    }

    public void testInactive() {
        Model model = new Model();
        // assertFalse(model.isActive());
    }

}