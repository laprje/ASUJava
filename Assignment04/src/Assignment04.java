import java.util.Scanner;

public class Assignment04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean play = true;
        long randomNumber = -1;
        String guess = "0";
        int guesses = 0;
        int correct = 0;
        String cont = new String("y");
        while(play) {
            randomNumber = (long)(Math.random() * 10000);
            if(randomNumber < 1000 && randomNumber > 100) {
                randomNumber *= 10;
            } else if(randomNumber < 100 && randomNumber < 1000) {
                randomNumber *= 100;
            }
            String secret = String.valueOf(randomNumber);
            System.out.println(secret);
            while(!guess.equals(secret)){
                System.out.println("Please guess the 4-digit secret number.");
                guess = in.next();
                guesses++;
                correct = 0;
                for(int i=0; i<4; i++) {
                    for(int j=0; j<4; j++){
                        if(guess.charAt(i) == secret.charAt(j)){
                            correct++;
                        }
                    }
                }

                System.out.println("You matched " + correct);
            }
            System.out.println("Congratulations! You guessed the secret number in " + guesses + " tries.");
            System.out.println("Play again? (y/n)");
            cont = in.next();
            if(cont.equals("n")){
                System.out.println("Goodbye.");
                return;
            }
        }
    }
}
