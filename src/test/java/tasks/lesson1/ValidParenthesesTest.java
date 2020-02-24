package tasks.lesson1;

import javafx.util.Pair;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
    private void check(String p, boolean ans){
        assertEquals("\"" + p + "\" should be " + (ans ? "valid": "not valid"),
                ValidParentheses.checkValidness(p), ans);
    }
    @Test
    public void checkValidness() {
        check("()", true);
        check("[]", true);
        check("{}", true);
        check("([{}])", true);
        check("(){}[]", true);
        check("((([{([{}])}])))", true);
        check("()[{()}]([{}[]()])", true);
        check("()()()()()", true);
        check("{()[](){(){}[()]}}", true);
        check("(", false);
        check("(]", false);
        check(")(", false);
        check("}{", false);
        check("([[])", false);
        check("([)]", false);
        check("{([)(])}", false);
        check("[(((()))))]", false);
        check("", true);
    }
}