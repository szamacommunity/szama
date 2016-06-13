package biz.golek.daotools;

/**
 * Created by bgolek on 2016-06-13.
 */
public class SQLFunction
{
    public static String getMinOf(String value, String value2)
    {
        return "CASE WHEN " + value + " < " + value2 + " THEN " + value + " ELSE " + value2 + " END";
    }

    public static String getMaxOf(String value, String value2)
    {
        return "CASE WHEN " + value + " > " + value2 + " THEN " + value + " ELSE " + value2 + " END";
    }

    public static String ifNull(String value, String defaultValue)
    {
        return "CASE WHEN " + value + " IS NULL THEN " + defaultValue + " ELSE " + value + " END";
    }

    public static String isNull(String value)
    {
        return value + " IS NULL";
    }

    public static String ternary(String condition, String trueValue, String falseValue)
    {
        return "CASE WHEN " + condition + " THEN " + trueValue + " ELSE " + falseValue + " END";
    }

    public static String daysOf(String value)
    {
        return "(" + value + " / 1000 / 60 / 60 / 24)";
    }

    public static String add(String... values)
    {
        String result = "";
        for (String value : values) {
            if (result != "")
                result += " + ";

            result += value;
        }

        return result;
    }

    public static String subtract(String... values)
    {
        String result = "";
        for (String value : values) {
            if (result != "")
                result += " - ";

            result += value;
        }

        return result;
    }

    public static String multiply(String... values)
    {
        String result = "";
        for (String value : values) {
            if (result != "")
                result += " * ";

            result += value;
        }

        return result;
    }

    public static String divide(String... values)
    {
        String result = "";
        for (String value : values) {
            if (result != "")
                result += " / ";

            result += value;
        }

        return result;
    }

    public static String mod(String... values)
    {
        String result = "";
        for (String value : values) {
            if (result != "")
                result += " % ";

            result += value;
        }

        return result;
    }
}