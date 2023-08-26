# 1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

### Example 1:
```sh
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
```
### Example 2:
```sh
Input: nums = [3,2,4], target = 6
Output: [1,2]
```
### Example 3:
```sh
Input: nums = [3,3], target = 6
Output: [0,1]
```

### Constraints:
```sh
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
```

### Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
> yes, we can use a hashmap to store the difference between target and current element. 
> If the difference is already present in the hashmap, we have found the pair. 
> This will reduce the time complexity to O(n).

### Solution:
```java
package com.jaggernaute.mochaPaws.aaaaTwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimized {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}
```