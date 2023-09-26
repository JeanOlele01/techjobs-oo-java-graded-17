package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId (){

        Job job1 = new Job();
        Job job2 = new Job();
       // String message = "The two test ID's should be different";

        assertNotEquals(job1.getId(), job2.getId());

    }
    @Test
    public void testJobConstructorSetsAllFields () {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(newJob.getName(), "Product tester");
        assertTrue(newJob.getEmployer().getValue() == ("ACME"));
        assertTrue(newJob.getLocation().getValue() == ("Desert"));
        assertTrue(newJob.getPositionType().getValue() == ("Quality control"));
        assertTrue(newJob.getCoreCompetency().getValue() == ("Persistence"));
    }
}
