package module02Stack;

/**
 * 2. Stacks using linked list
 */
public class StacksUsingLinkedList {
    public static void main(String[] args)
    {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("The top element is " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("The stack is not empty");
        }
    }
}

class Node {
    int data;
    Node next;
}

class Stack
{
    private Node top;
    private int nodesCount;

    public Stack() {
        this.top = null;
        this.nodesCount = 0;
    }

    public void push(int x)
    {
        Node node = new Node();

        if (node == null)
        {
            System.out.println("Heap Overflow");
            return;
        }

        System.out.println("Inserting " + x);

        // set data in the allocated node
        node.data = x;

        // set .next pointer of the new node to point to the current top node of the list
        node.next = top;

        // update top pointer
        top = node;

        // increase stack's size by 1
        this.nodesCount += 1;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty()
    {
        return top == null;
    }

    // Utility function to return the top element of the stack
    public int peek()
    {
        // check for an empty stack
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return top.data;
    }

    // Utility function to pop a top element from the stack
    // remove at the beginning
    public int pop()
    {
        // check for stack overflow
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }

        // take note of the top node's data
        int top = peek();

        System.out.println("Removing " + top);

        // decreasing stack's size by 1
        this.nodesCount -= 1;

        // update the top pointer to point to the next node
        this.top = (this.top).next;

        return top;
    }

    // Utility function to return the size of the stack
    public int size() {
        return this.nodesCount;
    }
}


