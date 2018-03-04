/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

public class JobPicker{
	
	public static void main(String[] args){
		
		Job seeker1 = new Java();
                seeker1.setName("Bob Jones");
                showAvailJobs(seeker1);

		Job seeker2 = new Php();
                seeker2.setName("Treza Brown");
                showAvailJobs(seeker2);

		Job seeker3 = new Python();
                seeker3.setName("Robert Robb");
                showAvailJobs(seeker3);		
	}
        
        private static void showAvailJobs(Job seeker){
                for (int i=0; i< seeker.jobList.length; i++){
                    if (seeker.jobList[i]!= null) {
                       System.out.println(seeker.getName() + " can work as: "+ seeker.jobList[i]);
                    }
                }
        }
	
}