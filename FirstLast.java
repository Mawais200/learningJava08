public class FirstLast {
    public static int first=-1;
    public static int last=-1;

    public static void occurrence(String str,int idx,char ele){
if(idx==str.length()){
    System.out.println(first);
    System.err.println(last);
    return;
}
char curr = str.charAt(idx);
if(curr==ele){
    if(first==-1){
        first=idx;

    }else{
        last=idx;
    }

}
occurrence(str, idx+1, ele);
    }
    public static void main(String[] args){
        String str="abcdefa";
        occurrence(str, 0, 'a');
    }
}
