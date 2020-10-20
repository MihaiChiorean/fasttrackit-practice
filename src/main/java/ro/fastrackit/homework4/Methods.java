package ro.fastrackit.homework4;

public enum Methods implements FunctionTemplate {
    PRIME {
        @Override
        public int calculate(int value) {
            return value;
        }
        @Override
        public boolean calculateAndReturnBoolean(int value) {
            Boolean isPrime = true;
            if (value == 0 || value == 1) {
                isPrime = false;
            } else {
                for(int i = 2; i <= value / 2; ++i) {
                    if (value % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            return isPrime;
        }
    },
    FACTORIAL {
        @Override
        public int calculate(int value) {
            int factorial = 1;
            for(int i=1;i<=value; i++) {
                factorial = factorial*i;
            }
            return factorial;
        }
        @Override
        public boolean calculateAndReturnBoolean(int value) {
            return false;
        }
    },
    PALINDROME {
        @Override
        public int calculate(int value) {
            return value;
        }
        @Override
        public boolean calculateAndReturnBoolean(int value) {
            return false;
        }
    },
    ALLPRIME {
        @Override
        public int calculate(int value) {
            return value;
        }
        @Override
        public boolean calculateAndReturnBoolean(int value) {
            return false;
        }
    };
}