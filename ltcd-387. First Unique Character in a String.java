class Solution {
    public int firstUniqChar(String s) {
        int a=0;
        char b[]=s.toCharArray();
        
        for(char c:b){
            if(s.indexOf(c)==s.lastIndexOf(c)){
                a=s.indexOf(c);
                break;
            }
            else{
                a=-1;
            }
        }
        return a;
    }
}