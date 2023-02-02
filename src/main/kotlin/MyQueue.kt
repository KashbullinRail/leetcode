import java.util.Stack

class MyQueue() {

    val stackStraight = Stack<Int>()
    val stackQueue = Stack<Int>()
    var item:Int = 0

    fun push(x: Int) {
        stackQueue.push(x)
    }

    fun pop(): Int {
        while (!stackQueue.isEmpty()){
            stackStraight.push(stackQueue.pop())
        }
        item = stackStraight.pop()
        while (!stackStraight.isEmpty()){
            stackQueue.push(stackStraight.pop())
        }
        return item
    }

    fun peek(): Int {
        while (!stackQueue.isEmpty()){
            stackStraight.push(stackQueue.pop())
        }
        item = stackStraight.peek()
        while (!stackStraight.isEmpty()){
            stackQueue.push(stackStraight.pop())
        }
        return item
    }

    fun empty(): Boolean {
       return stackQueue.empty()
    }

}