/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

public class Php extends Job{
    
    public Php(){
        super();
        jobList[0]= new PhpFullStack().job();
        jobList[1]= new PhpJavaFullStack().job();              
        jobList[2]= new PhpPythonFullStack().job();              

    }
}