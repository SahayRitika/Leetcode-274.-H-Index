class Solution {
    public int hIndex(int[] citations) {
        // Step 1: Sort the citations array in descending order
        Arrays.sort(citations);
        int n = citations.length;
        
        // Step 2: Iterate through the sorted array to find the h-index
        int hIndex = 0;
        for (int i = n - 1; i >= 0; i--) {
            int papersWithAtLeastH = n - i;
            if (citations[i] >= papersWithAtLeastH) {
                hIndex = Math.max(hIndex, papersWithAtLeastH);
            } else {
                break; // No need to check further as the array is sorted
            }
        }
        
        // Step 3: Return the maximum h-index found
        return hIndex;
    }
}
