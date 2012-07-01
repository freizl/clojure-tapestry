/**
 * Created with IntelliJ IDEA.
 * User: haiswu
 * Date: 6/29/12
 * Time: 7:47 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * Demostrate Invoke Clojure class from Java class
 */

import com.freizl.pages.About;

import junit.framework.TestCase;


public class TestInvokeClojure extends TestCase {

        public TestInvokeClojure (String name) {
            super(name);
        }

        public void testOne () throws Exception {
            About tiny = new About();
            assertEquals("About Info from About.clj", tiny.getAboutInfo());
        }

}
