class Solution2 {
    fun isValid(s: String): Boolean {
        var state: Boolean = true
        if (s.length < 2) {
            state = false
        } else {
            if ((s[0] == ')') || (s[0] == ']') || (s[0] == '}')) {
                state = false
            } else {
                loop@ for (i in 0..s.length - 1 step 2) {
                    println(s[i])
                    if (s[i] == '(') if (!(s[i + 1] == ')')) {
                        if (!(s[s.length - i - 1] == ')')) state = false
                    }
                    if (s[i] == '[') if (!(s[i + 1] == ']')) {
                        if (!(s[s.length - i - 1] == ']')) state = false
                    }
                    if (s[i] == '{') if (!(s[i + 1] == '}')) {
                        if (!(s[s.length - i - 1] == '}')) state = false
                    }
                    if (!state) break@loop
                    println("${s[i]}, ${s[i + 1]}")
                }
            }
        }
        println(state)
        return state
    }
}