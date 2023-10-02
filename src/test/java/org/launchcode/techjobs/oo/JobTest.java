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

        assertEquals("Product tester", newJob.getName());
        assertEquals("ACME",newJob.getEmployer().getValue());
        assertEquals("Desert", newJob.getLocation().getValue());
        assertEquals("Quality control", newJob.getPositionType().getValue());
        assertEquals("Persistence", newJob.getCoreCompetency().getValue());

        assertTrue(newJob.getName() instanceof String);
        assertTrue(newJob.getEmployer() instanceof Employer);
        assertTrue(newJob.getLocation() instanceof Location);
        assertTrue(newJob.getPositionType() instanceof PositionType );
        assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency );
    }

    @Test
    public void testJobsForEquality () {
        Job equalityJob1 = new Job();
        Job equalityJob2 = new Job();

        assertFalse(equalityJob1.equals(equalityJob2));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job newLineJob =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        assertEquals(System.lineSeparator() , newLineJob.toString());
        assertEquals(System.lineSeparator(), newLineJob.toString());

    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        Job labelJob = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //labels
        String id  = "ID";
        String nameLabel = "Name:";
        String employerLabel = "Employer";
        String locationLabel = "Location";
        String positionTypeLabel = "Position Type";
        String coreCompetencyLabel = "Core Competency";


        int idValue = labelJob.getId();
        String nameValue = "Product tester";
        String employerValue = "ACME";
        String locationValue = "Desert";
        String positionTypeValue = "Quality control";
        String coreCompetencyValue = "Persistence";


        // assertions
        assertTrue(labelJob.toString().contains(id));
        assertTrue(labelJob.toString().contains(String.valueOf(idValue)));
        assertTrue(labelJob.toString().contains(nameLabel));
        assertTrue(labelJob.toString().contains(nameValue));
        assertTrue(labelJob.toString().contains(employerLabel));
        assertTrue(labelJob.toString().contains(employerValue));
        assertTrue(labelJob.toString().contains(locationLabel));
        assertTrue(labelJob.toString().contains(locationValue));
        assertTrue(labelJob.toString().contains(positionTypeLabel));
        assertTrue(labelJob.toString().contains(positionTypeValue));
        assertTrue(labelJob.toString().contains(coreCompetencyLabel));
        assertTrue(labelJob.toString().contains(coreCompetencyValue));

    }
    @Test
    public void testToStringHandlesEmptyField () {
        Job job1 = new Job ("Product tester", new Employer("ACME"), new Location(null), new PositionType("Entry level"), new CoreCompetency("Persistence"));
        Job job2 = new Job ("Product tester", new Employer("ACME"), new Location(""), new PositionType("Entry level"), new CoreCompetency("Persistence"));

      assertTrue(job1.toString().contains("Data not available"));
      assertTrue(job2.toString().contains("Data not available"));

    }
}

