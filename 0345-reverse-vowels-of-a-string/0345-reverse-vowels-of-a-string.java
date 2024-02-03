class Solution {
    public String reverseVowels(String s) {
        char[] sArray = s.toCharArray();

        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Integer> sIndex = new ArrayList<>();
        List<Integer> vIndex = new ArrayList<>();
        for (int i = 0; i < sArray.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (sArray[i] == vowels[j]) {
                    sIndex.add(i);
                    vIndex.add(j);
                }
            }
        }

        for (int i = 0; i < sIndex.size(); i++) {
            sArray[sIndex.get(i)] = vowels[vIndex.get(vIndex.size()-i-1)];
        }
        
        return String.valueOf(sArray);
    }
}