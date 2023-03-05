class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int res = 0;
        for(int i=1;i<=input;i++){
            res += i;
        }
        res = square(res);
        return res;
    }

    int computeSumOfSquaresTo(int input) {
        int res = 0;
        for(int i=1;i<=input;i++){
            res += square(i);
        }
        return res;
    }

    int computeDifferenceOfSquares(int input) {
        int res = computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
        return res;
    }

    int square(int input) {
        return input * input; 
    }

    int squareN(int input, int n) {
        int res = input;
        for(int i=1;i<n;i++){
            res *= res;
        } 
        return res;
    }

}
