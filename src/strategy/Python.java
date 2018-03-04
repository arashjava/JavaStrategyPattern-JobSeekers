/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

public class Python extends JavaJob{
    
    public Python(){
        super();

        jobList[0]= new PythonFullStack().job();
        jobList[1]= new PythonJavaFullStack().job();              
        jobList[2]= new PythonDev().job();              
        jobList[3]= new PhpPythonFullStack().job();   
    }
}