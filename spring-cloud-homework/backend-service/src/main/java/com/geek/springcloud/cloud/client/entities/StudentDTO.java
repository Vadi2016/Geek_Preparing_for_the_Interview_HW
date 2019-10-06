package com.geek.springcloud.cloud.client.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = Student.class)
public interface StudentDTO {

    Long getId();

    String getFirstName();

    String getLastName();

    int getMark();

    void setId(Long id);

    void setFirstName(String firstName);

    void setLastName(String LastName);

    void setMark(int mark);
}
