import org.junit.Test;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 18229870721
 * @Date 2020/8/4 23:24
 **/
public class Test1 {
 //    输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
//    示例 1：
//    输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//    输出：[1,2,3,6,9,8,7,4,5]
//    示例 2：
//    输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//    输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 @Test
 public void spiralOrder(){
   
 }
 class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int x) { val = x; }
  TreeNode(int val, TreeNode left, TreeNode right) {
  this.val = val;
  this.left = left;
  this.right = right;
  }
 }
 //    给定一个二叉树，找出其最大深度。
//    二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
//    说明: 叶子节点是指没有子节点的节点。
//    示例：
//    给定二叉树 [3,9,20,null,null,15,7]，
//             3
//            / \
//           9  20
//             /  \
//            15   7
//    返回它的最大深度 3 。
 @Test
 public void maxDepth(){
          TreeNode root = new TreeNode(3);
          TreeNode root1 = new TreeNode(9);
          root.left = root1;
          TreeNode root2 = new TreeNode(20);
          root.right = root2;
          TreeNode root3 = new TreeNode(15);
          root2.left = root3;
          TreeNode root4 = new TreeNode(7);
          root2.right = root4;

 }
 // 给定一个二叉树，原地将它展开为一个单链表。(前序遍历)
// 例如，给定二叉树
//          1
//        / \
//       2   5
//     / \   \
//   3   4   6
// 将其展开为：
//     1
//     \
//     2
//     \
//     3
//     \
//     4
//     \
//     5
//     \
//     6
 @Test
 public void flatten(){

 }

// 你这个学期必须选修 numCourse 门课程，记为 0 到 numCourse-1 。
// 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们：[0,1]
// 给定课程总量以及它们的先决条件，请你判断是否可能完成所有课程的学习？
// 示例 1:
// 输入: 2, [[1,0]]
// 输出: true
// 解释: 总共有 2 门课程。学习课程 1 之前，你需要完成课程 0。所以这是可能的。
// 示例 2:
//
// 输入: 2, [[1,0],[0,1]]
// 输出: false
// 解释: 总共有 2 门课程。学习课程 1 之前，你需要先完成​课程 0；并且学习课程 0 之前，你还应先完成课程 1。这是不可能的。

// 提示：
// 输入的先决条件是由 边缘列表 表示的图形，而不是 邻接矩阵 。详情请参见图的表示法。
// 你可以假定输入的先决条件中没有重复的边。
//     1 <= numCourses <= 10^5
 @Test
public void canFinish(){

}
// 给定一个以字符串表示的非负整数 num，移除这个数中的 k 位数字，使得剩下的数字最小。
// 注意:
// num 的长度小于 10002 且 ≥ k。
// num 不会包含任何前导零。
// 示例 1 :
// 输入: num = "1432219", k = 3
// 输出: "1219"
// 解释: 移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219。
// 示例 2 :
// 输入: num = "10200", k = 1
// 输出: "200"
// 解释: 移掉首位的 1 剩下的数字为 200. 注意输出不能有任何前导零。
// 示例 3 :
// 输入: num = "10", k = 2
// 输出: "0"
// 解释: 从原数字移除所有的数字，剩余为空就是0。
 // 时间复杂度要小于等于num.length * k
@Test
public void removeKdigits(){

}
// 你打算利用空闲时间来做兼职工作赚些零花钱
// 这里有 n 份兼职工作，每份工作预计从 startTime[i] 开始到 endTime[i] 结束，报酬为 profit[i]。
// 给你一份兼职工作表，包含开始时间 startTime，结束时间 endTime 和预计报酬 profit 三个数组，请你计算并返回可以获得的最大报酬。
// 注意，时间上出现重叠的 2 份工作不能同时进行。
// 如果你选择的工作在时间 X 结束，那么你可以立刻进行在时间 X 开始的下一份工作。
// 示例 1：
// 输入：startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
// 输出：120
// 解释：
// 我们选出第 1 份和第 4 份工作，
// 时间范围是 [1-3]+[3-6]，共获得报酬 120 = 50 + 70。
@Test
 public void jobScheduling(){

 }

}
