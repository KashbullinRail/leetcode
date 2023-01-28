import java.util.Stack

class Solution2 {
//    fun isValid(s: String): Boolean {
//        val stack = ArrayDeque<String>()
//        for (i in 0..s.length - 1) {
//            if (s[i] == '(' || s[i] == '[' || s[i] == '{') {
//                stack.addLast(s[i].toString())
//            } else {
//                if (stack.isEmpty()) {
//                    return false
//                }
//                val charr = stack.last()
//                println(charr)
//                if ((charr.equals("(") && s[i] == ')') || (charr.equals("[") && s[i] == ']') || (charr.equals("{") && s[i] == '}')){
//                    stack.removeLast()
//                } else {
//                    return false
//                }
//            }
//        }
//        println(stack.isEmpty())
//        return stack.isEmpty()
//    }

    fun isValid(s: String): Boolean {
        val stack = Stack<String>()
        for (i in 0..s.length - 1) {
            if (s[i] == '('){
                stack.push(")")
            } else if(s[i] == '[') {
                stack.push("]")
            } else if (s[i] == '{'){
                stack.push("}")
            } else if (stack.isEmpty() || stack.pop() != s[i].toString()) {
                return false
            }
        }
        println(stack.isEmpty())
        return stack.isEmpty()
    }


}