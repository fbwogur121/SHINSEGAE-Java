package august.aug_0813.dataStructure.stackEx;

// stack 구조는 데이터를 제한적으로 접근할 수 있는 구조이다. (한쪽 끝에서만 자료를 넣거나 뺼 수 있는 구조)
// LIFO (Last in First out)
// 구조가 단순해서, 구현이 쉽다. 배열로 구현.
// 장점 : 데이터 저장/읽기 속도가 빠르다.
// 단점 : 데이터 최대 갯수를 미리 정해야 함. 저장공간의 낭비를 초래할 수 있다 & 저장공간이 유한하다.

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<>();
        stack_int.push(1);
        stack_int.push(2);
        stack_int.push(3);

        System.out.println(stack_int.pop());
        System.out.println(stack_int.pop());

        int data = stack_int.pop();
        stack_int.push(data);
        System.out.println(stack_int);
    }
}
