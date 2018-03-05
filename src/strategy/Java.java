/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;

public class Java extends Job{
    ArrayList<String> myJobs = new ArrayList<String>();
    public Java(){
            super();
            jobTitle= new JavaDev();
            myJobs.add(jobTitle.job());
            jobTitle= new JavaFullStack();
            myJobs.add(jobTitle.job());
            jobTitle= new PhpJavaFullStack();
            myJobs.add(jobTitle.job());
            jobTitle= new JavaDev();
            myJobs.add(jobTitle.job());
            setMyJobs(myJobs);
    }



    
}