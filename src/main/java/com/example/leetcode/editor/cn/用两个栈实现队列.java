package com.example.leetcode.editor.cn;
//用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的
//功能。(若队列中没有元素，deleteHead 操作返回 -1 ) 
//
// 
//
// 示例 1： 
//
// 输入：
//["CQueue","appendTail","deleteHead","deleteHead"]
//[[],[3],[],[]]
//输出：[null,null,3,-1]
// 
//
// 示例 2： 
//
// 输入：
//["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
//[[],[],[5],[2],[],[]]
//输出：[null,-1,null,null,5,2]
// 
//
// 提示： 
//
// 
// 1 <= values <= 10000 
// 最多会对 appendTail、deleteHead 进行 10000 次调用 
// 
// Related Topics 栈 设计 队列 👍 426 👎 0

import java.util.LinkedList;
import java.util.Stack;

public class 用两个栈实现队列 {
    public static void main(String[] args) {
        CQueue solution = new 用两个栈实现队列().new CQueue();
        solution.appendTail(1);
        solution.appendTail(2);
//        System.out.println(solution.deleteHead());
        solution.appendTail(3);
        solution.appendTail(4);
        solution.appendTail(5);
        System.out.println(solution.deleteHead());
        System.out.println(solution.stack1);
        System.out.println(solution.stack2);


    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class CQueue {
        //先维护两个栈   :stack1来存储放入元素     stack2来删除元素
        LinkedList<Integer> stack1;
        LinkedList<Integer> stack2;

        public CQueue() {
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
        }
        //pop（）是移除堆栈顶部的元素并且返回它的值
        //push（）是把对象压入堆栈的顶部(最前面)

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            //如果stack2中没有元素，那就将1stack1中元素放入2中，删除2中最后一个
            //如果1,2中都没有元素，那就返回-1
            if (stack2.isEmpty()) {
                if (stack1.isEmpty()) {
                    return -1;
                }

                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
//leetcode submit region end(Prohibit modification and deletion)


}