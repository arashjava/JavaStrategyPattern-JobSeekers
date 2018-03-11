/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;


public class Job {
    public Jobs jobTitle;
    private String name;
    private ArrayList<String> myJobs= new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public ArrayList<String> getMyJobs() {
        return myJobs;
    }

    public void setMyJobs(ArrayList<String> myJobs) {
        this.myJobs = myJobs;
    }

}
