import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class BracketBalancer {

    private static Map<Character, Character> brackets = new HashMap<Character, Character>() {{
        put('{', '}');
        put('[', ']');
        put('(', ')');
    }};

    private BracketBalancer() {
    }

    public static boolean isBalanced(String toCheck) {
        if (StringUtils.isBlank(toCheck)) {
            return true;
        }
        List<Character> openBracketsToBeMatched = new ArrayList<Character>(toCheck.length());
        for (int i = 0; i < toCheck.length(); i++) {
            char charToConsider = toCheck.charAt(i);
            if (thisIsAnOpenBracket(charToConsider)) {
                openBracketsToBeMatched.add(charToConsider);
            } else if (thisIsACloseBracket(charToConsider)) {
                if (!openBracketsToBeMatched.isEmpty()) {
                    Character lastOpenBracket = openBracketsToBeMatched.get(openBracketsToBeMatched.size() - 1);
                    if (brackets.get(lastOpenBracket) == charToConsider) {
                        openBracketsToBeMatched.remove(openBracketsToBeMatched.size() - 1);
                    } else
                        return false;

                }  else {
                    return false;
                }
            }
        }
        return openBracketsToBeMatched.isEmpty();
    }

    private static boolean thisIsACloseBracket(char charToConsider) {
        return brackets.containsValue(charToConsider);
    }

    private static boolean thisIsAnOpenBracket(char charToConsider) {
        return brackets.containsKey(charToConsider);
    }
}

