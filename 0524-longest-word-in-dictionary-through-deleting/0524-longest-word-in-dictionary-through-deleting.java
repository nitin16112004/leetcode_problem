class Solution {
    public String findLongestWord(String s, List<String> dictionary) 
    {
        int n = s.length();
        List<String> ans = new ArrayList<>();

        for(String cur : dictionary)
        {
            if(cur.length() <= n && check(cur, s))
            {
                if(ans.isEmpty() || ans.get(0).length() == cur.length())
                {
                    ans.add(cur);
                }
                else if(cur.length() > ans.get(0).length())
                {
                    ans.clear();
                    ans.add(cur);
                }
            }
        }

        if(ans.isEmpty())
        {
            return "";
        }
        
        Collections.sort(ans);

        return ans.get(0);
    }

    boolean check(String cur, String s)
    {
        int n = cur.length();
        int ind = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == cur.charAt(ind))
            {
                ind++;
                if(ind == n)
                {
                    return true;
                }
            }
        }

        return false;
    }
}