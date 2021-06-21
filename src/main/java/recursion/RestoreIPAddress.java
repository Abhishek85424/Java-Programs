package recursion;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddress {
    public static void main(String[] args) {
        String str ="0123045";
        List<String> result = new ArrayList<>();
        if(str==null || str.length()<4 || str.length()>12)
            System.out.println(result);
        restoreIPAddressValue(str,"",0,result);

    }
    public static void restoreIPAddressValue(String s,String sub,int index,List<String> res)
    {
        if(index==4 || s.length()==0)
        {
            if(index == 4 && s.length() == 0)
            {
                System.out.println(sub.substring(0,sub.length()-1));
            }
            return;
        }
        restoreIPAddressValue(s.substring(1),sub+s.substring(0,1)+".",index+1,res);
        if(s.length()>1 && s.charAt(0) !=0)
        {
            restoreIPAddressValue(s.substring(2),sub+s.substring(0,2)+".",index+1,res);
            if(s.length()>2 && Integer.parseInt(s.substring(0,3))<=255)
            {
                restoreIPAddressValue(s.substring(3),sub+s.substring(0,3)+".",index+1,res);
            }
        }
    }
}
