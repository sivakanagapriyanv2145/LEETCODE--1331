class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int i,j;
        int a[]=new int[arr.length];
        int b[]=new int[arr.length];
        for(i=0;i<arr.length;i++)
        {
            b[i]=1;
        }
        for(i=0;i<arr.length;i++)
        {
            a[i]=arr[i];
        }
        Arrays.sort(a);
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length;j++)
            {
                if(j==0){
                    if(arr[i]>a[j]){
                        b[i]++;
                    }
                }
                else if(a[j]==a[j-1]){
                    continue;

                }
                else if(arr[i]>a[j]){
                    b[i]++;
                }
            }
        }
        return b;
        
    }
}
