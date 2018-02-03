class Solution {
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        char temp = ' ';
        
        for(int i=0; i<J.length(); i++){
            temp = J.charAt(i);
            for(int j=0; j<S.length(); j++){
                if(temp == S.charAt(j)){
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String J = input.nextLine();
        String S = input.nextLine();
        
        System.out.println(numJewelsInStones(J,S));
    }
}