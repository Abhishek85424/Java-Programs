package com.string;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvalidTag {
    public static void main(String[] args) {
        String str = "<h1>Richa loves counseling</h1><h1><h1>Rishi has no watch</h1></h1><par>So wait for a while</par><Amee>Gaurav codes like a ninja</amee><SA premium>Pratap has a secret game</SA premium>";
        Matcher matcher,endMatcher;
        matcher = Pattern.compile("<\\w*\\s*\\w*\\d*>").matcher(str);
        endMatcher = Pattern.compile("</\\w*\\s*\\w*\\d*>").matcher(str);
        while (matcher.find() && endMatcher.find()) {
            // Get the first index of match result
            if(!matcher.group().equals(endMatcher.group().replace("/","")))
                str = str.substring(0,matcher.start())+"\nNone\n"+str.substring(endMatcher.end());
        }
        str = str.replaceAll("<\\w*\\s*\\w*\\d*>","");
        str = str.replaceAll("<.\\w*\\s*\\w*\\d*>","\n");
        for(String line: str.split("\n") )
        {
            if(!line.isBlank())
                System.out.println(line);
        }
    }
}
