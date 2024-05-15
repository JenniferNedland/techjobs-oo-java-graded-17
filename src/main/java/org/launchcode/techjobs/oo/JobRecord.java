package org.launchcode.techjobs.oo;

public record JobRecord(
    int id,
    String name,
    Employer employer,
    Location location,
    PositionType positionType,
    CoreCompetency coreCompetency) {

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
