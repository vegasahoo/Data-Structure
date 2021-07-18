package Array;

public class FindCelebrity {


    boolean knows(char a, char b){
        if(b=='z'){
            return true;
        }
        return false;
    }

    char findCeleb(char[] person){
        char cel = person[0];
        for (int i = 1; i < person.length; i++) {
            if(person[i]!=cel && knows(cel,person[i])){
                cel = person[i];
            }
        }
        for(int i =0; i<person.length;i++){
            if(cel != person[i] && !knows(person[i],cel)){
                return 'k';
            }
        }
        return cel;
    }

    public static void main(String[] args) {
        char[] person = new char[]{'a',
                'b',
                'c',
                'd',
                'e',
                'f',
                'g',
                'h',
                'i'};
        FindCelebrity fc = new FindCelebrity();
        System.out.println(fc.findCeleb(person));
    }



}
