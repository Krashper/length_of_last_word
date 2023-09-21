class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        String last_word = words[words.length -1];
        int result = last_word.length();
        return result;
    }
}
