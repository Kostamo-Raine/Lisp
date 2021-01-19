package com.lisp;

public class Main
{
    private static String lispCode = "(defun f (x y)(if (= y 0) (+ x 1)(* (f x (- y 1)) (+ (+ x 1) y))) )(defun g (x y)(+ (f x y) y))(write(g 10 10))";

    public static void main(String[] args)
    {
        // Use arg string if one is given; otherwise default to the valid lisp code string in the class.
        if(args.length == 1)
        {
            lispCode = args[0];
        }

        boolean bValid = validateParenthesis(lispCode);

        System.out.println(bValid? "The lisp code is valid." : "The lisp code is not valid.");
    }

    /**
     * Validate parenthesis for Lisp code.
     * @param sInput the input string with the lisp code to validate.
     * @return true if parenthesis are properly closed and nested; false otherwise.
     */
    private static boolean validateParenthesis(final String sInput)
    {
        int openCnt = 0;
        int closedCnt = 0;

        for(char c : sInput.toCharArray())
        {
            if(c == '(')
            {
                openCnt++;
            }
            else if(c == ')')
            {
                closedCnt++;
            }
        }

        return openCnt == closedCnt;
    }
}
