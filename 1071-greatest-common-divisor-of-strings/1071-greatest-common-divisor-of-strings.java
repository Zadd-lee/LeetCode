class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int m = str1.length(), n = str2.length();
        int gcd = gcd(m, n);
        String t = new StringBuffer(str2).substring(0,gcd);
        for (int i = 0; i < m;) {
            if (str1.startsWith(t,i) == false) return "";
            i += gcd;
        }
        for (int i = 0; i < n;) {
            if (str2.startsWith(t,i) == false) return "";
            i += gcd;
        }
        return t;
    }
    private int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a % b);
    }
}