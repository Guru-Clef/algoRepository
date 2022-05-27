package stacksQueue;

import java.util.Stack;

public class StackClass {

  public Boolean validString(String s) {

    char[] charArr = s.toCharArray();

    if (charArr.length <= 1) {
      return false;
    }

    Stack<Character> charStack = new Stack<>();

    for (int i = 0; i < charArr.length; i++) {
      if (charArr[i] == '(' || charArr[i] == '{' || charArr[i] == '[') {
        charStack.push(charArr[i]);
      } else if (charArr.length % 2 != 0) {
        return false;
      } else if (!charStack.isEmpty() &&
          ((charStack.peek() == '(' && charArr[i] == ')') ||
              (charStack.peek() == '{' && charArr[i] == '}') ||
              (charStack.peek() == '[' && charArr[i] == ']'))) {
        charStack.pop();
      } else {
        return false;
      }
    }


    if (charStack.isEmpty()) {
      return true;
    } else {
      return false;
    }

  }


}
