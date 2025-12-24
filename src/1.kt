class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for (char in s) {
            when (char) {
                '(' -> stack.addLast(')')
                '{' -> stack.addLast('}')
                '[' -> stack.addLast(']')
                else -> {
                    if (stack.isEmpty() || stack.removeLast() != char) {
                        return false
                    }
                }
            }
        }

        return stack.isEmpty()
    }
}

// https://leetcode.com/problems/valid-parentheses/