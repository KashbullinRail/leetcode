class Solution11 {

    fun isAnagram(s: String, t: String): Boolean {
        if (s == null || t == null || s.length != t.length){
            return false
        } else {
            if(s.toByteArray().sorted().equals(t.toByteArray().sorted())) return true
        }
        return false
    }

}