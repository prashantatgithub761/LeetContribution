class Solution {

    public String smallestPalindrome(String s, int k) {

        int[] cnt = new int[26];

        for(char c : s.toCharArray())
            cnt[c-'a']++;

        String mid = "";

        for(int i=0;i<26;i++){
            if((cnt[i]&1)==1){
                mid = String.valueOf((char)('a'+i));
            }
            cnt[i]/=2;
        }

        int m = s.length()/2;

        StringBuilder left = new StringBuilder();

        for(int pos=0;pos<m;pos++){

            boolean found = false;

            for(int c=0;c<26;c++){

                if(cnt[c]==0)
                    continue;

                cnt[c]--;

                long ways = count(cnt, k);

                if(ways>=k){
                    left.append((char)('a'+c));
                    found = true;
                    break;
                }

                k-=ways;
                cnt[c]++;
            }

            if(!found)
                return "";
        }

        StringBuilder ans = new StringBuilder();

        ans.append(left);
        ans.append(mid);
        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }

    long count(int[] cnt,int limit){

        int total=0;

        for(int x:cnt)
            total+=x;

        long res=1;

        int rem=total;

        for(int f:cnt){

            if(f==0)
                continue;

            res*=comb(rem,f,limit);

            if(res>limit)
                return limit;

            rem-=f;
        }

        return res;
    }

    long comb(int n,int r,int limit){

        r=Math.min(r,n-r);

        long ans=1;

        for(int i=1;i<=r;i++){

            ans=ans*(n-r+i)/i;

            if(ans>limit)
                return limit;
        }

        return ans;
    }
}
