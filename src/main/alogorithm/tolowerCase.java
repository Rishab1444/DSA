class Solution {
    public String toLowerCase(String s) {
        HashMap <Character,Character> alpha = new HashMap();
        for(char i ='a';i<='z';i++){
            alpha.put(Character.toUpperCase(i),i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            sb.append(alpha.containsKey(c)?alpha.get(c):c);
        }
        return sb.toString();
    }
}