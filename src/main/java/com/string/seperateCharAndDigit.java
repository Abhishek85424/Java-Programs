package com.string;

class seperateCharAndDigit
{
    public static void main(String args[])
    {
        String str = "123AM256CD";
        StringBuilder sDigit = new StringBuilder();
        StringBuilder sChar = new StringBuilder();
        for(int index =0;index<str.length();index++)
        {
            char chr = str.charAt(index);
            if(Character.isDigit(chr))
            {
                sDigit.append(String.valueOf(chr));
            }
            else
            {
                sChar.append(chr);
            }

        }
        System.out.println(String.format("Only Digit : %s",sDigit));
        System.out.println(String.format("Only Char : %s",sChar));
    }
}
