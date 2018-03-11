/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;

public class Python extends Job{
    ArrayList<String> myJobs = new ArrayList<String>();
    public Python(){
        super();
        jobTitle= new PythonFullStack();
        myJobs.add(jobTitle.job());
        jobTitle= new PythonJavaFullStack();
        myJobs.add(jobTitle.job());
        jobTitle= new PythonDev();
        myJobs.add(jobTitle.job());
        jobTitle= new PhpPythonFullStack();
        myJobs.add(jobTitle.job());
        setMyJobs(myJobs);
    }
}