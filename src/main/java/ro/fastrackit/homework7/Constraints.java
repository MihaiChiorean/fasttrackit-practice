package ro.fastrackit.homework7;

public enum Constraints implements ValidateInteraface {
    CHARACTERS {
        @Override
        public Boolean validate(String password) {
            Integer howMany = 12;
            Integer count = 0;

            for (int i = 0; i < password.length(); i++) {
                if ((Character.isLetter(password.charAt(i)))) {
                    count++;
                }
                if(count == howMany) {
                    return true;
                }
            }

            if(count < howMany) {
                return false;
            }
            return true;
        }

        @Override
        public String notValidMessage() {
            return "Doesn't have enough characters";
        }
    },
    UPPERCASE {
        @Override
        public Boolean validate(String password) {
            Integer howMany = 1;
            Integer count = 0;

            for (int i = 0; i < password.length(); i++) {
                if ((Character.isUpperCase(password.charAt(i)))) {
                    count++;
                }
                if(count == howMany) {
                    return true;
                }
            }

            if(count < howMany) {
                return false;
            }
            return true;
        }
        @Override
        public String notValidMessage() {
            return "Doesn't contain uppercase letters";
        }
    },
    LOWERCASE {
        @Override
        public Boolean validate(String password) {
            Integer howMany = 1;
            Integer count = 0;

            for (int i = 0; i < password.length(); i++) {
                if ((Character.isLowerCase(password.charAt(i)))) {
                    count++;
                }
                if(count == howMany) {
                    return true;
                }
            }

            if(count < howMany) {
                return false;
            }
            return true;
        }
        @Override
        public String notValidMessage() {
            return "Doesn't contain lowercase letters";
        }
    },
    NOSYMBOLS {
        @Override
        public Boolean validate(String password) {
            Integer howMany = 1;
            Integer count = 0;

            for (int i = 0; i < password.length(); i++) {
                if ((!Character.isLetterOrDigit(password.charAt(i)))) {
                    count++;
                }
            }

            if(count < howMany) {
                return true;
            }
            return false;
        }
        @Override
        public String notValidMessage() {
            return "Password must not contains symbols";
        }
    },
    DIGITS {
        @Override
        public Boolean validate(String password) {
            Integer howMany = 3;
            Integer count = 0;

            for (int i = 0; i < password.length(); i++) {
                if ((Character.isDigit(password.charAt(i)) == true)) {
                    count++;
                }
                if(count == howMany) {
                    return true;
                }
            }

            if(count < howMany) {
                return false;
            }
            return true;
        }
        @Override
        public String notValidMessage() {
            return "Doesn't have enough digits";
        }
    };
}