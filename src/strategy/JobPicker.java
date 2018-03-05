/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

public class JobPicker{
	
    public static void main(String[] args){

        Job seeker1 =new Java();
        seeker1.setName("Bob Jones");
        showJobs(seeker1);
        
        Job seeker2 =new Php();
        seeker2.setName("Treza Brown");
        showJobs(seeker2);
                
        Job seeker3 =new Python();
        seeker3.setName("Patt Roberts");
        showJobs(seeker3);
    }
        
    private static void showJobs(Job seeker){
                 System.out.println("Jobs available for "+ seeker.getName() + " are:");
                for (String s: seeker.getMyJobs()){
                      System.out.println("\t"+s);
                }
    }
	
}