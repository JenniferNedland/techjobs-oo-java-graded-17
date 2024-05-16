package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job_1 = new Job();
        Job job_2 = new Job();
        assertNotEquals(job_1, job_2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job_3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality" +
                " control"), new CoreCompetency("Persistence"));

        assertNotNull(job_3.getName()); //change this to check if name exists?
        assertNotNull(job_3.getEmployer());
        assertNotNull(job_3.getLocation());
        assertNotNull(job_3.getPositionType());
        assertNotNull(job_3.getCoreCompetency());

        assertEquals(job_3.getName(), "Product tester");
        assertEquals(job_3.getEmployer().getValue(), "ACME");
        assertEquals(job_3.getLocation().getValue(), "Desert");
        assertEquals(job_3.getPositionType().getValue(), "Quality control");
        assertEquals(job_3.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job job_4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality" +
                " control"), new CoreCompetency("Persistence"));
        Job job_5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality" +
                " control"), new CoreCompetency("Persistence"));

        assertNotEquals(job_4, job_5);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job_six = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String firstChar = String.valueOf(job_six.toString().charAt(0));
        String lastChar = String.valueOf(job_six.toString().charAt(job_six.toString().length()-1));
        assertEquals(firstChar, "\n");
        assertEquals(lastChar, "\n");
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job_seven = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String output =

                """
                
                ID: %s
                Name: %s
                Employer: %s
                Location: %s
                Position Type: %s
                Core Competency: %s
                """.formatted(job_seven.getId(), job_seven.getName(), job_seven.getEmployer(),
                        job_seven.getLocation(), job_seven.getPositionType(), job_seven.getCoreCompetency());

        assertEquals(output, job_seven.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {

    }
}
