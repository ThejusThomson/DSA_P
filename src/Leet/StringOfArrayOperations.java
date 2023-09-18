package Leet;

public class StringOfArrayOperations {
    public static void main(String[] args) {

        String[] operations = new String[] {"--X","X++","X++", "X--"};
        int x = 0;
        for(int i=0; i < operations.length; i++){
            if(operations[i].contains("+")){
                x+=1;
            }
            if(operations[i].contains("-")){
                x-=1;
            }
        }
        System.out.print(x);
    }
}
