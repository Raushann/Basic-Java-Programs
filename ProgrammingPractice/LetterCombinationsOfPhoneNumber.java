{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 HelveticaNeue-Bold;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww28600\viewh17440\viewkind0
\deftab560
\pard\pardeftab560\slleading20\partightenfactor0

\f0\fs26 \cf0 /* Given a string containing digits from\'a02-9\'a0inclusive, return all possible letter combinations that the number could represent. Return the answer in\'a0
\f1\b any order
\f0\b0 .\
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.\
\uc0\u8232 
\f1\b Example 1:
\f0\b0 \

\f1\b Input:
\f0\b0  digits = "23"\

\f1\b Output:
\f0\b0  ["ad","ae","af","bd","be","bf","cd","ce","cf"]\

\f1\b Example 2:
\f0\b0 \

\f1\b Input:
\f0\b0  digits = ""\

\f1\b Output:
\f0\b0  []\

\f1\b Example 3:
\f0\b0 \

\f1\b Input:
\f0\b0  digits = "2"\

\f1\b Output:
\f0\b0  ["a","b","c"] */\
\uc0\u8232 \
\pard\pardeftab560\slleading20\pardirnatural\partightenfactor0
\cf0 \
import java.util.ArrayList;\
import java.util.List;\
\
public class LetterCombinationsOfPhoneNumber \{\
\
    private static final String[] KEYPAD = \{\
        "",     // 0\
        "",     // 1\
        "abc",  // 2\
        "def",  // 3\
        "ghi",  // 4\
        "jkl",  // 5\
        "mno",  // 6\
        "pqrs", // 7\
        "tuv",  // 8\
        "wxyz"  // 9\
    \};\
\
    public static List<String> letterCombinations(String digits) \{\
        List<String> result = new ArrayList<>();\
        if (digits == null || digits.isEmpty()) \{\
            return result;\
        \}\
\
        backtrack(result, new StringBuilder(), digits, 0);\
        return result;\
    \}\
\
    private static void backtrack(List<String> result, StringBuilder current, String digits, int index) \{\
        if (index == digits.length()) \{\
            result.add(current.toString());\
            return;\
        \}\
\
        String letters = KEYPAD[digits.charAt(index) - '0'];\
        for (char letter : letters.toCharArray()) \{\
            current.append(letter);\
            backtrack(result, current, digits, index + 1);\
            current.deleteCharAt(current.length() - 1);\
        \}\
    \}\
\
    public static void main(String[] args) \{\
        String digits1 = "23";\
        String digits2 = "";\
        String digits3 = "2";\
\
        System.out.println("Combinations for '23': " + letterCombinations(digits1)); // Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]\
        System.out.println("Combinations for '': " + letterCombinations(digits2));   // Output: []\
        System.out.println("Combinations for '2': " + letterCombinations(digits3)); // Output: ["a","b","c"]\
    \}\
\}\
}