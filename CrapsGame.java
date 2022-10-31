import java.util.Random;

public class CrapsGame {
	public static void main(String[]args) {
		int die1,die2;//call the variables,die 1 and die 2
		int sum1=0;//the total of the first roll
			Random rand=new Random();//import random generator
			die1=rand.nextInt(6-1+1)+1;//result of the first roll of the first die
			die2=rand.nextInt(6-1+1)+1;//result of the first roll of the second die
			sum1=die1+die2;//the total of the first roll
		if(sum1==7||sum1==11) {
			System.out.println("You rolled "+sum1+" You win!");//if the total is 7 or 11 you win
			return;
		   }
		else if(sum1==2||sum1==3||sum1==12) {
			System.out.println("You rolled "+sum1+" You lose!");// if the total is 2,3,12, you lose
			return;
			}
		int sum2=0;// if not both then you roll a second time
			System.out.println("You rolled "+sum1+" You got "+sum1+" points");// the total roll will be your points
			die1=rand.nextInt(6-1+1)+1;//second roll
			die2=rand.nextInt(6-1+1)+1;
			sum2=die1+die2;
			if(sum2==7) {//if you roll 7 you lose
				System.out.println("You rolled "+sum2+" You lose!");
			}
			else//if not then continue to roll
				do {
					die1=rand.nextInt(6-1+1)+1;
					die2=rand.nextInt(6-1+1)+1;
					sum2=die1+die2;//continue rolling
					
					if(sum2!=sum1&&sum2!=7) {
					System.out.println("You rolled "+sum2+" You got "+sum1+" points");
					}//continue rolling until you got the same points as your first roll
					else if(sum2==sum1) {
						System.out.println("You rolled "+sum2+" You win!");
						break;//you win
					}
					else if(sum2==7) {
						System.out.println("You rolled "+sum2+" You lose!");
						break;//you lose
					}
				}while(sum2!=sum1&&sum2!=7);
						
				}
		  
		}
	

