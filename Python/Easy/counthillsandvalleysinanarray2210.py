class Solution(object):
    def countHillValley(self, nums):
        l=[nums[0]]
        count=0
        for i in range(1,len(nums)):
            if(nums[i]!=nums[i-1]):
                l.append(nums[i])
        print(l)
        for i in range(1,len(l)-1):
            if(l[i-1]>l[i] and l[i+1]>l[i]):
                count+=1
            elif (l[i-1]<l[i] and l[i+1]<l[i]):
                count+=1
        return count
