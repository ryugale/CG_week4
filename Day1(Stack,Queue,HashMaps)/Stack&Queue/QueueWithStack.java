import java.util.*;

public class QueueWithStack {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String option;

        while (true) {
            System.out.println("1.)Enter a number to enqueue. \n2.)type p to dequeue. \n3.)s to stop/\n ");
            option = sc.next();

            if (option.equals("s")) {
                break; 
            }else if (option.equals("p")) {
                dequeue(input, output); 
            }else {
                input.push(Integer.parseInt(option));
                System.out.println(input);
            }
        }
    }
    public static void dequeue(Stack<Integer> input, Stack<Integer> output) {
        if (output.empty()) {
            while (input.empty() == false) {
                output.push(input.pop());
            }
        }
        output.pop();
        System.out.println(output);
    }
}