package com.example.SpringRest;

import org.bson.types.ObjectId;


public interface PersonService
{
    PersonResponse createPerson(PersonRequest personRequest);
    PersonResponse updateDetails(PersonPutRequest personPutRequest);
    PersonResponse editDetails(PersonPatchRequest personPatchRequest);
   void deleteDetails(ObjectId id);
}


