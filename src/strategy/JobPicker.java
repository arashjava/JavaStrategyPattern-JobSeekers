/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

public class JobPicker{
	
	public static void main(String[] args){
		
		JavaJob seeker1 = new Java();
                seeker1.setName("Bob Jones");
                showAvailJobs(seeker1);

		JavaJob seeker2 = new Php();
                seeker2.setName("Treza Brown");
                showAvailJobs(seeker2);

		JavaJob seeker3 = new Python();
                seeker3.setName("Robert Robb");
                showAvailJobs(seeker3);		
	}
        
        private static void showAvailJobs(JavaJob seeker){
                for (int i=0; i< seeker.jobList.length; i++){
                    if (seeker.jobList[i]!= null) {
                       System.out.println(seeker.getName() + " can work as: "+ seeker.jobList[i]);
                    }
                }
        }
	
}