package people;

import org.junit.Assert;
import org.junit.Test;

public class ManualEngTest {

    @Test
    public void manualGetAgeTest(){

        ManualEngineer manualEngineer = new ManualEngineer(29, 5);
        Assert.assertEquals("Person age is not correct: ", 29, manualEngineer.getAge());
    }

    @Test
    public void manualGetExperianceTest(){

        ManualEngineer manualEngineer = new ManualEngineer(29, 5);
        Assert.assertEquals("Person age is not correct: ", 5, manualEngineer.getExperience());
    }

    @Test
    public void manualGetSkillTest(){

        ManualEngineer manualEngineer = new ManualEngineer(29, 5);
        Assert.assertEquals("Person age is not correct: ", 10, manualEngineer.getSkill());
    }

    @Test
    public void manualSetAgeTest() {
        ManualEngineer manualEngineer = new ManualEngineer(29, 5);
        manualEngineer.setAge(29);
        Assert.assertEquals("Person age is not correct: ", 29, manualEngineer.getAge());
    }

    @Test
    public void manualSetExperianceTest() {
        ManualEngineer manualEngineer = new ManualEngineer(29, 5);
        manualEngineer.setExperience(5);
        Assert.assertEquals("Person age is not correct: ", 5, manualEngineer.getExperience());
    }

    @Test
    public void manualSetSkillTest() {
        ManualEngineer manualEngineer = new ManualEngineer(29, 5);
        manualEngineer.setSkill(10);
        Assert.assertEquals("Person age is not correct: ", 10, manualEngineer.getSkill());
    }
}


