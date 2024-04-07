import java.util.*;
public class _20 
{
    public static void main(String[] args) 
    {
        Scanner scan1 = new Scanner(System.in);
        int size;

        System.out.print("Enter the stack size: ");
        size = scan1.nextInt();

        Stack<Integer> stack = new Stack<>();
        int choice;

        while (true) 
        {
            System.out.println("\nPress 1 to Push");
            System.out.println("Press 2 to Pop");
            System.out.println("Press 3 to Peep");
            System.out.println("Press 4 to Display");
            System.out.println("Press 5 to Exit\n");
            System.out.print("Enter your choice: ");
            choice = scan1.nextInt();

            switch (choice) 
            {
                case 1:
                    push(stack, size, scan1);
                    break;
                case 2:
                    pop(stack);
                    break;
                case 3:
                    peep(stack);
                    break;
                case 4:
                    display(stack);
                    break;
                case 5:
                    System.out.println("Exit.");
                    scan1.close();
                    return;
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }

    private static void push(Stack<Integer> stack, int size, Scanner scan1) 
    {
        if (stack.size() == size) 
        {
            System.out.println("Stack overflow.");
        } 
        else 
        {
            System.out.print("Enter digit: ");
            int digit = scan1.nextInt();
            stack.push(digit);
        }
    }

    private static void pop(Stack<Integer> stack) 
    {
        if (stack.isEmpty()) 
        {
            System.out.println("Stack underflow.");
        } 
        else 
        {
            int popped = stack.pop();
            System.out.println(popped + " is popped.");
        }
    }

    private static void peep(Stack<Integer> stack) 
    {
        if (stack.isEmpty()) 
        {
            System.out.println("Stack is empty.");
        } 
        else 
        {
            System.out.println(stack.peek() + " is on top of the stack ");
        }
    }

    private static void display(Stack<Integer> stack) 
    {
        if (stack.isEmpty()) 
        {
            System.out.println("Stack is empty.");
        } 
        else 
        {
            System.out.println("Stack elements:");
            for (Integer element : stack) 
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
