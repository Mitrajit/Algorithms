# The problem is well defined in hackerrank. https://www.hackerrank.com/challenges/board-cutting/problem

#
# Complete the 'boardCutting' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY cost_y
#  2. INTEGER_ARRAY cost_x
#


def boardCutting(cost_y, cost_x):
    mincost = 0
    cuts = [1, 1]
    cost_y.sort(reverse=True)
    cost_x.sort(reverse=True)
    ypointer = 0
    xpointer = 0
    for i in range(len(cost_y) + len(cost_x)):
        if (
            xpointer == len(cost_x)
            or ypointer < len(cost_y)
            and cost_y[ypointer] > cost_x[xpointer]
        ):
            mincost += cuts[1] * cost_y[ypointer]
            cuts[0] += 1
            ypointer += 1
        else:
            mincost += cuts[0] * cost_x[xpointer]
            cuts[1] += 1
            xpointer += 1
    return mincost % (10 ** 9 + 7)


if __name__ == "__main__":

    q = int(input().strip())

    for q_itr in range(q):
        first_multiple_input = input().rstrip().split()
        m = int(first_multiple_input[0])
        n = int(first_multiple_input[1])
        cost_y = list(map(int, input().rstrip().split()))
        cost_x = list(map(int, input().rstrip().split()))
        result = boardCutting(cost_y, cost_x)
        print("Mincost: ", result)
