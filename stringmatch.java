import java.io.BufferedReader;
import java.io.InputStreamReader;


class stringmatch {
       public static void main(String a[])throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int no=Integer.parseInt(in.readLine()),len,count=0;
        String str,str1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<no;i++)
        {
            str=in.readLine();
            str1=in.readLine();
           
            if(str1.length()>str.length())
                len=str.length();
            else
                len =str1.length();
            for(int j=0;j<len;j++)
            {
                    if(str.charAt(j)==str1.charAt(j))
                        count++;
                
            }
            sb.append(count+"\n");
               count=0;
           
        }
        System.out.println(sb);
    }
    
}
