package com.example.SpringRest;

import lombok.Data;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Value
public class PersonResponse {

    int age;
    String firstName;

    public PersonResponse(int age,String firstName)
    {
      this.age=age;
      this.firstName=firstName;
    }
}
