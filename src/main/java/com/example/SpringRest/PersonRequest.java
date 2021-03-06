package com.example.SpringRest;

import lombok.Data;
import org.bson.types.ObjectId;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
//@Slf4j
@Data
public class PersonRequest {
     ObjectId Id;
    @Min(1)
    int age;
    @NotNull
    String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}

