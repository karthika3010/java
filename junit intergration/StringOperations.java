public class StringOperations
{
    public int getLength(String str)
    {
        return str.length();
    }

    public String reverse(String str)
    {
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public String toUpper(String str)
    {
        return str.toUpperCase();
    }
}