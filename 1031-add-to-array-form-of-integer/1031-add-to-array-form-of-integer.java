class Solution {
    public List<Integer> addToArrayForm(int[] A, int k) {
        int N = A.length;
        int cur =k;
        List<Integer> ans = new ArrayList();

        int i= N;
        while (--i>=0 || cur>0){
            if (i>=0)
            cur += A[i];
            ans.add(cur % 10);
            cur /=10;
        }
        Collections.reverse(ans);
        return ans;
    }
}