package people;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    @Test
    public void personGetAgeTest(){

        Person person = new Person(27);
        Assert.assertEquals("Person age is not correct: ", 27, person.getAge());

    }

 //   @Test
  //  public void personGetAgeFailedTest(){

  //      Person person = new Person(27);
    //    Assert.assertEquals("Person age is not correct: ", 26, person.getAge());

  //  }
}
