package com.geekster.project.assignment.URLHitCounterApplication.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UrlHitCounter {
    private String userName;

    private Integer counter;

    public String getUserName() {
        return userName;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }
}
