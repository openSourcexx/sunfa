package demo.sword_offer;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 栈：push/pop后进先出
 * 队列：push/pop先进先出
 * stack：123
 * 添加：456
 * 输出：123456
 * 意思是，向一个栈中添加node元素后，按队列的先进先出方式弹出该栈的元素
 *
 * @author Administrator
 */
public class _栈模拟队列 {
    public static void main(String[] args) {
		/*LinkedList<Object> list = new LinkedList<>();
		Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    stack1.push(1);
	    stack1.push(2);
	    stack1.push(3);
	    System.out.println("stack1:"+stack1);
	    stack2.push(4);
	    stack2.push(5);
	    stack2.push(6);
	    System.out.println("stack2:"+stack2);
	    System.out.println("------------------");
	    while(!stack2.isEmpty()){
	    	stack2.pop();	    	
	    }
	    stack1.push(4);
	    stack1.push(5);
	    stack1.push(6);
	    
	    
	    System.out.println("stack1:"+stack1);
	    System.out.println("stack2:"+stack2);
	    System.out.println("---------------");
	    while(!stack1.isEmpty()){
	    	stack2.push(stack1.pop());
	    }
	    while(!stack2.isEmpty()){	    	
	    	list.add(stack2.pop());
	    }
		System.out.println(list);*/
    }

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        //向栈1添加元素
        stack1.push(node);
    }

    public int pop() {
        //将栈2清空
        while (!stack2.isEmpty()) {
            stack2.pop();
        }
        //将栈1元素逆序到栈2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
