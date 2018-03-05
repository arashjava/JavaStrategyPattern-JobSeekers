/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;

public class Php extends Job{
    ArrayList<String> myJobs = new ArrayList<String>();
    public Php(){
        super();
        jobTitle= new PhpFullStack();
        myJobs.add(jobTitle.job());
        jobTitle= new PhpJavaFullStack();
        myJobs.add(jobTitle.job());
        jobTitle= new PhpPythonFullStack();
        myJobs.add(jobTitle.job());
        setMyJobs(myJobs);

    }
}