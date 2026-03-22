package tests;

import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class RunAllTests {
    public static void main(String[] args) {
        TestNG testng = new TestNG();

        // Листа на TestNG suites
        List<String> suites = new ArrayList<>();
        // Пат до твојот testing.xml
        suites.add("src/test/java/testing.xml");

        testng.setTestSuites(suites);
        testng.run();
    }
}
