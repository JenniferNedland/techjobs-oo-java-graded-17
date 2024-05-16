package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class JobTest {
    //TODO: Create your unit tests here

    Job job_0 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality" +
            " control"), new CoreCompetency("Persistence"));
    @Test
    public void testSettingJobId() {
        Job job_1 = new Job();
        Job job_2 = new Job();
        assertNotEquals(job_1, job_2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        assertNotNull(job_0.getName());
        assertNotNull(job_0.getEmployer());
        assertNotNull(job_0.getLocation());
        assertNotNull(job_0.getPositionType());
        assertNotNull(job_0.getCoreCompetency());

        assertEquals(job_0.getName(), "Product tester");
        assertEquals(job_0.getEmployer().getValue(), "ACME");
        assertEquals(job_0.getLocation().getValue(), "Desert");
        assertEquals(job_0.getPositionType().getValue(), "Quality control");
        assertEquals(job_0.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {

        Job job_0Identical = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality" +
                " control"), new CoreCompetency("Persistence"));

        assertNotEquals(job_0, job_0Identical);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        String firstChar = String.valueOf(job_0.toString().charAt(0));
        String lastChar = String.valueOf(job_0.toString().charAt(job_0.toString().length()-1));
        assertEquals(firstChar, "\n");
        assertEquals(lastChar, "\n");
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String output =

                """
                
                ID: %s
                Name: %s
                Employer: %s
                Location: %s
                Position Type: %s
                Core Competency: %s
                """.formatted(job_0.getId(), job_0.getName(), job_0.getEmployer(),
                        job_0.getLocation(), job_0.getPositionType(), job_0.getCoreCompetency());

        assertEquals(output, job_0.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job_3 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        String jobString = String.valueOf(job_3);
        assertEquals(jobString, job_3.toString());
    }
}
