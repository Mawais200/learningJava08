public class Reverse {
    public static void reverse(String str,int ind){
        if(ind==0){
            System.out.println(str.charAt(ind));
            return;
        }
        System.out.println(str.charAt(ind));
        reverse(str, ind-1);
    }
        public static void main(String[] args){
            String str="abcd";
            reverse(str, str.length()-1);

        

    }
}
