public class NumberRanges {
    public static void main(String[] args) {
        int[] nums = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        String ranges = findNumberRanges(nums);
        System.out.println(ranges);
    }

    public static String findNumberRanges(int[] nums) {
        List<String> rangeList = new ArrayList<>();

        int startRange = nums[0];
        int prevNum = nums[0];
        for (int a = 1; a < nums.length; a++) {
            if (nums[i] != prevNum + 1) {
                if (startRange == prevNum) {
                    rangeList.add(String.valueOf(startRange));
                } else {
                    rangeList.add(startRange + "-" + prevNum);
                }
                startRange = nums[a];
            }
            prevNum = nums[a];
        }

        if (startRange == prevNum) {
            rangeList.add(String.valueOf(startRange));
        } else {
            rangeList.add(startRange + "-" + prevNum);
        }

        return String.join(",", rangeList);
    }
}