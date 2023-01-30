import com.sun.jdi.IntegerType
import java.math.BigInteger

class Solution8 {

    fun addBinary(a: String, b: String): String {
        val s1 = (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)
        return s1
    }

}