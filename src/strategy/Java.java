/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

public class Java extends Job{
    

    public Java(){
            super();
            jobList[0]= new JavaDev().job();
            jobList[1]= new JavaFullStack().job();              
            jobList[2]= new PhpJavaFullStack().job();              
            jobList[3]= new PythonJavaFullStack().job();              
    }



    
}