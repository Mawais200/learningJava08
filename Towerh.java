public class Towerh {
public static  void TowerofHanoi(int n,char src,char hel,char des){
if (n==1){
    System.out.println("Moves disc 1 from "+src+ "to" +des);
    return;
}
TowerofHanoi(n-1,src,des,hel);
System.out.println("Moves disc n from "+src+ "to" +hel);
TowerofHanoi(n-1,hel,src,des);
}
public static void main(String[] args){
    int n=3;
    TowerofHanoi(n,'S','H','D');

}
}
