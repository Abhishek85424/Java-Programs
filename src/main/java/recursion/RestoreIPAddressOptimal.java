package recursion;


import javax.swing.text.InternationalFormatter;
import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddressOptimal {
    public static void main(String[] args) {
        String str ="101023"; // 0123045
        List<String> result = new ArrayList<>();
        if(str==null || str.length()<4 || str.length()>12)
            System.out.println(result);
        restoreIPAddressValue(str,0,0,"");

    }
    public static void restoreIPAddressValue(String str,int start,int dotCount,String currentIP)
    {
       if(dotCount==4 && (start == str.length()))
       {
           System.out.println(currentIP.substring(0,currentIP.length()-1));
           return;
       }
       if(dotCount>4)
           return;
       for(int i = start; i< Integer.min(start+3,str.length()); i++)
       {
           if((Integer.parseInt(str.substring(start,i+1))<256) && (start==i || str.charAt(start)!='0'))
               restoreIPAddressValue(str,i+1,dotCount+1,currentIP+str.substring(start,i+1)+".");
       }
    }
}
