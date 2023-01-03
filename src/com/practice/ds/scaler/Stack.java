package com.practice.ds.scaler;

public class Stack {

    int[] stack = new int[7];
    int top = 0;
    public static void main(String args[]){
        Stack stack = new Stack();
        System.out.println("-------------Push element in stack-----------------------");
        stack.insert(5);
        stack.insert(10);
        stack.insert(15);
        stack.insert(20);
        stack.insert(25);
        stack.insert(30);
        stack.insert(35);
        stack.show();
        System.out.println("-------------Delete element from stack-----------------------");
        stack.deleteAtEnd();
        stack.show();
        System.out.println("-------------Get latest element -----------------------");
        stack.get();

    }

    private void get(){
        int data = stack[top-1];
        System.out.println(data);
    }
    private void deleteAtEnd() {
        top--;
        System.out.println(stack[top]);
        stack[top] = 0;
    }

    private void show() {
        for(int i = 0; i< stack.length; i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.println();
    }

    private void insert(int data) {
      stack[top] = data;
      top++;
    }

}

