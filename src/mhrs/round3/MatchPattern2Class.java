package mhrs.round3;

public class MatchPattern2Class {
    public static void main(String[] args) {
        System.out.println(matchPattern(new int[]{1, 1, 1, 2, 2, 1, 1, 3}, new int[]{1, 2, 1, 3}));
        System.out.println(matchPattern(new int[]{1, 1, 1, 1, 1}, new int[]{1}));
        System.out.println(matchPattern(new int[]{1}, new int[]{1}));
        System.out.println(matchPattern(new int[]{1, 1, 2, 2, 2, 2}, new int[]{1, 2}));
        System.out.println(matchPattern(new int[]{1, 2, 3}, new int[]{1, 2}));
        System.out.println(matchPattern(new int[]{1, 2}, new int[]{1, 2, 3}));
        System.out.println(matchPattern(new int[]{1, 1, 2, 2, 2, 2, 3}, new int[]{1, 3}));
        System.out.println(matchPattern(new int[]{1, 1, 1, 1} , new int[]{1, 2} ));
        System.out.println(matchPattern(new int[]{1, 1, 1, 1, 2, 2, 3, 3} , new int[]{1, 2}));
        System.out.println(matchPattern(new int[]{1, 1, 10, 4, 4, 3}, new int[]{1, 4, 3}));

    }

    static int matchPattern(int[] a, int[] pattern) {
        int len = a.length;
        int patternLen = pattern.length;
        // len is the number of elements in the array a, patternLen is the number of elements in the pattern.
        int i = 0; // index into a
        int k = 0; // index into pattern
        int matches = 0; // how many times current pattern character has been matched so far
        for (i = 0; i < len; i++) {
            if (a[i] == pattern[k]) {
                matches++; // current pattern character was matched
            } else if (matches == 0 || k == patternLen - 1) {
                return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
            } else { // advance to next pattern character {
                // !!You write this code !!
                k++;
                i--;
                matches=0;
            }
        } // end of else
        // end of for
        // return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
        if (i == len && k == patternLen - 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

