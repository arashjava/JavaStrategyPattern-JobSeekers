/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;


public class Job {
    private String name;

    public Jobs jobType;
    public String[] jobList= new String[5];

    public String[] findJobs(){
            return jobList;
    }
    
    public void setJob(Jobs newJob){
            jobType = newJob;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
