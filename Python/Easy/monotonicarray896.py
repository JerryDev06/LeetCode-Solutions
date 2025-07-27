class Solution(object):
    def isMonotonic(self, nums):
        ori = sorted(nums)
        rev = ori[::-1]
        if(ori==nums or nums==rev):
            return True
        else:
            return False
