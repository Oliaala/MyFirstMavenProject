package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import people.AutomatedEngTest;
import people.ManualEngTest;

@Suite.SuiteClasses({ManualEngTest.class, AutomatedEngTest.class})
@RunWith(Suite.class)
public class PeopleSuite {

}
