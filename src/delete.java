//delete the string from the begin index to end index using string buffer class
public class delete {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("hello");
        sb.delete(0,3);
        System.out.println(sb);
    }
}//output:- lo
