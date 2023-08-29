class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List <Integer> a = new ArrayList();
        while(left<=right){
            if(selfDivide(left)){
                a.add(left);
            }
            left ++;
        }
        return a;
    }
    public boolean selfDivide(int n){
        int x = n;
        while(x > 0){
            int d = x %10;
            x = x / 10;
            if(d == 0 || (n%d) > 0)
                return false;
           
        }
         return true;
    }
}