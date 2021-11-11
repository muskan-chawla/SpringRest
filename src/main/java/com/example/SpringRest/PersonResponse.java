package com.example.SpringRest;

import lombok.Data;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;

@Slf4j

public  class PersonResponse {
    int age;
    String Name;
    ObjectId id;

    public int getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }

    public ObjectId getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}









