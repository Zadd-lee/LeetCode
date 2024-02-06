class Solution {
    public String reverseWords(String s) {
        s=s.strip();
        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList(s.split(" ")));

        for (int i = words.size()-1; i >=0; i--) {
            if (words.get(i).length()==0) {
                words.remove(i);
            }
        }

        StringBuffer buf = new StringBuffer();
        for (int i = words.size() - 1; i >= 0; i--) {
            buf.append(words.get(i));
            if (i != 0) {
                buf.append(' ');
            }
        }
        return buf.toString();
    }
}