package ro.fastrackit.homework4;

public enum Methods implements FunctionTemplate {
    PRIME {
        @Override
        public boolean calculateAndReturnBoolean(int value, int value2) {
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
        public int calculate(int value, int value2) {
            int factorial = 1;
            for(int i=1;i<=value; i++) {
                factorial = factorial*i;
            }
            return factorial;
        }
    },
    PALINDROME {
        @Override
        public int calculate(int value, int value2) {
            int r,sum=0,temp;
            int n=value;

            temp=n;
            while(n>0){
                r=n%10;  //getting remainder
                sum=(sum*10)+r;
                n=n/10;
            }
            if(temp==sum) {
                System.out.println("It's a palindrome number ");
                return sum;
            } else {
                System.out.println("It's not a palindrome");
                return sum;
            }
        }
    },
    ALLPRIME {
        @Override
        public String calculateAndReturnString(int value, int value2) {
            if(value == 0) {
                return "0";
            } else if (value == 1) {
                return "0, 1";
            } else {
                String result = "0, 1";
                for(int i = 2; i <= value / 2; ++i) {
                    if (value % i == 0) {
                        result = result +", " + i;
                    }
                }
                return result;
            }
        }
    },
    ALLDAYS {
        @Override
        public String calculateDaysOfAMont(int month, int year) {
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                return "Number of days is 31";
            else if((month == 2) && ((year%400==0) || (year%4==0 && year%100!=0)))
            {
                return "Number of days is 29";
            }
            else if(month == 2)
            {
                return "Number of days is 28";
            }
            else
                return "Number of days is 30";
        }
    };

    @Override
    public int calculate(int value, int value2) {
        return value;
    }

    @Override
    public String calculateDaysOfAMont(int value, int value2) {
        return "";
    }

    public boolean calculateAndReturnBoolean(int value, int value2) {

        return false;
    }

    @Override
    public String calculateAndReturnString(int value, int value2) {
        return "";
    }
}