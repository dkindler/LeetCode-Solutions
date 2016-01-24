// https://leetcode.com/problems/min-stack/
class MinStack {
    ArrayList<Integer> stack = new ArrayList<>();
    ArrayList<Integer> minStack = new ArrayList<>();

    public void push(int x) {
        if (minStack.size() > 0) {
            minStack.add(Math.min(getMin(), x));
        } else {
            minStack.add(x);
        }

        stack.add(x);
    }

    public void pop() {
        stack.remove(stack.size() - 1);
        minStack.remove(minStack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}
