package tech.bhagavati.regex;

public class Regex1 {

    public static void main(String[] args) {
        String name = "System Generated >><</ IO 2013-12-01";
        String pattern = "[^[\\p{L}\\p{Z}\\p{P}\\p{N}\\p{M}\\p{S}\\-\\']&&[\\<\\>\\\\\\/]]+";
        String output = name.replaceAll(pattern, "");
        System.out.println(output);
    }
}
