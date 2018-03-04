/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;
public class PhpJob {
    private String name;

    public Jobs jobType;

    public String findJob(){
            return jobType.job();
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
