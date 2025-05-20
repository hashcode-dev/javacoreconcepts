package com.javacoreconcepts.codilitytest;

public class OCREquivalence {
    public boolean solution(String S, String T) {
        return match(S, T, 0, 0, 0, 0);
    }

    private boolean match(String s, String t, int i, int j, int skipS, int skipT) {
        int lenS = s.length(), lenT = t.length();

        while (i < lenS || j < lenT) {
            // Consume digits in S and add to skipS
            if (i < lenS && Character.isDigit(s.charAt(i))) {
                int num = 0;
                while (i < lenS && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i++) - '0');
                }
                skipS += num;
            }

            // Consume digits in T and add to skipT
            if (j < lenT && Character.isDigit(t.charAt(j))) {
                int num = 0;
                while (j < lenT && Character.isDigit(t.charAt(j))) {
                    num = num * 10 + (t.charAt(j++) - '0');
                }
                skipT += num;
            }

            // Handle skip counts
            if (skipS > 0) {
                skipS--;
                i++;
                continue;
            }
            if (skipT > 0) {
                skipT--;
                j++;
                continue;
            }

            // Compare characters
            if (i < lenS && j < lenT) {
                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                }
                i++;
                j++;
            } else {
                // Only one has remaining characters
                if (i < lenS || j < lenT) {
                    return false;
                }
            }
        }

        return i == lenS && j == lenT && skipS == 0 && skipT == 0;
    }

    public static void main(String[] args) {
        OCREquivalence sol = new OCREquivalence();

        // ✅ True cases
        System.out.println(sol.solution("A2Le", "2pL1"));    // true
        System.out.println(sol.solution("a10", "10a"));      // true

        // ❌ False cases
        System.out.println(sol.solution("ba1", "1Ad"));      // false
        System.out.println(sol.solution("3x2x", "8"));       // false
    }
}
