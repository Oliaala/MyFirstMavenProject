package people;

import org.junit.Assert;
import org.junit.Test;

public class AutomatedEngTest {

    @Test
    public void AutomatedGetAgeTest(){

        AutomatedEngineer automatedEngineer = new  AutomatedEngineer(29, 5);
        Assert.assertEquals("Person age is not correct: ", 29, automatedEngineer.getAge());
    }
    @Test
    public void AutomatedGetExperianceTest(){

        AutomatedEngineer automatedEngineer = new  AutomatedEngineer(29, 5);
        Assert.assertEquals("Person age is not correct: ", 5, automatedEngineer.getExperience());
    }

    @Test
    public void AutomatedGetSkillTest(){

        AutomatedEngineer automatedEngineer = new  AutomatedEngineer(29, 5);
        Assert.assertEquals("Person age is not correct: ", 15, automatedEngineer.getSkill());
    }
    @Test
    public void automatedSetAgeTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(29, 5);
        automatedEngineer.setAge(29);
        Assert.assertEquals("Person age is not correct: ", 29, automatedEngineer.getAge());
    }

    @Test
    public void automatedSetExperianceTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(29, 5);
        automatedEngineer.setExperience(5);
        Assert.assertEquals("Person age is not correct: ", 5, automatedEngineer.getExperience());
    }

    @Test
    public void automatedSetSkillTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(29, 5);
        automatedEngineer.setSkill(10);
        Assert.assertEquals("Person age is not correct: ", 10, automatedEngineer.getSkill());
    }
}
