import java.util.Scanner;

class vote {
    public static boolean canvote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        boolean canVote = vote.canvote(age);
        System.out.println("Can you vote? " + canVote);
    }
}