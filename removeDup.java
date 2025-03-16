public class removeDup {
    public static boolean map[]=new boolean[26];
    public static void remove(String str,int idx, StringBuilder newString){
        if (idx==str.length()) {
            System.out.println(newString);
            return;
            
        }
        char curr=str.charAt(idx);
        if(map[curr-'a']==true){
            remove(str, idx+1, newString);
        }
        else
        {
            newString.append(curr);
            map[curr-'a']=true;
            remove(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str="abccdd";
        // Reset the map array before calling remove
        map = new boolean[26];
        remove(str, 0, new StringBuilder());
    }
}
