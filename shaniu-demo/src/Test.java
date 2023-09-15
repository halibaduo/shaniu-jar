import java.util.Arrays;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {

        // 冒泡排序
//        int[] nums = new int[]{1,4,2,6,32,8,2,8,13,456,97};
//        for(int i = 0; i < nums.length - 1; i++) {
//            for(int j = 0; j < nums.length - i - 1; j++) {
//                if(nums[j] >= nums[j+1]) {
//                    int temp = nums[j+1];
//                    nums[j+1] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + ",");
//        }


        // 保留小数数
//        DecimalFormat ft = new DecimalFormat("#.00");
//        double num = 1.23456;
//        System.out.println(ft.format(num));
//
//        double num1 = 1.245;
//        System.out.println(Math.round(num1)); // 保留整数位 四舍五入

        // 数组下标的最大值
//        int[][] nums = new int[999999999][999999999];
//        int[][] nums = new int[9][9];
//        for (int[] num : nums) {
//            System.out.println(num.length + ",");
//        }

        // 极大的值的表示以及比较大小
//        BigDecimal a = new BigDecimal("123456789987654321");
//        BigDecimal b = new BigDecimal("1234567899876543211");
//
//        System.out.println(a.compareTo(b));  // a大返:1 一样大:返0 a小返-1

        // 整数的最大值
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);

        // 二分法查找
        int[] nums = new int[]{1,4,2,6,4,8,5,9,32,76,9,17};
        Arrays.sort(nums);
        for (int num :nums) {
            System.out.print(num + ",");
        }
        binarySearch(nums, 0, nums.length-1, 32);

        // 向量Vector相比List只是更加安全 但性能较差
//        Vector<Integer> vector = new Vector<>();  // 蕴含的方法与List一样
//        vector.add(1);
//        vector.add(2);
//        vector.add(3);
//        System.out.println(vector);
//        System.out.println(vector.get(1));
//        System.out.println(vector);
//        vector.remove(1);
//        System.out.println(vector);
        // 位运算的常使用方式
        // * 判断奇偶性
//        int a = 21; // 奇数
//        int b = 28; // 偶数
//        if ((b & 1) == 0) {
//            System.out.println("b是偶数");
//        }
//        if ((a & 1) == 1){
//            System.out.println("a是奇数");
//        }

        // * 当求平均值的数相加后会大于int的最大取值的时候 采用一下方法求平均值
//        int a = 999999998;
//        int b = 999999998;
////        int c = (a+b)/2;
//        int c = (a&b)+(a^b); // 求平均值
//        System.out.println(c);

        // 交换值
//        int a = 2, b = 5;
//        a ^= b;
//        b ^= a;
//        a ^= b;
//        System.out.println("a="+a+",b="+b);

        
    }
    static void binarySearch(int[] nums, int start, int end, int target) { // 二分法查找
//        int left = 0;
//        int right = nums.length - 1;
        int mid = (start + end) / 2;
        if (nums[mid] > target) {
           end = mid - 1;
           binarySearch(nums, start, end, target);
        }else if (nums[mid] < target) {
            start = mid;
            binarySearch(nums, start, end, target);
        } else {
            System.out.println("找到了,是第"+(mid+1)+"个");  // mid是下标
        }
    }
}
