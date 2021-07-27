from typing import List # Not needed for leetcode editor
# Time complexity O(N^2)
class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        ans = float('inf')
        for i in range(len(nums)-2):
            # To omit repeated numbers
            if i>0 and nums[i-1] == nums[i]:
                continue
            # Getting the range of summation that can be generated
            minsum = nums[i] + nums[i+1] + nums[i+2]
            maxsum = nums[i] + nums[-1] + nums[-2]
            if minsum >= target:
                if abs(minsum-target) >= abs(ans-target):
                    return ans
                else:
                    return minsum
            if maxsum < target:
                if abs(maxsum-target) < abs(ans-target):
                    ans = maxsum
                continue
            left, right = i+1, len(nums)-1
            while left < right:
                thsum = nums[i] + nums[left] + nums[right]
                if abs(thsum - target) < abs(ans - target):
                    ans = thsum
                if thsum == target:
                    return thsum
                elif thsum < target:
                    left += 1
                    # To omit repeated numbers
                    while left < len(nums)-1 and nums[left-1] == nums[left]:
                        left += 1
                else:
                    right -= 1
                    # To omit repeated numbers
                    while right > i and nums[right+1] == nums[right]:
                        right -= 1
        return ans
