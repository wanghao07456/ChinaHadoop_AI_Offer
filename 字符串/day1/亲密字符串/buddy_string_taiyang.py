class Solution:
    """
    @param A: string A
    @param B: string B
    @return: bool
    """
    def buddyStrings(self, A, B):
        # Write your code here
        if A is None or B is None or len(A) != len(B):
            return False
        if A == B and len(set(A)) < len(A):
            return True
        l, r, diff = 0, len(A) - 1, []
        while l < r:
            while l < r and A[l] == B[l]:
                l += 1 
            while l < r and A[r] == B[r]:
                r -= 1 
            if l < r:
                diff.append((A[l], B[l]))
                diff.append((A[r], B[r]))
                l += 1 
                r -= 1 
        if len(diff) == 2 and diff[0] == diff[1][::-1]:
            return True
        return False