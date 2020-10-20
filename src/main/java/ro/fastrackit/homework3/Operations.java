package ro.fastrackit.homework3;

public enum Operations implements FunctionsTemplate{
    ADD {
        @Override
        public int calculate(int one, int second) {
            return one + second;
        }
    },
    SUBTRACT {
        @Override
        public int calculate(int one, int second) {
            return one - second;
        }
    },
    MULTIPLY {
        @Override
        public int calculate(int one, int second) {
            return one * second;
        }
    },
    DEVIDE {
        @Override
        public int calculate(int one, int second) {
            return one/second;
        }
    };
}
